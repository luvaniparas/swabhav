package com.techlab.libraryTest;

import java.util.ArrayList;
import com.techlab.library.Book;
import com.techlab.library.Library;

public class LibraryTest {

	public static void main(String[] args) {

		Book b1 = new Book("Java - HeadFirst", 101);
		Book b2 = new Book("OOAD - HeadFirst", 102);

		ArrayList<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);

		Library l = new Library(books);
		l.readBook();

	}

}
