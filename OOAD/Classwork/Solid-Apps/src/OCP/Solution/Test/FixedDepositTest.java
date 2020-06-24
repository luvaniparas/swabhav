package OCP.Solution.Test;

import OCP.Solution.DiwaliRate;
import OCP.Solution.FIxedDeposit;
import OCP.Solution.HoliRate;
import OCP.Solution.IFestivalRate;
import OCP.Solution.NormalRate;

public class FixedDepositTest {
	public static void main(String[] args) {

		IFestivalRate nr = new NormalRate();
		IFestivalRate hr = new HoliRate();
		IFestivalRate dr = new DiwaliRate();

		FIxedDeposit fd1 = new FIxedDeposit(101, "John", 1000, 1, nr);
		printInfo(fd1);

		FIxedDeposit fd2 = new FIxedDeposit(102, "Mike", 1000, 1, hr);
		printInfo(fd2);

		FIxedDeposit fd3 = new FIxedDeposit(103, "Joy", 1000, 1, dr);
		printInfo(fd3);

	}

	public static void printInfo(FIxedDeposit fd) {
		System.out.println(fd);
		System.out.println("SimpleIntereset : " + fd.calculateSimpleInterest());
	}
}
