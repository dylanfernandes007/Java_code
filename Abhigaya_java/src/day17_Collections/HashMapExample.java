package day17_Collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//hashmap, when elements inserted, values are in key-value pairs
		
		HashMap<String, Integer> map= new HashMap<String, Integer>();//key-value pairs
		map.put("first", 10); //there is no order preserved
		map.put("second", 20);
		map.put("third", 30);
		map.put("fourth", 40);
		map.put("fifth", 50);
		map.put("sixth", 60);
		// don't add duplicate values, u can add, u wont get error, but it will replace the older one
		System.out.println(map.size());//6
		System.out.println(map);//{sixth=60, third=30, fifth=50, fourth=40, first=10, second=20}
		map.put("first", 100); //replace the existing first
		System.out.println(map); //{sixth=60, third=30, fifth=50, fourth=40, first=100, second=20}
		map.put(null, null);// usually we don't put but u can 
		
		// how to fetch values from map, key is the main thing
		System.out.println(map.get("first"));// in get method, u have to pass key
		Set<String> keys=map.keySet();
		for(String key:keys)
		{
			System.out.println("Key-->"+key+" Value--> " +map.get(key));
		}
		//excel file example
		
		//ArrayList<HashMap<String, String>>--check this for the excel example(read about it more)
	}

}
