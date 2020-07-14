package com.techlab.AutoMobile;

public class Audi implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Start "+EAutoType.AUDI.toString());
	}

	@Override
	public void stop() {
		System.out.println("Stop "+EAutoType.AUDI.toString());
	}

}
