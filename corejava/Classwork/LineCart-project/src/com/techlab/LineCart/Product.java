package com.techlab.LineCart;

import java.io.Serializable;

public class Product implements Serializable {

	private String prodName;
	private int prodid, discount, unitPrice;

	// No parameter Constructor for Object Creation
	public Product() {
	}

	public Product(int prodid, int discount, int unitPrice, String prodName) {
		this.prodid = prodid;
		this.discount = discount;
		this.unitPrice = unitPrice;
		this.prodName = prodName;
	}

	public int getProdid() {
		return prodid;
	}

	public int getDiscount() {
		return discount;
	}

	public int getUnitprice() {
		return unitPrice;
	}

	public String getProdname() {
		return prodName;
	}

	@Override
	public String toString() {
		return "Product [prodName=" + prodName + ", prodid=" + prodid + ", discount=" + discount + ", unitPrice="
				+ unitPrice + "]";
	}

}
