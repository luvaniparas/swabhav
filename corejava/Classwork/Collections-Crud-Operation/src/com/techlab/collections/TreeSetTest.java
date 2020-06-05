package com.techlab.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> myset = new TreeSet();
		myset.add(1);
		myset.add(2);
		System.out.println("Add : "+myset);
		myset.remove(1);
		System.out.println("Remove : "+myset);
		
		Iterator<Integer> itr = myset.iterator();
		System.out.println("Reading : ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
