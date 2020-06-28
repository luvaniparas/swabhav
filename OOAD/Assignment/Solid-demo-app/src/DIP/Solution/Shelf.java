package DIP.Solution;

public class Shelf {

	IProduct product;

	public void addProduct(IProduct product) {
		System.out.println("Product Added ");
	}

	public void customizeShelf() {
		System.out.println("customizeShelf");
	}

}
