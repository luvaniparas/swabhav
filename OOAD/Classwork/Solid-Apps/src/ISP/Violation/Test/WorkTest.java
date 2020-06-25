package ISP.Violation.Test;

import ISP.Violation.IWorkable;
import ISP.Violation.Managers;
import ISP.Violation.Robots;

public class WorkTest {

	public static void main(String[] args) {

		System.out.println("Managers :");

		IWorkable mn = new Managers();
		printInfo(mn);

		System.out.println("\nRobot :");
		IWorkable r = new Robots();
		printInfo(r);
	}

	public static void printInfo(IWorkable i) {
		i.startWork();
		i.stopWork();
		i.startEat();
		i.stopEat();
	}
}
