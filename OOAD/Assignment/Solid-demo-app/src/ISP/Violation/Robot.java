package ISP.Violation;

public class Robot implements IWorker {

	@Override
	public void work() {
		System.out.println("Robot Working");
	}

	@Override
	public void eat() {
		System.out.println("Robot Eating");
	}

}
