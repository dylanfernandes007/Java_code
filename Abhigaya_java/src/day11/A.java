package day11;

public class A {

	public static int i=10;
	public int j=20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		A obj = new A();
		System.out.println(A.i);//classname as static variable
		System.out.println(obj.j);//objectname as non-static variable
	    obj.add();
		int var=10;
		System.out.println(var);//local variable call directly without classname or objectname
		
	}
	public void add()
	{
		A.sum(); //using className as sum is static  method
	}
    public static void sum()
    {
    	new A().display();// using object name as display is not static, new obj created here
    	//obj is ref variable created in main method so scope is only there, we cant use here
  
    }
    public void display()
    {
    	
    }
    
}
