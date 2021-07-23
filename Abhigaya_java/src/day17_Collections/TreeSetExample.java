package day17_Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> set= new TreeSet<String>();
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		set.add("Fifth");
	//	set.add(null);// cant be used in TreeSet
		
		System.out.println(set.size());// no indexes in set class
		System.out.println(set);
		//duplicate not allowed , only unique values, not stored in order
		set.add("First");
		System.out.println(set);
	//fetch particular element from HashSet
	
		for(String element:set)
		{
			System.out.println(element);
		}
		//in selenium, getWindowHandles()--Set<String>
	}

}

