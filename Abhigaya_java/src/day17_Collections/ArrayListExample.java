package day17_Collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list=new ArrayList();// non -generic, this is not preferred
		
		//adding elements to the arrayList
		
		list.add(10);//u cannot add primitive values to collection but still int was allowed here, 10- int
		//object of integer by the compiler
		list.add("Java");
		list.add(10.5);
		list.add(true);
		list.add('A');
		list.add(null);
		
	//every class in java is a child class of OBJECT class, OBJECT class is parent of all classes
		//print all elements of arraylist at the same time
		
		System.out.println(list); //o/p: [10, Java, 10.5, true, A, null]

		list.add(10);// duplicate values are allowed in List class
		System.out.println(list); //o/p: [10, Java, 10.5, true, A, null, 10]
		
		System.out.println(list.size());//7  // how to get size of arrayList
	System.out.println(list.get(5));//null

		//System.out.println("Element at index 2-->" +list.get(8));// u will get error because we dont have anything at index 8
		// i want to print all the elements of the arrayList one by one, use for loop
		
		for(int i=1;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		/*why not to use non-generic, we get ClassCastException
		int result=10+(Integer)list.get(1);//cannot be cast to java.lang.Integer, java.lang.ClassCastException
		System.out.println(result);
		*/
		
		//ArrayList<String> list1=new ArrayList<String>();//Generic: this is preferred
	}

}
