package SRC.Solution;

//InVoice 
public class InvoicePrinter {

	public void printToConsole(Invoice iv1) {
		System.out.println("InVoice Data :");
		System.out.println(iv1);
		System.out.println("Calculate Discount : " + iv1.calculateDiscount());
		System.out.println("Calculate GST : " + iv1.calculateGST());
		System.out.println("Calculate TotalCost : " + iv1.calculateTotalCost());
	}

}
