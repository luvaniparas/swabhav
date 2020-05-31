package com.techlab.movable.test;

import com.techlab.movable.Bike;
import com.techlab.movable.Car;
import com.techlab.movable.IMovable;
import com.techlab.movable.Truck;

public class MovableTest {

	public static void main(String[] args) {

		IMovable truckObj = new Truck();
		IMovable carObj = new Car();
		IMovable bikeObj = new Bike();

		IMovable obj[] = new IMovable[3];
		obj[0] = truckObj;
		obj[1] = carObj;
		obj[2] = bikeObj;

		printInfo(obj);
	}

	public static void printInfo(IMovable obj[]) {
		for (int i = 0; i < obj.length; i++) {
			System.out.println();
			obj[i].start();
			obj[i].stop();
		}
	}

}
