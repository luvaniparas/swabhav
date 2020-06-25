package ISP.Violation;

public class Human implements IWorker {

	@Override
	public void work() {
		System.out.println("Human Working");
	}

	@Override
	public void eat() {
		System.out.println("Human Eating");
	}

}
