package com.techlab.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> myList = new LinkedList() ;
		myList.add(1);
		myList.add(2);
		System.out.println("Add : "+myList);
		myList.remove(1);
		System.out.println("Remove : "+myList);
		myList.set(0, 11);
		System.out.println("Update : "+myList);		
		
		Iterator<Integer> itr = myList.iterator();
		System.out.println("Reading : ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
