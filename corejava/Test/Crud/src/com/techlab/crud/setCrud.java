package com.techlab.crud;

import java.util.HashSet;
import java.util.Iterator;

public class setCrud {
	
	static HashSet<Integer> mySet ;
	
	public static void main(String[] args) {
		
		mySet = new HashSet();
		
		addIntoSet(10);
		addIntoSet(30);
		addIntoSet(40);
		
		updateSet(10,20);

		removeFromSet(40);

		readSet();
		
	}
	
	public static void addIntoSet(int e) {
		System.out.println("Elemenet " + e + " Added ! ");
		mySet.add(e);
	}

	public static void removeFromSet(int e) {
		System.out.println("Elemenet "+e+"  Removed ! ");
		mySet.remove(e);
	}

	public static void updateSet(int remove , int a) {
		System.out.println("Elemenet "+remove+" Updated to " +a );
		mySet.remove(remove);
		mySet.add(a);
	}

	public static void readSet() {
		Iterator<Integer> itr = mySet.iterator();
		System.out.println("Reading => ");

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	
}
