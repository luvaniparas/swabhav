package LSP.Violation.Test;

import LSP.Violation.Rectangle;
import LSP.Violation.Square;

public class RectangleTest {

	public static void main(String[] args) {
		// Rectangle
		Rectangle r = new Rectangle();
		r.setHeight(10);
		r.setWidth(20);
		System.out.println(no_Change(r));
		System.out.println("Rectangle Area :" + r.calculateArea());

		// Square
		Square s = new Square();
		s.setHeight(5);
		System.out.println(no_Change(s));
		System.out.println("Square Area : " + s.calculateArea());

	}

	public static boolean no_Change(Rectangle obj) {
		int before = obj.getWidth(); //12
		obj.setHeight(obj.getHeight() + 10); //5+10

		int after = obj.getWidth(); //12
		if (before == after) {
			return true;
		}
		return false;
	}
}
