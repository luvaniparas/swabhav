package com.techlabs.circle;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle co = new Circle();
		co.getRadius();
		co.getColor();
		co.setRadius(10.0f);
		co.setColor("rEd");
		co.calculateArea();
		co.calculateParameter();

		System.out.println("Color :" + co.getColor());

	}

}
