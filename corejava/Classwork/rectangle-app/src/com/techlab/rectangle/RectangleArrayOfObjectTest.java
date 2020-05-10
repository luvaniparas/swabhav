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
		r[0].setLength(5.0f);
		r[0].setBreadth(5.0f);

		r[1] = r1;
		r[2] = r2;
		printInfo(r);
		/*float smallestArea = smallestArea(r);
		System.out.println("Smallest Area Rectangle is :" + smallestArea);
		*/
		Rectangle ObjSmallArea = findSmallRectanglearea(r);
		System.out.println("Smallest Area Rectangle is :" + ObjSmallArea.calculateArea());
	}

	public static void printInfo(Rectangle re[]) {
		for (int i = 0; i < re.length; i++) {
			System.out.println("Rectangle Information :");
			System.out.println("Length :" + re[i].getLength());
			System.out.println("Breadth :" + re[i].getBreadth());
			System.out.println("Area :" + re[i].calculateArea());
		}
	}

	/*
	 * public static float smallestArea(Rectangle re[]) { float result =
	 * re[0].calculateArea(); for(int i=0;i<re.length;i++) {
	 * if(re[i].calculateArea() < result) { result = re[i].calculateArea(); } }
	 * return result;
	 * 
	 * }
	 */
	public static Rectangle findSmallRectanglearea(Rectangle re[]) {
		Rectangle robj = re[0];
		float result =re[0].calculateArea();
		for(int i=1;i<re.length;i++) {
			if(re[i].calculateArea() < result) {
				//System.out.println("Test");
				result = re[i].calculateArea();
				robj=re[i];
			}
		}
		return robj;
	}

}
