package com.techlab.crud;

import java.util.Iterator;
import java.util.LinkedList;

public class listCrud {

	static LinkedList<Integer> myList;

	public static void main(String[] args) {
		myList = new LinkedList<Integer>();

		addIntoList(10);
		addIntoList(30);
		addIntoList(40);

		updateList(1, 20);

		removeFromList(0);

		readFromList();
	}

	public static void addIntoList(int e) {
		System.out.println("Elemenet " + e + " Added ! ");
		myList.add(e);
	}

	public static void removeFromList(int e) {
		System.out.println("Elemenet " + myList.get(e) + " Removed ! ");
		myList.remove(e);
	}

	public static void updateList(int index, int value) {
		System.out.println("Elemenet " + myList.get(index) + " Updated to " + value);
		myList.set(index, value);
	}

	public static void readFromList() {
		Iterator<Integer> itr = myList.iterator();
		System.out.println("Reading => ");

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
