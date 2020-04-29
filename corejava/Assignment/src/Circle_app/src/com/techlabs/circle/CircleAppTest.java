package com.techlabs.circle;

public class CircleAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleApp co = new CircleApp();
		co.getRadius();
		co.getColor();
		co.setRadius(0.0f);
		co.setColor("rEd");
		co.calculateArea();
		co.calculateParameter();

		System.out.println("Color :" + co.getColor());

	}

}
