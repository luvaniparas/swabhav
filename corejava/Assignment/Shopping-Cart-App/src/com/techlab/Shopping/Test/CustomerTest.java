package com.techlab.Shopping.Test;

import java.io.*;
import java.util.*;

import com.techlab.Shopping.Customer;
import com.techlab.Shopping.Product;

public class CustomerTest extends Customer {
	// Constructor
	public CustomerTest(String custName, String address) {
		super(custName, address);
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		boolean exit = false;

		// Create Customer
		System.out.println("Enter Customer Details -> ");
		Customer c = getCustomerInfo();

		do {
			System.out.println(
					"\nEnter 1.AddIntoCart\t\n2.TotalCartCost\t\n3.SearchFromCart\t\n4.DeleteFromCart\t\n5.Display\t\n6.Exit");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				addIntoCart(prdList);
				map.put(c, prdList);
				writeData(map);
				System.out.println("Product Added -> " + prdList);
				break;

			case 2:
				int total = totalCartCost(prdList);
				System.out.println("Total Cart Cost = " + total + "₹");
				break;

			case 3:
				int sId = getId();
				int index = searchFromCart(prdList, sId);
				try {
					if (index != -1) {
						System.out.println(prdList.get(index));
					} else {
						throw new NotFoundException("No data found ):");
					}
				} catch (NotFoundException e) {
					System.err.println(e.getMessage());
				}
				break;

			case 4:
				int sid = getId();
				deleteFromCart(prdList, sid);
				writeData(map);
				readData(map);
				break;

			case 5:
				readData(map);
				break;

			case 6:
				exit = true;
				break;

			default:
				System.out.println("Enter Valid choice");
			}
		} while (!exit);
		System.out.println("Thanks For Shopping ... ");

	}

	public static String getName() {
		System.out.println("Enter Name -> ");
		String name = sc.nextLine();
		return name;
	}

	public static int getId() {
		sc.nextLine();
		System.out.println("Enter Product-id -> ");
		int Id = sc.nextInt();
		return Id;
	}

	public Product getProductInfo() {
		System.out.println("Enter Product Information -> ");

		int id = getId();
		id = validateInt(id);

		sc.nextLine();
		String prdName = getName();
		prdName = validateString(prdName);

		System.out.println("Enter UnitPrice -> ");
		int unitPrice = sc.nextInt();
		unitPrice = validateInt(unitPrice);

		System.out.println("Enter Discount -> ");
		int discount = sc.nextInt();
		discount = validateInt(discount);
		discount = validateDiscount(discount);

		return new Product(id, discount, unitPrice, prdName);
	}

	public static Customer getCustomerInfo() {
		String custName = getName();
		custName = validateString(custName);

		System.out.println("Enter Address -> ");
		String custAddress = sc.nextLine();
		custAddress = validateString(custAddress);

		Customer cObj = new Customer(custName, custAddress);
		System.out.println(cObj);

		return cObj;
	}

}
