package com.techlab.car;

public class USACarFactory {

	static Car buildCar(ECarType carType) {

		Car car = null;

		switch (carType) {
		case MICRO:
			car = new MicroCar(ELocation.USA);
			break;

		case MINI:
			car = new MiniCar(ELocation.USA);
			break;

		case LUXURY:
			car = new MiniCar(ELocation.USA);
			break;

		default:
			break;
		}

		return car;
	}

}
