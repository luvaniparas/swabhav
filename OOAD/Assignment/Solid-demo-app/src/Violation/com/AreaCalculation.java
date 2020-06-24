package Violation.com;

public class AreaCalculation {

	public double caluclateArea(Rectangle rect) {
		return rect.getLength() * rect.getWidth();
	}

	public double caluclateArea(Circle circle) {
		return (3.14 * circle.getRadius() * circle.getRadius());
	}

	// Different Shapes Different Area Formula

}