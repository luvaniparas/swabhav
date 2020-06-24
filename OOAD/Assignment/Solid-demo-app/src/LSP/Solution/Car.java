package LSP.Solution;

public class Car extends DeviceWithEngine {

	public Car(String name, double speed) {
		super(name, speed);
	}

	@Override
	public void startEngine() {
		System.out.println("Startring Engine ");
	}

}
