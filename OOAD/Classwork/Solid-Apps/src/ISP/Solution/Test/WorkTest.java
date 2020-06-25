package ISP.Solution.Test;

import ISP.Solution.Human;
import ISP.Solution.Robots;

public class WorkTest {

	public static void main(String[] args) {

		System.out.println("Human :");
		Human h = new Human();
		h.startWork();
		h.stopWork();
		h.stopEat();
		h.stopEat();

		System.out.println("\nRobots :");
		Robots r = new Robots();
		r.startEat();
		r.stopEat();
	}

}
