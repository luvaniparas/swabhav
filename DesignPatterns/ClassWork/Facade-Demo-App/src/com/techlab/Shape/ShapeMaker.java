package com.techlab.Shape;

public class ShapeMaker {

	private IShape circle;
	private IShape square;

	public ShapeMaker() {

		circle = new Circle();
		square = new Square();

	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawSquare() {
		square.draw();
	}

}
