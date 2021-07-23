package abhigaya;

public class Punctuation_mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		String str="Hello Mr.... Sam. I am come here to meet , Miss Sam!";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)== '!' || str.charAt(i)== '.' || str.charAt(i)== ',' || str.charAt(i)== '.' || str.charAt(i)=='.'){
				count++;
		}
			
	 }
		System.out.println("count is " +count);
	}

}
