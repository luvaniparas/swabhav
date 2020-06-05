package com.techlab.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<Integer> myset = new LinkedHashSet();
		myset.add(10);
		System.out.println("Add :" + myset);
		myset.remove(0);
		System.out.println("remove :" + myset);

		Iterator<Integer> itr = myset.iterator();
		System.out.println("Reading : ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
