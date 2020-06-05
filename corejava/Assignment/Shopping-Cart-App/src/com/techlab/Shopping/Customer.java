package com.techlab.Shopping;

public class Customer {
	private int custid;
	private String custname, address, purchasedate;

	public Customer(int custid, String custname, String address, String purchasedate) {
		this.custid = custid;
		this.custname = custname;
		this.address = address;
		this.purchasedate = purchasedate;
	}

	public int getCustid() {
		return custid;
	}

	public String getCustname() {
		return custname;
	}

	public String getAddress() {
		return address;
	}

	public String getPurchasedate() {
		return purchasedate;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", address=" + address + ", purchasedate="
				+ purchasedate + "]";
	}
	

}
