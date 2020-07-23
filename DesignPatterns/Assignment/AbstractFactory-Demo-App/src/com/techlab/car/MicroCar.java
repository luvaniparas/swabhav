package com.techlab.car;

public class MicroCar extends Car {

	public MicroCar(ELocation location) {
		super(ECarType.MICRO, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Connecting to MicroCar");
	}

}
