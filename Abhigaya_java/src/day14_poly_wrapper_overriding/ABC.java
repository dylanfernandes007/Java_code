package day14_poly_wrapper_overriding;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             //Webdriver driver=new Chromedriver();
            //in java, u can store object of child class in reference of parent class/interface
		
		int i=10; // int --> primitive value
		Integer obj= new Integer(i);//int> Integer class object
		System.out.println(obj);
		//autoboxing is done by compiler in collectons not jvm
		
		Double d = new Double(100.5);
		double d1=d;  // Converting wrapper to primitive--> unboxing
		System.out.println(d1);
		
	//Number class is parent class of first 6 wrapper classes 
		
		
		
	}

}
