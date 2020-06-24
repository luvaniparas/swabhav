package SRC.violation;

public class Invoice {

	private int id;
	private String name;
	private double amount, discountPercenteage;
	public static final float GST = 18;

	public Invoice(int id, String name, double amount, double discountPercenteage) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.discountPercenteage = discountPercenteage;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public double getDiscountPercenteage() {
		return discountPercenteage;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", name=" + name + ", amount=" + amount + ", discountPercenteage="
				+ discountPercenteage + "]";
	}

	public double calculateDiscount() {
		return (discountPercenteage / 100) * amount;

	}

	public double calculateGST() {
		return amount * GST / 100;
	}

	public double calculateTotalCost() {
		return (amount - calculateDiscount()) + calculateGST();
	}

	public void printToConsole(Invoice iv) {
		System.out.println("InVoice Data :");
		System.out.println(iv);
		System.out.println("Calculate Discount : " + iv.calculateDiscount());
		System.out.println("Calculate GST : " + iv.calculateGST());
		System.out.println("Calculate TotalCost : " + iv.calculateTotalCost());
	}
}
