package DIP.Solution.Test;

import DIP.Solution.ILogType;
import DIP.Solution.TaxCalculation;

public class AccountTest {

	public static void main(String[] args) {

		TaxCalculation txc = new TaxCalculation(ILogType.xmllog);

		System.out.println(txc.calculate(10, 5));
		System.out.println(txc.calculate(0, 0));

	}

}
