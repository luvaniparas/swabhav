package ISP.Violation;

public class Robots implements IWorkable {

	@Override
	public void startWork() {
		System.out.println("Robot Started Working ");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot Stopped Working ");
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robot Cannot Eat");
	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robot Cannot Eat");
	}

}
