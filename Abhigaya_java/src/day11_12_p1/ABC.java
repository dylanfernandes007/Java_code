package day11_12_p1;

public class ABC {
	
	public int i=10;
	private int j=20;
	protected int k=30;
	int l=40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ABC obj= new ABC(); // can access all the above in the main method 
     System.out.println(obj.i);
     System.out.println(obj.j);// this can be used only in this class
     System.out.println(obj.k);
     System.out.println(obj.l);
		
		
	}

}
