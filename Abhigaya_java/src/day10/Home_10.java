package day10;

public class Home_10 {
	
	 int i=10;//
     static int var=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Home_10 h1= new  Home_10();
		 Home_10 h2= new  Home_10();
		 
		h1.i=25;
		System.out.println(h1.i);//25
		System.out.println(h2.i);//10
		h2.var=45;
		System.out.println(h1.var);// displays 45, this is imp because static
		// when static variable, even if h1 object value is changed, h2 object will also get updated
		//when to use static and instance var
		// student name, roll no, stud address will be instance var as name will be different for each student
		// college name same so will be static variable
		
	}
}
