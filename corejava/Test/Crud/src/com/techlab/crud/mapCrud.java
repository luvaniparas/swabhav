package com.techlab.crud;

import java.util.HashMap;
import java.util.Map;

public class mapCrud {
	
	static HashMap<Integer,String> myMap ;
	
	public static void main(String[] args) {
		myMap = new HashMap();
		
		addIntoMap(1,"one");
		addIntoMap(2,"two");
		addIntoMap(3,"three");
		
		updateMap(1,"Updated One");

		removeFromMap(40);

		readMap();
	}
	
	public static void addIntoMap(int key,String value) {
		System.out.println("Elemenet " + value + " Added ! ");
		myMap.put(key,value);
	}

	public static void removeFromMap(int key) {
		System.out.println("Elemenet  Removed ! ");
		myMap.remove(key);
	}

	public static void updateMap(int key , String value) {
		System.out.println("Elemenet Updated " );
		myMap.replace(key,value) ;
	}

	public static void readMap() {
		System.out.println("Reading => ");
		
		for(Map.Entry m : myMap.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
