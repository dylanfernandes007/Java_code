package day7;

public class SwitchCase {//day7

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 3;
		switch(day)// byte,short,int.char, String, enum, cannot pass boolean
		{
		 case 5:
			 System.out.println("FRiday");
			 break;
		 case 1:
			 System.out.println("Monday");
			 break;
		 case 2: 
			 System.out.println("Tuesday");
			 break;
		 case 3: 
			 System.out.println("Wednesday"); // if break is not used, then all statements will be executed from where it matched
			 break;
		 case 4: 
			 System.out.println("Thursday");
			 break;
		 case 6:
			 System.out.println("Saturday");
			 break;
		 case 7:
			 System.out.println("Sunday");
			 break;
		  default: 
			  System.out.println("None of these cases match");// default block executed if none of the cases match
		}
	}
	

}
