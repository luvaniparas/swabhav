package com.techlab.shopping.test.mainClass;

import java.io.IOException;
import java.text.ParseException;

import com.techlab.shopping.Customer;
import com.techlab.shopping.LineItem;
import com.techlab.shopping.Order;
import com.techlab.shopping.Product;
import com.techlab.shopping.SerializationCustomer;

public class ShoppingCartTest {

	public static void main(String[] args) throws ParseException, ClassNotFoundException, IOException {

		//Customer1
		LineItem li1 = new LineItem(101);
		li1.addIntoCart(new Product(101, "T-Shirt", 100, 10), 1);
		li1.addIntoCart(new Product(102, "Mobile", 100, 10), 1);
		li1.addIntoCart(new Product(103, "Earphone", 100, 10), 1);
		li1.addIntoCart(new Product(103, "Earphone", 100, 10), 1);

		Order o1 = new Order(01, li1);

		Customer c1 = new Customer("John", "404/galaxy", "31/03/1999");
		Customer.cList.add(c1);
		c1.addOrder(o1);

		LineItem li2 = new LineItem(102);
		li2.addIntoCart(new Product(102, "Mobile", 100, 10), 2);

		Order o2 = new Order(02, li2);
		c1.addOrder(o2);

		//Customer2
		Customer c2 = new Customer("Mike", "303/galaxy", "01/07/1999");
		Customer.cList.add(c2);

		LineItem li3 = new LineItem(103);
		Order o3 = new Order(03, li3);
		c2.addOrder(o3);
		
		//Serialization
		SerializationCustomer.writeData(Customer.cList);
		SerializationCustomer.readData(Customer.cList);

	}
}