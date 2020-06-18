package com.techlab.ShoppingCart;

import java.io.IOException;
import java.util.LinkedList;

public class LineItem {

	private int cartId;
	public static LinkedList<Product> pList;

	// getter
	public int getCartId() {
		return cartId;
	}

	// Constructor
	public LineItem(int cartId, LinkedList<Product> pList) {
		this.cartId = cartId;
		LineItem.pList = pList;
	}

	public static void AddIntoCart(LinkedList<Product> pList1, Product p, int quantity) {
		for (int i = 0; i < pList1.size(); i++) {
			if (pList1.get(i).getProductId() == p.getProductId()) {
				pList1.get(i).setProductQuantity(quantity);
				break;
			}
		}
	}

	public static int searchFromCart(int sId) throws ClassNotFoundException, IOException {
		int x = -1;
		for (int i = 0; i < pList.size(); i++) {
			int iId = pList.get(i).getProductId();
			if (iId == sId) {
				x = i;
			}
		}
		return x;
	}

	public static void deleteFromCart(LinkedList<Product> pList, int sId) throws ClassNotFoundException, IOException {
		int index = searchFromCart(sId);
		if (index != -1) {
			pList.remove(index);
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

	public static LinkedList<Product> displayCart() {
		return pList;
	}

	@Override
	public String toString() {
		return "LineItem [cartId=" + cartId + "Product : "+pList +"]";
		
	}

}
