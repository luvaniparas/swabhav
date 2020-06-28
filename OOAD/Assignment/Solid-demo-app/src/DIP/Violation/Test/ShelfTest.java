package DIP.Violation.Test;

import DIP.Violation.Book;
import DIP.Violation.Shelf;

public class ShelfTest {

	public static void main(String[] args) {
		Book b = new Book();
		Shelf s = new Shelf();
		s.addBook(b);
		

	}

}
