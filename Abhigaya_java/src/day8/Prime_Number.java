package day8;

public class Prime_Number {//day 8

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime_Number  p= new Prime_Number();
	     boolean result= p.isPrime(37);
	     System.out.println("The number entered is prime: " +result);
	}
	
	public boolean isPrime(int num)
	{
		if(num==1 || num==2)// check for 33, 63 etc.
			 return true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			 return false;
		}
	
		return true;// you have to write. 
	}

}
