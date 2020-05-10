package com.techlabs.circle;

public class Circle {

	private float radius;
	private String color;
	final float pi = 3.14f;
	private double area ;
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
		if (rstr.equalsIgnoreCase(color) || gstr.equalsIgnoreCase(color) || prstr.equalsIgnoreCase(color)
				|| pnstr.equalsIgnoreCase(color)) {
			this.color = color;
		} else {
			this.color = pnstr;
		}

	}
  
	public double calculateArea() {
		 area = pi * radius * radius;
		// System.out.println("Area :" + area);
		return area;

	}

	public double calculateParameter() {
		double cf = 2 * pi * radius;
		// System.out.println("Parameter :" + cf);
		return cf;
	}

}
