package com.techlab.rectangle;

public class RectangleAnonymousTest {
	public static void main(String args[]) {
		System.out.println(new Rectangle()); 
		

		new Rectangle().setLength(5);
		new Rectangle().setBreadth(10);
		System.out.println(new Rectangle().getLength()); 
		System.out.println(new Rectangle().getBreadth());

		printInfo(new Rectangle());
		
		
		
		
	}
	public static void printInfo(Rectangle r) { 
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
		
	}

}
