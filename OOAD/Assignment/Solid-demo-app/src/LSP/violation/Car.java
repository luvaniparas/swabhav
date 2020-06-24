package LSP.violation;

public class Car extends TranspositionDevice {

	public Car(String name, double speed, Engine engine) {
		super(name, speed, engine);
	}
	
	@Override
	public void StartEngine() {
		System.out.println("Strating Car Engines  ");
	}
	
}
