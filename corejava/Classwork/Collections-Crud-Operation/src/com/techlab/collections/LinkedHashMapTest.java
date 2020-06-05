package com.techlab.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap();

		map.put(0, "Zero");
		map.put(1, "One");
		System.out.println(map);
		
		map.remove(1);
		System.out.println("Remove :"+map);
		
		map.replace(1,"Updated One") ;
		System.out.println("Updated : "+map);
		
		System.out.println("Reading : ");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
