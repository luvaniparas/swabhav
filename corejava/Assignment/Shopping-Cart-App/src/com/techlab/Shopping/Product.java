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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + discount;
		result = prime * result + ((prodName == null) ? 0 : prodName.hashCode());
		result = prime * result + prodid;
		result = prime * result + unitPrice;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (discount != other.discount)
			return false;
		if (prodName == null) {
			if (other.prodName != null)
				return false;
		} else if (!prodName.equals(other.prodName))
			return false;
		if (prodid != other.prodid)
			return false;
		if (unitPrice != other.unitPrice)
			return false;
		return true;
	}

}
