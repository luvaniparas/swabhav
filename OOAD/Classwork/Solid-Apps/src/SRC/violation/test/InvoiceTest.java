package SRC.violation.test;

import SRC.violation.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {

		Invoice iv1 = new Invoice(101, "John", 100, 10);
		iv1.printToConsole(iv1);
	}

}
