package day10;

import java.util.Scanner;

public class TypeOfVariables {// day 10 // very important for automation

	
	int i=10;  // instance variable
	int j=100;
	int var;
	String s;
	Scanner s1;
	//String s="Java";// instance var
	
//	TypeOfVariables obj= new TypeOfVariables();// ref var,but  on basis of scope its instance var
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeOfVariables t1=new TypeOfVariables();
		System.out.println(t1.var);  // displays 0
		System.out.println(t1.s1);
		//And for a variable whose datatype is a classname( user defined/ pre-defined)-->null means nothing
		System.out.println(t1.s); // displays null
		TypeOfVariables t2=new TypeOfVariables();
		t1.i=20;  // remember earlier t1 was 10
		System.out.println(t1.i);//this displays 20
		System.out.println(t2.i); //this displays 10 not 20 . wont affected if change in t1
		// byte, short, int, long -->0
		// float, double -->0.0
		//boolean--> false
		//char--> single space
		
		
		
		
		
		
		
		
		
	}

}
