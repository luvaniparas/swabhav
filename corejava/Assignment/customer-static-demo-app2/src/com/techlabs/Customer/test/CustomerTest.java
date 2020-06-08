package com.techlabs.Customer.test;

import com.techlabs.Customer.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer("Customer1", 1);
		printInfo(c1);
		Customer c2 = new Customer("Customer2", 2);
		printInfo(c2);
		Customer c3 = new Customer("Customer3", 3);
		printInfo(c3);
	}
	
	public static void printInfo(Customer c) {
		System.out.println("\nName : "+c.getName());
		System.out.println("Orders : "+c.getOrders());
		System.out.println("Id : "+c.getId());
	}
}
