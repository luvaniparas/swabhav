package com.techlab.ShoppingCart.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.Scanner;

import com.techlab.ShoppingCart.Customer;
import com.techlab.ShoppingCart.LineItem;
import com.techlab.ShoppingCart.Order;
import com.techlab.ShoppingCart.Product;

public class ShoppingTest {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {

		LinkedList<Product> pList1 = new LinkedList<Product>();

		Product p1 = new Product(101, "NikeShoes", 100, 10);
		Product p2 = new Product(102, "PumaShoes", 100, 15);
		Product p3 = new Product(103, "AdidasShoes", 100, 5);
		Product p4 = new Product(103, "AdidasShoes", 100, 5);

		pList1.add(p1);
		p1.setProductQuantity(1);
		pList1.add(p2);
		p2.setProductQuantity(2);
		pList1.add(p3);
		p3.setProductQuantity(3);
		
		LineItem cart1 = new LineItem(01, pList1);
		//NoDublicateData
		LineItem.AddIntoCart(pList1, p4, 1);

		Order o1 = new Order(1, "Shoes", cart1);

		Customer c1 = new Customer("John", "WinterFell", "02/04/1990");
		c1.addOrder(o1);
		Customer.cList.add(c1);
		Customer.writedata(Customer.cList);
		
		System.out.println("Deserilization : ");
		Customer.readdata(Customer.cList);

		printCustomerInfo(c1);
		printOrderInfo(o1);
		printProducts(pList1);

		// TotalCartCost
		System.out.println("\nTotalCart Cost : ");
		int total = LineItem.totalCartCost(pList1);
		System.out.println(total);

		// Delete Operation
		System.out.println("\nDelete Operation :");
		LineItem.deleteFromCart(pList1, 103);
		System.out.println(pList1);
	}

	public static void printCustomerInfo(Customer c) {
		System.out.println("\n" + c);
	}

	public static void printOrderInfo(Order orders) {
		System.out.println("\n" + orders);
	}

	public static void printProducts(LinkedList<Product> product) {
		System.out.println();
		for (Product p : product)
			System.out.println(p);
	}
}
