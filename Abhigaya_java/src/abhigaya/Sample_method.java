package abhigaya;

public class Sample_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample_method s = new Sample_method();
		s.add(10, 20);
		s.sub(10, 20);
		s.mul(10, 20);
		s.div(10, 20);
		
	}

	
	/*Using scanner class
	 public static void main(String[] args) {
	 Scanner scan = new  Scanner(System.in);
	 System.out.println("please enter first no");
	 int var1=scan.nextInt();
	 System.out.println("please enter second no");
	 int var2=scan.nextInt();	 
	 		// TODO Auto-generated method stub

		Sample_method s = new Sample_method();
		s.add(var1, var2);
		
	}
*/
	public void add(int a, int b)
	{
		int result=a+b;
		System.out.println(result);
	}
	public void sub(int a , int b)
	{
		int result=a-b;
		System.out.println(result);
	}
	public void mul(int a , int b)
	{
		int result=a*b;
		System.out.println(result);
	}
	public void div(int a , int b)
	{
		int result=a/b;
		System.out.println(result);
	}
}
