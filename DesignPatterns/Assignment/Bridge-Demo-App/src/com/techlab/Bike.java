package com.techlab;

public class Bike extends Vehicle {
	
	public Bike(IWorkshop workshop1, IWorkshop workshop2) {
		super(workshop1, workshop2);
	}

	@Override
	public void manufacture() {
		System.out.print("Bike ");
		workshop1.work();
		workshop2.work();
	}
}
