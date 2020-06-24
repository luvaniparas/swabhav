package SRC.Solution.Test;

import SRC.Solution.Invoice;
import SRC.Solution.InvoicePrinter;

public class InvoiceTest {

	public static void main(String[] args) {

		InvoicePrinter ip = new InvoicePrinter();
		Invoice iv = new Invoice(101, "John", 100, 10);

		ip.printToConsole(iv);
	}

}
