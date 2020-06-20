package com.techlab.shopping;

import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedList;

public class LineItem implements Serializable {

	private int cartId;
	public static LinkedList<Product> pList;

	public LineItem(int cartId) {
		this.cartId = cartId;
		// LinkedList<Product> pList = new LinkedList<Product>();
		this.pList = new LinkedList<Product>();
	}

	public int getCartId() {
		return cartId;
	}

	public static LinkedList<Product> getpList() {
		return pList;
	}

	public static void addIntoCart(Product p, int productQuantity) {
		boolean productAdded = false;

		for (int i = 0; i < pList.size(); i++) {
			if (p.getProductId() == pList.get(i).getProductId()) {
				pList.get(i).setProductQuantity(productQuantity);
				productAdded = true;
			}
		}

		if (!productAdded) {
			pList.add(p);
			p.setProductQuantity(productQuantity);
		}

	}

	public static int totalCartCost(LinkedList<Product> pList) {
		int discount = 0, unitPrice = 0, totalCart = 0, quantity = 0;
		for (int i = 0; i < pList.size(); i++) {
			discount = pList.get(i).getProductDiscount();
			unitPrice = pList.get(i).getProductUnitPrice();
			quantity = pList.get(i).getProductQuantity();
			totalCart += (quantity * (unitPrice - (discount % 100)));
		}
		return totalCart;

	}

	public static int searchFromCart(int sId) throws ClassNotFoundException, IOException {
		int x = -1;
		for (int i = 0; i < getpList().size(); i++) {
			int iId = getpList().get(i).getProductId();
			if (iId == sId) {
				x = i;
			}
		}
		return x;
	}

	public static void deleteFromCart(int sId) throws ClassNotFoundException, IOException {
		int index = searchFromCart(sId);
		if (index != -1) {
			pList.remove(index);
		}
	}

	public static void displayCart() {
		for (Object o : pList) {
			System.out.println(o);
		}
	}

	public static int countProduct() {
		return pList.size();
	}

	@Override
	public String toString() {
		String result = "";

		result += "LineItem => CartId = " + cartId + "\nProductList =>";

		for (Product p : pList) {
			result +="\n"+ p.toString();
		}

		return result;
	}

}
