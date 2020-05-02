package com.techlabs.circle;

public class CirclePrintTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle co = new Circle();
	
		co.setRadius(10.0f);
		co.setColor("Red");
		
		printCircleInfo(co);
	}

	public static void printCircleInfo(Circle co) {
		System.out.println("circle info is:- ");
		System.out.println("radius:-"+co.getRadius());
		System.out.println("color:-"+co.getColor());
		System.out.println("area:"+co.calculateArea());
		System.out.println("Perimeter:"+co.calculateParameter());
	}
}
