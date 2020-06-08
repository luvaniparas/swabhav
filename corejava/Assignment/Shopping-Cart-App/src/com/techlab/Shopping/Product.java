package com.techlab.Shopping;

import java.io.Serializable;

public class Product implements Serializable {
	private int prodid, discount, unitPrice;
	private String prodName;

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
		return "Product [ ProductId=" + prodid + ", Discount=" + discount + ", UnitPrice=" + unitPrice
				+ ", ProductName=" + prodName + "]";
	}

}
