package day4;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String s1="Java" ;  // new obj created, s1 is variable of type string .new obj is created.
		String s2="Java"  ; //duplicate string s2 will also point to the same object, no new obj created
		String s3="java";   //new obj created inside scp
		
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			String s4=new String("Java training");//when using "new" keyword to create object, variable points to "heap" not SCP even if created there too
				
				
	}

}
