package com.techlab.library;

public class Book {
	private String bookName ;
	private int id ;
	
	public Book(String bookName, int id) {
		this.bookName = bookName;
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", id=" + id + "]";
	}

}
