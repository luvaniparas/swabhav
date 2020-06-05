package com.techlab.Cart.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.techlab.Cart.LineItem;

public class LineItemTest {

	public static void main(String[] args) {

		ArrayList<LineItem> cart = new ArrayList<LineItem>();

	    cart.add(new LineItem(101, 10, 30, "Apple")); // 300
		cart.add(new LineItem(105, 5, 15, "Banana"));// 75
		cart.add(new LineItem(199, 2, 85, "ToothPaste"));// 170

		Iterator<LineItem> iter = cart.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("Total Value : " + new LineItem().calculateTotal());
	}

}
