package com.techlabs.circleTest;

import com.techlabs.circle.Circle;

public class CircleAnonymousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Circle());

		new Circle().setRadius(5);
		new Circle().setColor("Yellow");
		System.out.println(new Circle().getRadius());
		System.out.println(new Circle().getColor());

		printInfo(new Circle());
	}

	public static void printInfo(Circle c) { 
		System.out.println(c.getRadius());
		System.out.println(c.getColor());	
	}
}
