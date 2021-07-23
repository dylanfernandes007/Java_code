package day14_poly_wrapper_overriding;

public class Dog extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	protected void sound()
	{
		System.out.println("woof woof");
	}
	public int sum()// if you write short, it will give error as its primitive data type, cannot change return type
	
	{
		return 10+200;
	}
	public Dog getObject()  // this is covariant as animal is using animal and dog is using dog return types
	{
		return new Dog();  // you can use Dog here 
	}
	
	/*public Dog getObject()  // dont use void or Dog: compile error
	{
		return new Animal();  // you cant use Animal here 
	}
	*/
	public Integer m1()  // tis is also covariant// remember number will be in parent class and Integer in child class for covariant
	{
		 return 10;
	}
}

