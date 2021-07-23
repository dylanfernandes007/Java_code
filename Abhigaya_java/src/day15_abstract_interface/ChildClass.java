package day15_abstract_interface;

public class ChildClass implements P1, P2{

	public void m1()// its in p1 and p2
	{
		
	}

	public static void main(String[] args)
	{
		ChildClass c =new ChildClass();// cant create obj of p1,p2
		c.m1();// here its calling method of Childclass m1 and not of p1,p2
		
		final int i=10;
	//	i=100; you cannot change the value of i coz of final KW
}
	}
//cannot make abstract class or interface final, u cannot inherit if class is made final
//to learn oops concepts, Kathy sierra book: SCGP pg 85 atleast OOPS, headfirst book is not good

//final keyword can be used with variables, methods ,classes
//final>variable>variable will become constant variable (cannot change the value)
// final method when used: it cannot be overridden by child class methods. example if u use final KW for RBI class 
//final--> no class can inherit taht final class
// can u make abstract method final: NO (compile error):since u wont be able to override
//can u make abstract class final: NO (compile error) :since u wont be able to override

