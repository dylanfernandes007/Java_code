package day4;

public class StringConcatenation {//day 4

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Way";
		String s2="2";
		String s3="automation";
		
		System.out.println(s1+s2+s3);//Way2automation
		System.out.println(10+20);// 30
		System.out.println(s1+10+20+s2+s3);//Way10202automation
		System.out.println(s1+(10+20)+s2+s3);  //Way302automation //BODMAS
		System.out.println(10+20+s1+s2+s3);  //30Way2automation

		
	}

}
