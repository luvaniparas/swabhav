package com.techlabs.circle;

public class CircleApp {

	private float radius;
	private String color;
	final float pi = 3.14f;
	private String rstr = "red";
	private String gstr = "gray";
	private String prstr = "purple";
	private String pnstr = "pink";
	private boolean b = true;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		if (radius <= 0.0f) {
			this.radius = 1.0f;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (b == rstr.equalsIgnoreCase(color)) {
			this.color = color;
		} else if (b == gstr.equalsIgnoreCase(color)) {
			this.color = color;
		} else if (b == prstr.equalsIgnoreCase(color)) {
			this.color = color;
		}

		else if (b == pnstr.equalsIgnoreCase(color)) {
			this.color = color;
		} else {
			this.color = pnstr;
		}

	}

	public double calculateArea() {
		float area = pi * radius * radius;
		System.out.println("Area :" + area);
		return area;

	}

	public double calculateParameter() {
		float cf = 2 * pi * radius;
		System.out.println("Parameter :" + cf);
		return cf;
	}

}
