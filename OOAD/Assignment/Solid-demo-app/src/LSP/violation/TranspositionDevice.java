package LSP.violation;

public class TranspositionDevice {

	private String name;
	private double speed;
	private Engine engine;

	public TranspositionDevice(String name, double speed, Engine engine) {
		this.name = name;
		this.speed = speed;
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public double getSpeed() {
		return speed;
	}

	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "TranspositionDevice [name=" + name + ", speed=" + speed + ", engine=" + engine + "]";
	}

	public void StartEngine() {
		System.out.println("TranspositionDevice Class ");
	}
}
