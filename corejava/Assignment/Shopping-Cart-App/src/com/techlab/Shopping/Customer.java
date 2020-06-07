package com.techlab.Shopping;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

import com.techlab.Shopping.Test.CustomerTest;

public class Customer implements Serializable {
	static Scanner sc = new Scanner(System.in);

	private String custId, custName, address;
	private LocalDate purchaseDate;
	static String LID = "C-ID-";
	static int RID = 1;

	static CustomerTest cTestObj = new CustomerTest();

	protected static ArrayList<Product> prdList = new ArrayList<Product>();
	protected static HashMap<Customer, ArrayList<Product>> map = new HashMap();

	public Customer(String custName, String address) {
		this.custId = genrateCid();
		this.custName = custName;
		this.address = address;
		this.purchaseDate = LocalDate.now();
	}

	public Customer() {	}

	public static String genrateCid() {
		String id = LID + RID;
		RID++;
		return id;
	}

	public static void addIntoCart(ArrayList<Product> prdList) throws IOException {
		Product p = cTestObj.getProductInfo();
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

	public static int totalCartCost() {
		Product p = new Product();
		int totalCost = p.getTotalCost();
		return totalCost;
	}

	public static void writeData(HashMap<Customer, ArrayList<Product>> map) throws IOException {
		File prd = new File("ProductData.txt");
		FileOutputStream fos = new FileOutputStream(prd);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(map);
		oos.close();
		fos.close();
	}

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

}
