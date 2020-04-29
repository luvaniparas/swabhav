package com.techlab.rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rcobj = new Rectangle();
		System.out.println("Case1");
		System.out.println("Length :" + rcobj.getLength() + "Breadth :" + rcobj.getBreadth());

		rcobj.setColor("yellow");
		rcobj.setLength(10.0f);
		rcobj.setBreadth(10.0f);
		System.out.println("Case2");
		System.out.println("Length :" + rcobj.getLength() + "Breadth :" + rcobj.getBreadth() +"color : " + rcobj.getColor() );
		rcobj.calculateArea();
		/*
		 * System.out.println("Case 3"); System.out.println(rcobj.setLength(12.0f));
		 * System.out.println(rcobj.getLength());
		 */
	}

}
