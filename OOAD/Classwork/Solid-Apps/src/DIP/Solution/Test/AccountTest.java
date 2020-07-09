package DIP.Solution.Test;

import DIP.Solution.TaxCalculation;
import DIP.Solution.XmlLogger;

public class AccountTest {

	public static void main(String[] args) {

		XmlLogger xml = new XmlLogger();
		TaxCalculation txc = new TaxCalculation(xml);

		System.out.println(txc.calculate(10, 5));
		System.out.println(txc.calculate(0, 0));

	}

}
