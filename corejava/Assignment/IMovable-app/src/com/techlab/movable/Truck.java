package com.techlab.movable;

public class Truck implements IMovable {

	@Override
	public void start() {
		System.out.println("Truck has Started ");		
	}

	@Override
	public void stop() {
		System.out.println("Truck has Stoped ");			
	}



}
