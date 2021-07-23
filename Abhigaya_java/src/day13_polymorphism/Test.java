package day13_polymorphism;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1 = new Test();
		t1.add(10, 20,30);
		t1.add(20, 30);
		t1.add(10, 20.5);
		t1.add(20.5,10);
		
	}

	
	public void add(int a, int b)// if functionality is same, method name is also same. Reason for having add as method everywere
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public int add(int a, int b, int c)  // this is overloading, retrun type doesnt have any effect in overloading
	{
		return a+b;
	}
	public void add(int i, double d)
	{
		
	}
	public void add(double d, int i)
	{
		
	}
}
