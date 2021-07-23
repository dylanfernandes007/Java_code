package java_practice;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in= new Scanner(System.in);
		
		System.out.println("Input radius");
		int radius=in.nextInt();
		
		double Area =22.7 *radius*radius;
		double Perimeter =2*22.7*radius;
		
		
		System.out.println("Area is " + Area + "    " + "Perimeter is " + Perimeter);
		
		
	
	}

}
