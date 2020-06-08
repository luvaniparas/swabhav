package com.techlabs.Customer;

public class Customer {

	private String id;
	private String name;
	private int orders;
	private static int count = 999;

	public Customer(String name, int orders) {
		this.name = name;
		this.orders = orders;
		this.id = genrateId();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getOrders() {
		return orders;
	}

	public static String genrateId() {
		count++;
		String rid = Integer.toString(count);
		char lid = 'C';
		String id = lid + rid;
		return id;

	}
}
