package com.techlab;

public class Car extends Vehicle {

	public Car(IWorkshop workshop1, IWorkshop workshop2) {
		super(workshop1, workshop2);
	}

	@Override
	public void manufacture() {
		System.out.print("Car ");
		workshop1.work();
		workshop2.work();
	}

}
