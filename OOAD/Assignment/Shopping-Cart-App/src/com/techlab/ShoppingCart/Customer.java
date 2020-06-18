package com.techlab.ShoppingCart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Customer implements Serializable {
	private String customerId, customerName, customeraddress;
	private LocalDate customerPurchaseDate;
	private Date customerDOB;
	static String LID = "C-ID-";
	static int RID = 1;

	private static LinkedList<Order> oList = new LinkedList<Order>();
	public static ArrayList<Customer> cList = new ArrayList<>();

	public Customer(String customerName, String customeraddress, String DOB) throws ParseException {
		this.customerId = genrateCid();
		this.customerName = customerName;
		this.customeraddress = customeraddress;
		this.customerDOB = generateDate(DOB);
		this.customerPurchaseDate = LocalDate.now();
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public String getCustomerId() {
		return customerId;
	}

	public Date getCustomerDOB() {
		return customerDOB;
	}

	public LocalDate getCustomerPurchaseDate() {
		return customerPurchaseDate;
	}

	public LinkedList<Order> getOrders() {
		return oList;
	}

	public static Date generateDate(String DOB) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date d = sdf.parse(DOB);
		return d;

	}

	public static String genrateCid() {
		String id = LID + RID;
		RID++;
		return id;
	}

	public void addOrder(Order o) {
		oList.add(o);
	}

	public void deleteOrder(Order o) {
		oList.remove(o);
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customeraddress="
				+ customeraddress + ", customerPurchaseDate=" + customerPurchaseDate + ", customerDOB=" + customerDOB
				+ "oList : " + oList + "]";
	}

	static File f = new File("ShoppingCart.txt");

	public static void writedata(ArrayList<Customer> cList) throws IOException {
		FileOutputStream fileOut = new FileOutputStream(f);
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(cList);
		out.close();
		fileOut.close();
	}

	public static void readdata(ArrayList<Customer> cList) throws IOException, ClassNotFoundException {

		FileInputStream fileIn = new FileInputStream(f);
		ObjectInputStream in = new ObjectInputStream(fileIn);
		cList = (ArrayList<Customer>) in.readObject();
		System.out.println(cList);
		in.close();
		fileIn.close();

	}

}
