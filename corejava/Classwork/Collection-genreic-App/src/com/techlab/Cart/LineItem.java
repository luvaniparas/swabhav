package com.techlab.Cart;

public class LineItem {
	private int id;
	private double unitPrice;
	private int quantity;
	private String name;
	static double total;

	public LineItem(int id, double unitPrice, int quantity, String name) {
		this.id = id;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.name = name;
		total += (unitPrice * quantity);
	}

	public LineItem() {

	}

	public int getId() {
		return id;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getName() {
		return name;
	}

	public double calculateTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", name=" + name + "]";
	}

}
