package com.techlab.AutoMobile;

public class Bmw implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Start " + EAutoType.BMW.toString());
	}

	@Override
	public void stop() {
		System.out.println("Stop " + EAutoType.BMW.toString());
	}

}
