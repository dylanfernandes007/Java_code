package day6;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=1;
        
        
		while(i<=10)//infinite loop, only 1 will print infinitely// keep iterating until condition is false
		{
			System.out.println(i);
			
		}
		
		while(i<=10) //print 1-10
		{
			System.out.println(i);
			++i;//even ++i will give same result
		}
	//difference between for and while. For loop is used only when you know the number of iterations
	}

}
