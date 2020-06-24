package Violation.com.test;

import Violation.com.AreaCalculation;
import Violation.com.Circle;
import Violation.com.Rectangle;

public class ShapeTest {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(4.5, 7.4);
		Circle c = new Circle(8.3);
		AreaCalculation t = new AreaCalculation();

		System.out.println("Rectangle: " + t.caluclateArea(r));
		System.out.println("Circle: " + t.caluclateArea(c));
	}
}
