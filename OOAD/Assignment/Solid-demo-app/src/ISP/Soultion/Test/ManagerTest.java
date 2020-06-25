package ISP.Soultion.Test;

import ISP.Solution.Human;
import ISP.Solution.Manager;
import ISP.Solution.Robot;

public class ManagerTest {

	public static void main(String[] args) {

		Human h = new Human();
		Robot r = new Robot();

		Manager mn = new Manager();
		mn.setWorker(h);
		mn.work();
		mn.setEat(h);
		mn.eat();

		mn.setWorker(r);
		mn.work();
	}

}
