package com.techlabs.circle;

public class CirclePrintTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle co = new Circle();
	
		co.setRadius(10.0f);
		co.setColor("Red");
		printCircleInfo(co);
		
		/*
		Circle c1 = new Circle();
		c1.setRadius(11.0f);
		c1.setColor("pink");

		Circle c2 = new Circle();
		c2.setRadius(12.0f);
		c2.setColor("blue");

		printCircleInfo(c1);
		printCircleInfo(c2);
	*/
	}

	public static void printCircleInfo(Circle co) {
		Circle c1 = new Circle();
		System.out.println("circle info is:- ");
		System.out.println("radius:-"+co.getRadius());
		System.out.println("color:-"+co.getColor());
		System.out.println("area:"+co.calculateArea());
		System.out.println("Perimeter:"+co.calculateParameter());
		System.out.println(co.hashCode());
	}
}
