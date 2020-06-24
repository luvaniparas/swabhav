package OCP.Violation.Test;

import OCP.Violation.FIxedDeposit;
import OCP.Violation.FestivalType;

public class FixedDepositTest {
	public static void main(String[] args) {

		FIxedDeposit fd1 = new FIxedDeposit(101, "John", 1000, 1, FestivalType.NORMAL);
		printInfo(fd1);

		FIxedDeposit fd2 = new FIxedDeposit(102, "Mike", 1000, 1, FestivalType.HOLI);
		printInfo(fd2);

		FIxedDeposit fd3 = new FIxedDeposit(103, "Joy", 1000, 1, FestivalType.DIWALI);
		printInfo(fd3);

	}

	public static void printInfo(FIxedDeposit fd) {
		System.out.println(fd);
		System.out.println("SimpleIntereset : " + fd.calculateSimpleInterest());
	}
}
