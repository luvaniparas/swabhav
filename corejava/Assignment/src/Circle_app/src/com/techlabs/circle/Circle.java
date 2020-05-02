package com.techlabs.circle;

public class Circle {

	private float radius;
	private String color;
	final float pi = 3.14f;
	private String rstr = "red";
	private String gstr = "gray";
	private String prstr = "purple";
	private String pnstr = "pink";

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		if (radius <= 0.0f) {
			this.radius = 1.0f;
		} else {
			this.radius = radius;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (rstr.equalsIgnoreCase(color)) {
			this.color = color;
		} else if (gstr.equalsIgnoreCase(color)) {
			this.color = color;
		} else if (prstr.equalsIgnoreCase(color)) {
			this.color = color;
		}

		else if (pnstr.equalsIgnoreCase(color)) {
			this.color = color;
		} else {
			this.color = pnstr;
		}

	}
//single if-else to perform logic mentioned in setcolor
//	also try ternary operator :?  
	public double calculateArea() {
		double area = pi * radius * radius;
		//System.out.println("Area :" + area);
		return area;

	}

	public double calculateParameter() {
		double cf = 2 * pi * radius;
		//System.out.println("Parameter :" + cf);
		return cf;
	}

}
