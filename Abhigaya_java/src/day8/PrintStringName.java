package day8;

public class PrintStringName {//day 8

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStringName obj= new PrintStringName();
		obj.methodName("Deepak", "Kumar");// enter values in quotes// //objname.methodname
		
	}
	public void methodName(String fname, String lname)

	{   
		String fullName="firstname: " +fname+ " lastname: "+ lname;
		System.out.println(fullName);;
		
	}
}
