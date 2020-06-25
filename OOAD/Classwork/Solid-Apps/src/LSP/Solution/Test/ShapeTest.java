package LSP.Solution.Test;

import LSP.Solution.Rectangle;
import LSP.Solution.Square;

public class ShapeTest {
	public static void main(String[] args) {
		// Rectangle
		Rectangle r = new Rectangle();
		r.setHeight(10);
		r.setWidth(15);
		System.out.println("Rectangle Area :" + r.calculateArea());

		// Square
		Square s = new Square();
		s.setSide(10);
		System.out.println("Square Area :" + s.calculateArea());
	}
}
