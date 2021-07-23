package day8;

public class CalculateArea {//day 8

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateArea obj= new CalculateArea();
		int result= obj.calculateAreaOfSquare(10);//objname.methodname
		obj.printArea(result);
		
		
		
	
	}
	public int calculateAreaOfSquare(int side)
	{
		int area=side*side;
		return area;// when return, then no void can be used
		// return type of method must be the type of value you are returning
		// you can return only one value at a time. otherwise use array/ collection class
	}
	//you will return only when on return, you are using it in another method
	public void printArea(int area)// if you use result variable, its still diff
	{
		System.out.println("Area of sqaure is: " +area);
	}
	
}
