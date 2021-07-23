package day18_StringHandling;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="This is your application number: ABCD12345XYZ";
          // to get dynamic application number mentioned above use s.index(:+2) because u dont want the before space
          // substring or spilt method: 2 ways
          
          System.out.println(s.substring(s.indexOf(":")+2));//method 1
          String[] splittedString=s.split(":");   //method 2: split
          System.out.println(splittedString[1].trim());// trim removes the extra space from start and end, not in between
         System.out.println(s.replace(':', '-')) ;
          
          
  
	}

}
