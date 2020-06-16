package com.techlab.product;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.techlab.product.test.CustomerTest;

public class Customer implements Serializable {
	static Scanner sc = new Scanner(System.in);
	private String custId, custName, address;
	private LocalDate purchaseDate;
	static String LID = "C-ID-";
	static int RID = 1;

	protected static ArrayList<Product> prdList = new ArrayList<Product>();
	protected static HashMap<Customer, ArrayList<Product>> map = new HashMap<Customer, ArrayList<Product>>();

	public Customer(String custName, String address) {
		this.custId = genrateCid();
		this.custName = custName;
		this.address = address;
		this.purchaseDate = LocalDate.now();
	}

	public String getCustName() {
		return custName;
	}

	public String getAddress() {
		return address;
	}

	public ArrayList<Product> getPrdList() {
		return prdList;
	}

	public static String genrateCid() {
		String id = LID + RID;
		RID++;
		return id;
	}

	public static String validateString(String s) {
		String us = "UnSpecified";
		if (s.isEmpty() == true) {
			s = us;
		}
		return s;
	}

	public static int validateInt(int n) {
		n = Math.abs(n);
		return n;
	}

	public static int validateDiscount(int discount) {
		int maxDiscount = 49;

		if (discount > 49) {
			discount = maxDiscount;
		} else {
			discount = discount;
		}
		return discount;
	}

	public static void addIntoCart(ArrayList<Product> prdList) throws IOException {
		Product p = new CustomerTest(null, null).getProductInfo();
		prdList.add(p);
	}

	public static int searchFromCart(ArrayList<Product> prdList, int sId) throws ClassNotFoundException, IOException {
		int x = -1;
		for (int i = 0; i < prdList.size(); i++) {
			int iId = prdList.get(i).getProdid();
			if (iId == sId) {
				x = i;
			}
		}
		return x;
	}

	public static void deleteFromCart(ArrayList<Product> prdList, int sId) throws ClassNotFoundException, IOException {
		int index = searchFromCart(prdList, sId);
		if (index != -1) {
			prdList.remove(index);
		}
	}

	public static int totalCartCost(ArrayList<Product> prdList) {
		int discount = 0, unitPrice = 0, totalCart = 0;
		for (int i = 0; i < prdList.size(); i++) {
			discount = prdList.get(i).getDiscount();
			unitPrice = prdList.get(i).getUnitprice();
			totalCart += unitPrice - (discount % 100);
		}
		return totalCart;

	}

	// Serialization
	public static void writeData(HashMap<Customer, ArrayList<Product>> map) throws IOException {
		File prd = new File("ProductData.txt");
		FileOutputStream fos = new FileOutputStream(prd);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(map);
		oos.close();
		fos.close();
	}

	// DeSerialization
	public static void readData(HashMap<Customer, ArrayList<Product>> map) throws IOException, ClassNotFoundException {
		File prd = new File("ProductData.txt");
		FileInputStream fis = new FileInputStream(prd);
		ObjectInputStream ois = new ObjectInputStream(fis);
		map = (HashMap<Customer, ArrayList<Product>>) ois.readObject();
		System.out.println(map);
		ois.close();
		fis.close();
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", address=" + address + ", purchaseDate="
				+ purchaseDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
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
		Customer other = (Customer) obj;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		return true;
	}

}