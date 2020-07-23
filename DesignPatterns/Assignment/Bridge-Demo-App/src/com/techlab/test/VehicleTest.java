package com.techlab.test;

import com.techlab.Assemble;
import com.techlab.Bike;
import com.techlab.Car;
import com.techlab.Produce;
import com.techlab.Vehicle;

public class VehicleTest {

	public static void main(String[] args) {

		Vehicle v1 = new Car(new Produce(), new Assemble());
		v1.manufacture();

		System.out.println();
		
		Vehicle v2 = new Bike(new Produce(), new Assemble());
		v2.manufacture();
		
	}

}
