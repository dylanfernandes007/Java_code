package test_practice;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= new String("quick brown fox jumps over the lazy dog");
		System.out.println(str.substring(15));//  jumps over the lazy dog
		System.out.println(str.substring(15, 20));//jump
		  String mid = str.substring(1, str.length()-1);
System.out.println(mid);
	}

}
