package ISP.Violation.Test;

import ISP.Violation.Human;
import ISP.Violation.Manager;
import ISP.Violation.Robot;

public class ManagerTest {
	public static void main(String[] args) {
		Human h = new Human();
		Robot r = new Robot();

		Manager mn = new Manager();
		mn.setWorker(h);
		mn.manage();

		mn.setWorker(r);
		mn.manage();

	}
}
