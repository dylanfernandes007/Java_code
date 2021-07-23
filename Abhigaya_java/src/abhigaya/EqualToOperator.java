package abhigaya;

public class EqualToOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double i = 20.0;
		int j = 20;
		
		System.out.println(i == j);//false
		
		String s1 = "java";  // obj created
		String s2 = "java";  //s2 will be pointing to obj which is appointed by s1
		String s3 = new String("java"); // heap <-s3
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s3); //false because both are pointing to diff obj
		
		int var1=10;
		int var2=20;
		
		System.out.println(var1!=var2);
		System.out.println(s1!=s2);
	}

}
