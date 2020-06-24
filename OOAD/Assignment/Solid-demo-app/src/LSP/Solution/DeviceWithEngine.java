package LSP.Solution;

public class DeviceWithEngine extends TranspositionDevice {

	public DeviceWithEngine(String name, double speed) {
		super(name, speed);
	}

	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void startEngine() {

	}

}
