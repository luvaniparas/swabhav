package LSP.violation.Test;

import LSP.violation.Car;
import LSP.violation.Cycle;
import LSP.violation.Engine;
import LSP.violation.TranspositionDevice;

public class TranspositionTest {

	public static void main(String[] args) {

		TranspositionDevice car = new Car("Car", 100, Engine.marutiEngine100cc);
		System.out.println(car);
		car.StartEngine();

		TranspositionDevice cycle = new Cycle("Cycle", 100, Engine.SuzukiEngine100cc);
		System.out.println(cycle);
		cycle.StartEngine();

	}

}
