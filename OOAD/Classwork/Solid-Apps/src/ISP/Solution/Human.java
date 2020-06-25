package ISP.Solution;

public class Human implements IWorkable, IFeedable {

	@Override
	public void startWork() {
		System.out.println("Start Working ");

	}

	@Override
	public void stopWork() {
		System.out.println("Stop Working");
	}

	@Override
	public void startEat() {
		System.out.println("Start Eatting");
	}

	@Override
	public void stopEat() {
		System.out.println("Stop Eatting");
	}

}
