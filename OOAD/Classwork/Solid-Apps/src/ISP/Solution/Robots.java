package ISP.Solution;

public class Robots implements IFeedable {

	@Override
	public void startEat() {
		System.out.println("Start Eatting");
	}

	@Override
	public void stopEat() {
		System.out.println("Stop Eatting");
	}

}
