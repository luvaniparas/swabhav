package com.techlab.car;

public class IndiaCarFactory {

	static Car buildCar(ECarType carType) {

		Car car = null;

		switch (carType) {
		case MICRO:
			car = new MicroCar(ELocation.INDIA);
			break;

		case MINI:
			car = new MiniCar(ELocation.INDIA);
			break;

		case LUXURY:
			car = new MiniCar(ELocation.INDIA);
			break;

		default:
			break;
		}

		return car;
	}

}
