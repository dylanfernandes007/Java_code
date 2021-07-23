package day16_constructors;

public class Student {
	String studentName; //instance variable
	int rollNumber;
	public Student()// no argument constructor, this will be called if obj created
	//No arg const has priority, both default and no arg const have same sytax although u cant see the default
	{
		//this("abc",104); //if you use this, it will become infinite calling
		System.out.println("no arg constructor executed");
	}
	public Student(int i)// argument constructor
	{
		this();   //calling no-arg constructor
		System.out.println("single arg constructor executed");
		int a;// u can create local var inside constructor
	}
	
	/*
	 * 
	String studentName="Rahul";// default value null
	int rollNumber=100; // default value 0
	
	public Student(String studentName, int rollNumber) //param constructor//problem
	//when local and instance var names are same, it will give null and 0 as output
	{
		studentName=studentName;
		rollNumber=rollNumber;
		
	}
	public Student(String stuName, int rollNum) //param constructor, solution 1
	{
		studentName=stuName;
		rollNumber=rollNum;
		
	}
	
	*/
	//constructor overloading
	public Student(String studentName, int rollNumber) //using this keyword, solution2
	{
		this(10); //calling single argument constructor
		this.studentName=studentName;
		this.rollNumber=rollNumber;
		System.out.println(" two arg constructor executed");
		
	}
	
	public static void main(String args[])
	{
		Student s1=new Student("Rahul", 100);// first this will point here
		Student s2=new Student("Deepak", 101);// then this will point here
		Student s3=new Student("Ankit",102);// then this will point here
		
		System.out.println("Student name of s1" +s1.studentName);
		System.out.println("Roll number of s1 " +s1.rollNumber);
	
		System.out.println("Student name of s2" +s2.studentName);
		System.out.println("Roll number of s2 " +s2.rollNumber);
		
		System.out.println("Student name of s3  " +s3.studentName);
		System.out.println("Roll number of s3  " +s3.rollNumber);
		
		s3.m1();
		//this.m1();  //cant use as its static// null pointer exception as no object is created
		
	}
	public void m1()
	{
		System.out.println("m1 method of student class");
		this.m2();
	}
	public void m2()
	{
		
	}
}
//when using local variable and instance variables together in same statement, priority will go to local variables
// keep diff names of local and instance. Recommended to keep same names and use "this" keyword
// this keyword always points to the most recent object of the class, example s3
//cannot use "this" keyword in static method
// Constructor and class name should be same
// Constructor are used to assign value to instance variables not for business logic like methods

