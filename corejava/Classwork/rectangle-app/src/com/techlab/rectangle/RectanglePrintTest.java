package com.techlab.rectangle;

public class RectanglePrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.setBreadth(10.0f);
		r.setLength(10.0f);
		r.setColor("red");
		printRectangleInfo(r);

		Rectangle r1 = new Rectangle();
		r1.setLength(10);
		r1.setBreadth(30);

		Rectangle r2 = new Rectangle();
		r2.setLength(11);
		r2.setBreadth(03);

		printRectangleInfo(r1);
		printRectangleInfo(r2);
	}

	public static void printRectangleInfo(Rectangle r) {
		Rectangle r1 = new Rectangle();
		System.out.println("Rectangle info is:- ");
		System.out.println("Length:-" + r1.getLength());
		System.out.println("Breadth:-" + r1.getBreadth());
		System.out.println("color:-" + r1.getColor());
		System.out.println(r.hashCode());
	}
}
