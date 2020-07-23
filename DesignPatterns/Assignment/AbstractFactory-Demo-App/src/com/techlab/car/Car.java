package com.techlab.car;

public abstract class Car {

	private ECarType model;
	private ELocation location;

	public Car(ECarType model, ELocation location) {
		this.model = model;
		this.location = location;
	}

	public ECarType getModel() {
		return model;
	}

	public ELocation getLocation() {
		return location;
	}

	abstract void construct();

	@Override
	public String toString() {
		return "Car [model=" + model + ", location=" + location + "]";
	}

}
