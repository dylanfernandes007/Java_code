package day13_polymorphism;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		//s.sum(10, 20);  // when calling a method, we use method name and args not return type hence return type is of no value
	}
		public void sum(int a, int b)
		{
			System.out.println(a+b);
		}
		public int sum(int a, int b, int c)// wont work even if u use diff variable names
		{
			return a+b;
		}
		
}
