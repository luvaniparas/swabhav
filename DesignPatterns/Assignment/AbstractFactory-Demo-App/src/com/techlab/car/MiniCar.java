package com.techlab.car;

public class MiniCar extends Car {

	public MiniCar(ELocation location) {
		super(ECarType.MINI, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Connecting to MiniCar");
	}

}
