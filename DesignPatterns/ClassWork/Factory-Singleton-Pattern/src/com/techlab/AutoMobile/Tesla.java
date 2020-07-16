package com.techlab.AutoMobile;

public class Tesla implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Start " + EAutoType.TESLA.toString());
	}

	@Override
	public void stop() {
		System.out.println("Stop " + EAutoType.TESLA.toString());
	}

}
