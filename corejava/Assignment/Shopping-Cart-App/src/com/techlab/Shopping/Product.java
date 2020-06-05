package com.techlab.Shopping;

public class Product {
	private int id, prodid, discount, unitprice;
	private String prodname;

	public Product(int id, int prodid, int discount, int unitprice, String prodname) {
		this.id = id;
		this.prodid = prodid;
		this.discount = discount;
		this.unitprice = unitprice;
		this.prodname = prodname;
	}

	public int getId() {
		return id;
	}

	public int getProdid() {
		return prodid;
	}

	public int getDiscount() {
		return discount;
	}

	public int getUnitprice() {
		return unitprice;
	}

	public String getProdname() {
		return prodname;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", prodid=" + prodid + ", discount=" + discount + ", unitprice=" + unitprice
				+ ", prodname=" + prodname + "]";
	}

}
