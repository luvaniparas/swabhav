package DIP.Solution;

public class Book implements IProduct {

	@Override
	public void seeReviews() {
		System.out.println("seeReviews Book");
	}

	@Override
	public void getSample() {
		System.out.println("getSample Book");
	}

}
