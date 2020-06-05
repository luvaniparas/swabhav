package com.techlab.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer,String> map= new TreeMap(); 
		
		map.put(1,"One");
		map.put(2,"two");
		System.out.println("Add :"+map);
	
		map.remove(1);
		System.out.println("Remove :"+map);
		
		map.replace(1,"Updated One") ;
		System.out.println("Updated : "+map);
		
		System.out.println("Reading : ");
		for(Map.Entry m : map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
