package com.techlab.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap();
		map.put(1,"One");
		map.put(2,"Two");
		System.out.println("Add : "+map);
		
		map.remove(2);
		System.out.println("Remove"+map);
		
		map.replace(1,"Updated One") ;
		System.out.println("Updated : "+map);
		
		System.out.println("Reading : ");
		for(Map.Entry m : map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}

}
