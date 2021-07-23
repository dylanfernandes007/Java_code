package day6;

public class IfElse {//day6

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//check whether number is even
		//num%2 == 0
		
		int num=10;
	/*	if(num%2==0)
			System.out.println("number: " +num+ " is an even number");// if not using curly braces only one 
																	//statement will be considered to be part of if block
			System.out.println("Hello1");// Hello printed
		
		if(num%2==0)
		{
				System.out.println("number: " +num+ " is an even number");
				System.out.println("Hello2");//Hello not printed
		}
		
		*/
/*
		if(num%2==0)// either if or else, only one will be executed
		{
				System.out.println("number is even");
		}
		else  // always have if before else
		{
			System.out.println("number is odd");
		}	
		
			*/
		
	//write to check if single digit, 2 digit , 3 digit or more than 3 digit	
		if(num<10)
		{
			System.out.println("Number is single digit");
		}
		
		else if (num>9 && num<100)
		{
			System.out.println("Number is 2 digit");
		}
		else if (num>99 && num<1000)
			
		{
			System.out.println("Number is 3 digit number");
		}
		else if (num>999)
		{
			System.out.println("Number is more than 3 digit");
		}
	}

}
