package LSP.Solution;

public class Cycle extends DeviceWithoutEngine {

	public Cycle(String name, double speed) {
		super(name, speed);
	}

	@Override
	public void startMoving() {
		System.out.println("Start Moving ");
	}
}
