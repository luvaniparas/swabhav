package com.techlab.rectangle;

public class RectangleArrayOfObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle[] r = new Rectangle[3];
		Rectangle r1 = new Rectangle();
		r1.setLength(10.0f);
		r1.setBreadth(10.0f);

		Rectangle r2 = new Rectangle();
		r2.setLength(20.0f);
		r2.setBreadth(20.0f);

		r[0] = new Rectangle();
		r[0].setLength(1.0f);
		r[0].setBreadth(1.0f);

		r[1] = r1;
		r[2] = r2;
		printInfo(r);
	}

	public static void printInfo(Rectangle re[]) {
		for (int i = 0; i < re.length; i++) {
			System.out.println("Rectangle Information :");
			System.out.println("Length :" + re[i].getLength());
			System.out.println("Breadth :" + re[i].getBreadth());
		}
	}

}
