package DIP.Violation.Test;

import DIP.Violation.LogType;
import DIP.Violation.TaxCalculation;

public class AccountTest {

	public static void main(String[] args) {

		TaxCalculation txc = new TaxCalculation(LogType.XML);

		System.out.println(txc.calculate(10, 5));
		System.out.println(txc.calculate(0, 0));

	}

}
