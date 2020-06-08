package com.techlabs;

class car {
	String cname;
	int cnumber;

	public car(String cname, int cnumber) {
		this.cname = cname;
		this.cnumber = cnumber;
	}

	public void printCarDetails() {
		System.out.println("Car Details :" + "car_name :" + cname + "car Number :" + cnumber);
	}
}

public class ArrayOfObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1 = new car("WagonR", 100);
		car c2 = new car("alto", 101);
		car c3 = new car("swift", 102);

		car[] co = new car[3];
		co[0] = c1;
		co[1] = c2;
		co[2] = c3;

		for (car c : co) {
			c.printCarDetails();
		}
	}

}
