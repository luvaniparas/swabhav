package com.techlabs.circleTest;

import com.techlabs.circle.Circle;

public class CircleArrayOfObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] c = new Circle[3];
		Circle c1 = new Circle();
		c1.setRadius(10.0f);
		c1.setColor("Red");

		Circle c2 = new Circle();
		c2.setRadius(20.0f);
		c2.setColor("Pink");

		c[0] = new Circle();
		c[0].setRadius(1.0f);
		c[0].setColor("Purple");

		c[1] = c1;
		c[2] = c2;
		printInfo(c);

	}
	public static void printInfo(Circle ci[]) {
		for (int i = 0; i < ci.length; i++) {
			System.out.println("Circle Information :");
			System.out.println("Radius :" + ci[i].getRadius());
			System.out.println("Color :" + ci[i].getColor());
			System.out.println("Area :"+ ci[i].calculateArea());
			System.out.println("Perimeter : "+ci[i].calculateParameter());
		}
	
}
}
