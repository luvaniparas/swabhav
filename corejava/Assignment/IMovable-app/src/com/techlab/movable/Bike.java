package com.techlab.movable;

public class Bike implements IMovable{

	@Override
	public void start() {
		System.out.println("Bike has started ");	
	}

	@Override
	public void stop() {
		System.out.println("Bike has stopped ");
		
	}

}
