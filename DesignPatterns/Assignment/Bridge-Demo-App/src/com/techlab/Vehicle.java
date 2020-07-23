package com.techlab;

public abstract class Vehicle {

	protected IWorkshop workshop1, workshop2;

	public Vehicle(IWorkshop workshop1, IWorkshop workshop2) {
		this.workshop1 = workshop1;
		this.workshop2 = workshop2;
	}

	abstract public void manufacture();

}
