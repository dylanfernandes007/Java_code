package day5;

public class ANDOperator {  //day 5

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		int j=20;
		int k=30;
		
		System.out.println((i<j) && (j>i));  // true and true is true remember AND truth table

      boolean b=i<j || j> i && i==j;// AND has priority over OR so AND performed first
      System.out.println(b);
      boolean c=(i<j || j> i) && i==j; // here bracket is operated first
      System.out.println(c);
      System.out.println(true && true|| false);
      //System.out.println(i<j<k); this will give compile error as i<j gives boolean value. cant compare with k
      
      

		
		
	}

}
