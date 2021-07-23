package day17_Collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set= new HashSet<String>();// 
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		set.add("Fifth");
		set.add(null);// cant be used in TreeSet
		
		System.out.println(set.size());// no indexes in set class//6
		System.out.println(set);// [null, Second, Third, First, Fourth, Fifth]
		//duplicate not allowed , only unique values, not stored in order
		set.add("First");
		System.out.println(set); // you will get the same value again
	//fetch particular element from HashSet
	
		for(String element:set)
		{
			System.out.println(element);
		}
		//in selenium, getWindowHandles()--Set<String>
	}

}
