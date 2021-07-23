package abhigaya;

public class Vowels_consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vcount=0;
		int ccount=0;
		
		String str="This is a simple sentence";
		str= str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u')
				vcount++;
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				ccount++;
		}
     System.out.println("vowel count is " + vcount +   "consonant count is " +ccount);
}
}