package day18_StringHandling;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="This is java class";
     String[] splittedString = s.split("is");
     for(int i=0;i<splittedString.length;i++)
     {
    	 System.out.println(splittedString[i]);// this is to split string
     }
     //get the number of characters in string/get length of string/size string
     System.out.println(s.indexOf("j"));//first occurenece of j
     System.out.println(s.lastIndexOf("j"));
     System.out.println(s.length());
     
     //print each character of string one by one
     // i want to fetch  a particular character from string
     
     System.out.println(s.charAt(3));
     for(int i=0;i<s.length();i++)
     {
    	 System.out.println(s.charAt(i));
     }
     //Understanding the substring method
     System.out.println(s.substring(5));
     System.out.println(s.substring(s.length()));// this wont give execption.read compile statement
   // System.out.println(s.substring(s.length()+1));// this will give exception when greater than length
     System.out.println(s.substring(0,2));// o/p: THIS
	}

}
