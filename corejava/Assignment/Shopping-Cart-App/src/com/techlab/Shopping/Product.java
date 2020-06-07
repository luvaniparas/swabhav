package com.techlab.Shopping;

import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Serializable {
	private int prodid, discount, unitPrice;
	private String prodName;
	static private int totalCost = 0 ;
	
	//No parameter Constructor for Object Creation
	public Product() {}
	
	public Product(int prodid, int discount, int unitPrice, String prodName) {
		this.prodid = prodid;
		this.discount = discount;
		this.unitPrice = unitPrice;
		this.prodName = prodName;
		totalCost += unitPrice -(discount % 100) ;
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

	public int getTotalCost() {
		return totalCost;
	}
	
	public String getProdname() {
		return prodName;
	}

	@Override
	public String toString() {
		return "Product [ prodid=" + prodid + ", discount=" + discount + ", unitprice=" + unitPrice + ", prodname="
				+ prodName + "]";
	}

}
