package com.techlab.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
	HashSet<Integer> mySet = new HashSet() ;
	mySet.add(1);
	mySet.add(2);
	System.out.println("Add : "+mySet);
	mySet.remove(1);
	System.out.println("Remove : "+mySet);
	
	
	Iterator<Integer> itr = mySet.iterator();
	System.out.println("Reading : ");
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	}

}
