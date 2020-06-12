package com.techlab.LineCart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import com.techlab.LineCart.test.CartListTest;

public class LineCart implements Serializable {

	protected static ArrayList<Product> prdList = new ArrayList<Product>();
	static CartListTest clt = new CartListTest();

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
		Product p = clt.getProductInfo();
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
	public static void writeData(ArrayList<Product> pList) throws IOException {
		File f = new File("prd.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(pList);
		oos.close();
		fos.close();
	}

	// DeSerialization
	public static void readData(ArrayList<Product> pList) throws IOException, ClassNotFoundException {
		File f = new File("prd.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		pList =  (ArrayList<Product>) ois.readObject();
		System.out.println(pList);
		ois.close();
		fis.close();
	}

}
