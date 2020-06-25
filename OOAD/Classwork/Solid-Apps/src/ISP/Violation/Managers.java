package ISP.Violation;

public class Managers implements IWorkable {

	@Override
	public void startWork() {
		System.out.println("Manager Started Working");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager Stopped Working");
	}

	@Override
	public void startEat() {
		System.out.println("Manager started Eating");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager stopped Eating");
	}

}
