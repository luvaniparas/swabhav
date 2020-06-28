package DIP.Solution.Test;

import DIP.Solution.Book;
import DIP.Solution.DVD;
import DIP.Solution.IProduct;
import DIP.Solution.Shelf;

public class ShelfTest {

	public static void main(String[] args) {

		IProduct p1 = new Book();
		p1.seeReviews();
		p1.getSample();

		IProduct p2 = new DVD();
		p2.seeReviews();
		p2.getSample();
		
		Shelf s = new Shelf();
		s.addProduct(p1);
		s.addProduct(p2);
		s.customizeShelf();
	}

}
