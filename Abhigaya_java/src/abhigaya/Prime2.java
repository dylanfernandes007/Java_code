package abhigaya;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int num = 33;
		        boolean flag = false;
		        for(int i = 2; i <= num/2; ++i)
		        {
		            // condition for nonprime number
		            if(num % i == 0)
		            {
		                flag = true;
		                break;
		            }
		        }

		        if (!flag)
		            System.out.println(num + " is a prime number.");
		        else
		            System.out.println(num + " is not a prime number.");
		    }
}

