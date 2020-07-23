package com.techlab.car;

public class CarFactory {
	
	public static Car buildCar(ECarType type) {
		Car car = null;

		ELocation location = ELocation.INDIA;

		switch (location) {
		case USA:
			car = USACarFactory.buildCar(type);
			break;

		case INDIA:
			car = IndiaCarFactory.buildCar(type);
			break;

		default:
			break;
		}

		return car;

	}
}
