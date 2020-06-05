package com.techlab.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		System.out.println("Add : "+myList);
		myList.set(1,22);
		System.out.println("Update : "+myList);
		myList.remove(1);
		System.out.println("Remove : "+myList);
		
		Iterator<Integer> itr = myList.iterator();
		System.out.println("Reading : ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
