package day17_Collections;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);// whatever class u r mentioning, 
		list.add(100);
		list.add(500);
		list.add(5660);
		
		int result= 10 + list.get(1);// here u wont get exception unlike non-generic type
		System.out.println(result);
		
	// when to use arraylist: when u want to store multiple elements , duplicate values, maintain in an order
		// if you have webpage and want to get all the links using findElements, to print all values in dropdown
	}

}
