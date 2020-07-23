package com.techlab.car.test;

import com.techlab.car.CarFactory;
import com.techlab.car.ECarType;

public class CarTest {

	public static void main(String[] args) {

		System.out.println(CarFactory.buildCar(ECarType.MICRO));
		System.out.println(CarFactory.buildCar(ECarType.MINI));
		System.out.println(CarFactory.buildCar(ECarType.LUXURY));

	}

}
