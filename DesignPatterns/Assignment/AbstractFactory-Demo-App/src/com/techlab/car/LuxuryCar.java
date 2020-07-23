package com.techlab.car;

public class LuxuryCar extends Car {

	LuxuryCar(ELocation location) {
		super(ECarType.LUXURY, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Connecting to LuxuryCar ");
	}

}
