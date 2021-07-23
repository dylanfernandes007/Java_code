package day8;

public class PrintString {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	PrintString obj= new PrintString();
	obj.printName("Arun","Singh");

	String fname="Arun";
	String lname="Singh";
	}

	public static void printName(String fname, String lname) {
		String fullName="fname " + fname + " " +"lname " + " " +lname;
		System.out.println(fullName);
		
	}

}
