package test_practice;

public class front3 {

	public String front3(String str) {
		  String front;
		  
		  if (str.length() >= 3) {
		    front = str.substring(0, 3);
		  }
		  else {
		    front = str;
		  }

		  return (front + front + front);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		}

}
