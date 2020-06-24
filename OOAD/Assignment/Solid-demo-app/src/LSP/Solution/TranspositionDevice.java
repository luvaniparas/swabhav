package LSP.Solution;

public class TranspositionDevice {

	private String name;
	private double speed;

	public TranspositionDevice(String name, double speed) {
		this.name = name;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public double getSpeed() {
		return speed;
	}

	@Override
	public String toString() {
		return "TranspositionDevice [name=" + name + ", speed=" + speed + "]";
	}

}
