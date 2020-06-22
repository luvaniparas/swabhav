package com.techlab.shopping;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Customer implements Serializable {

	private String customerId, customerName, customeraddress;
	private String customerDOB;
	static String LID = "C-ID-";
	static int RID = 1;
	boolean noOrder = false;

	private LinkedList<Order> oList;
	public static ArrayList<Customer> cList = new ArrayList<Customer>();

	public Customer(String customerName, String customeraddress, String customerDOB) throws ParseException {
		this.customerName = customerName;
		this.customeraddress = customeraddress;
		this.customerDOB = generateDate(customerDOB);
		this.customerId = genrateCid();
		this.oList = new LinkedList<Order>();
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public String getCustomerDOB() {
		return customerDOB;
	}

	public LinkedList<Order> getoList() {
		return oList;
	}

	public static String generateDate(String DOB) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date d = sdf.parse(DOB);
		String s = sdf.format(d);
		return s;
	}

	public static String genrateCid() {
		String id = LID + RID;
		RID++;
		return id;
	}

	public void addOrder(Order o) {
		if (!o.getLi().pList.isEmpty()) {
			oList.add(o);
		}
	}

	public void cancelOrder(Order o) {
		oList.remove(o);
	}

	public int countOrder() {
		return oList.size();
	}

	@Override
	public String toString() {
		String result = "";
		result += "\nCustomer => customerId = " + customerId + ", customerName = " + customerName
				+ ", customeraddress = " + customeraddress + ", customerDOB = " + customerDOB;

		if (oList.isEmpty()) {
			result += "\nNo Order ): ";
		} else {
			for (Order o : oList) {
				result += "\n" + "\n" + o.toString() + "\n";
			}
		}

		return result;

	}

}