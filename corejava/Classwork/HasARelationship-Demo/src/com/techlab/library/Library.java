package com.techlab.library;

import java.util.ArrayList;

public class Library {

	static ArrayList<Book> books;

	public Library(ArrayList<Book> books) {
		this.books = books;
	}

	public static void readBook() {
		for (Object o : books) {
			System.out.println("Reading -> " + o);
		}

	}
}
