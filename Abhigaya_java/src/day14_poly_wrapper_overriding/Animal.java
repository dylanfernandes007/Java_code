package day14_poly_wrapper_overriding;

public class Animal {

	void sound()
	{
		System.out.println("generic sound");
	}

	public int sum()
	{
		return 10+20;
	}
	public Animal getObject()  
	{
		return new Animal();
	}
	public Number m1()  // You can use int, Integer, Number 
	//Number class is parent class of first 6 wrapper classes 
	// remember number will be in parent class and Integer in child class for covariant
	{
		 return 10;
	}
}
