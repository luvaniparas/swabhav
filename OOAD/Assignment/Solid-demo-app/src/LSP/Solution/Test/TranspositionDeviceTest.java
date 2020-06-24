package LSP.Solution.Test;

import LSP.Solution.Car;
import LSP.Solution.Cycle;
import LSP.Solution.DeviceWithEngine;
import LSP.Solution.DeviceWithoutEngine;
import LSP.Solution.Engine;

public class TranspositionDeviceTest {
	public static void main(String[] args) {

		DeviceWithEngine car = new Car("Car", 100);
		car.setEngine(Engine.marutiEngine100cc);
		System.out.println(car);
		System.out.println("Engine : "+car.getEngine());

		DeviceWithoutEngine cycle = new Cycle("Cycle", 100);
		System.out.println(cycle);
		cycle.startMoving();

	}

}
