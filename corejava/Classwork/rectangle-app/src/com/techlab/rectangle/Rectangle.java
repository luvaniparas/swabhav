package com.techlab.rectangle;

public class Rectangle {

	private float length;
	private float breadth;
	private String color;
	private String rstr = "red";
	private String gstr = "green";
	private String bstr = "black";

	public String getColor() {
		return this.color;
	}

	public float getLength() {
		return this.length;
	}

	public float getBreadth() {
		return this.breadth;
	}

	public void setColor(String clr) {
		if (clr == rstr) {
			this.color = rstr;
		} else if (clr == bstr) {
			this.color = bstr;
		} else if (clr == gstr) {
			this.color = gstr;
		} else {
			this.color = bstr;
		}
	}

	public void setLength(float len) {
		if (len < 0) {
			this.length = 1;
		} else if (len > 100) {
			this.length = 100;
		} else {
			this.length = len;
		}

	}

	public void setBreadth(float bre) {
		if (bre < 0) {
			this.breadth = 1;
		} else if (breadth > 100) {
			this.breadth = 100;
		} else {
			this.breadth = bre;
		}

	}

	public float calculateArea() {
		float area = length * breadth;
		return area;
	}
}
