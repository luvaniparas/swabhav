package com.techlab.shopping.test.mainClass;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedList;

import com.techlab.shopping.Customer;
import com.techlab.shopping.LineItem;
import com.techlab.shopping.Order;
import com.techlab.shopping.Product;
import com.techlab.shopping.TextData;

public class ShoppingCartTest {

	public static void main(String[] args) throws ParseException, ClassNotFoundException, IOException {

		ArrayList<Customer> cList = new ArrayList<Customer>();

		Product p1 = new Product(101, "T-Shirt", 100, 10);
		p1.setProductQuantity(1);
		Product p2 = new Product(102, "Mobile", 100, 10);
		p2.setProductQuantity(1);
		Product p3 = new Product(103, "Earphone", 100, 10);
		p3.setProductQuantity(1);
		// Duplicate of p1
		Product p4 = new Product(101, "T-Shirt", 100, 10);
		p4.setProductQuantity(2);

		LineItem li1 = new LineItem(101);

		LineItem.addIntoCart(p1, p1.getProductQuantity());
		LineItem.addIntoCart(p2, p2.getProductQuantity());
		LineItem.addIntoCart(p3, p3.getProductQuantity());
		LineItem.addIntoCart(p4, p4.getProductQuantity());

		LineItem.displayCart();

		int index = LineItem.searchFromCart(103);
		System.out.println("\nSearch : " + LineItem.pList.get(index));

		LineItem.deleteFromCart(103);
		System.out.println("\nAfter Delete : ");
		LineItem.displayCart();

		int count = LineItem.countProduct();
		System.out.println("\nProduct Count : " + count);

		int total = LineItem.totalCartCost(LineItem.pList);
		System.out.println("\nTotalCart : " + total);

		Order o1 = new Order(01, li1);

		Customer c1 = new Customer("John", "404/galaxy", "31/03/1999");
		c1.addOrder(o1);
		count = c1.countOrder();
		System.out.println("Order Count :  " + count);
		cList.add(c1);

		Customer c2 = new Customer("NewJohn", "404/galaxy", "31/03/1999");
		cList.add(c2);

		LineItem li2 = new LineItem(102);
		LineItem.addIntoCart(p4, p4.getProductQuantity());

		Order o2 = new Order(02, li2);
		c1.addOrder(o2);

		TextData.writeData(cList);
		TextData.readData(cList);

	}
}
