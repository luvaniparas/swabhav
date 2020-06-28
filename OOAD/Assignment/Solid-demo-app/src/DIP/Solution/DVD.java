package DIP.Solution;

public class DVD implements IProduct {

	@Override
	public void seeReviews() {
		System.out.println("seeReviews DVD");
	}

	@Override
	public void getSample() {
		System.out.println("getSample DVD");
	}

}
