package day7;

public class BreakAndContinue {//day 7

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//break-- when break gets executed, it transfers the execution outside the switch or loop where you have used it
 //continue--loops--when continue will get executed, it will transfer the execution to the next iteration, //it will skip the current iteration
		
		/*for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.println("i-->"+i+" j--> " +j);
			}
		}
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)                       
				{
					break;
				}
				
				System.out.println("i-->"+i+" j--> " +j);
i-->1 j--> 1
i-->2 j--> 1
i-->3 j--> 1

			}
		}
		*/
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)                       
				{
					continue;//it will skip the current iteration
				}
				
				System.out.println("i-->"+i+" j--> " +j);

			}
		}
	}

}
