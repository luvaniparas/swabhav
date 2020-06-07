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

	public CustomerTest() {
		super();
	}

	// Scanner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		boolean exit = false;

		// Create Customer
		System.out.println("Enter Customer Details : ");
		Customer c = getCustomerInfo();

		do {
			System.out.println(
					"\nEnter 1.AddIntoCart\t\n2.SearchFromCart\t\n3.DeleteFromCart\t\n4.TotalCartCost\t\n5.Display\t\n6.Exit");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:  
				addIntoCart(prdList);
				map.put(c, prdList);
				writeData(map);
				System.out.println("Product Added -> "+prdList);
				break;

			case 2:
				int sId = getSid();
				int index = searchFromCart(prdList,sId);
				try {
				if(index != -1) {
					System.out.println(prdList.get(index));
				}
				}catch(Exception e) {
					System.out.println("No data found");
				}
				
				break;

			case 3:
				int sid= getSid();
				deleteFromCart(prdList,sid);
				writeData(map);
				break;

			case 4:
				int total = totalCartCost();
				System.out.println("Total Cart Cost = " + total + "₹");
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

	public static int getSid() {
		System.out.println("Enter product-id to Search ");
		int sId=sc.nextInt();
		return sId ;
	}
	
	public Product getProductInfo() {
		System.out.println("Enter Product-Id");
		int id = sc.nextInt();

		System.out.println("Enter Product-Discount");
		int discount = sc.nextInt();

		System.out.println("Enter Product-unitPrice");
		int unitPrice = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter Product-Name");
		String name = sc.nextLine();

		return new Product(id, discount, unitPrice, name);
		  
	}
	
	public static Customer getCustomerInfo() {

		System.out.println("Enter Name");
		String custName = sc.nextLine();

		System.out.println("Enter Address : ");
		String custAddress = sc.nextLine();

		Customer cObj = new Customer(custName, custAddress);
		System.out.println(cObj);

		return cObj;
	}



}
