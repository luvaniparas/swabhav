package LSP.violation;

public class Cycle extends TranspositionDevice {

	public Cycle(String name, double speed, Engine engine) {
		super(name, speed, engine);
	}

	@Override
	public void StartEngine() {
		System.out.println("Strating Cycle Engines  ");
	}

}
