package com.techlab.shopping.test.mainClass;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.shopping.Customer;
import com.techlab.shopping.Product;

public class NewShoppingCart {

	static ArrayList<Product> aProductList = new ArrayList<Product>();

	ArrayList<Customer> cList = new ArrayList<Customer>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		addIntoAvaliableProductlist();

		boolean exit = false;
		do {
			System.out.println("Enter \n1.Customer Operations : \n2.Exit");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter \n1.DisplayProducts \n1.AddIntoCart");
				ch = sc.nextInt();
				do {
					switch (ch) {
					case 1:
						displayProductlist();
						break;

					case 2:
						exit = true;
						System.out.println("Inner Visit Again (: ");
						break;

					default:
						System.out.println("Inner Enter Valid Choice ): ");
					}

				} while (exit);
				break;

			case 2:
				System.out.println("Visit Again (: ");
				exit = true;
				break;

			default:
				System.out.println("Enter Valid Choice ): ");
			}

		} while (!exit);

	}

	public static void addIntoAvaliableProductlist() {
		aProductList.add(new Product(101, "T-Shirt", 100, 10));
		aProductList.add(new Product(102, "Mobile", 100, 10));
		aProductList.add(new Product(103, "Earphone", 100, 10));

		Product p = getProductInfo();
		aProductList.add(p);
	}

	public static void displayProductlist() {
		for (int i = 0; i < aProductList.size(); i++) {
			System.out.println(aProductList.get(i));
		}
	}

	public static Product getProductInfo() {
		System.out.println("Enter Product Information => ");

		System.out.println("Enter Product name : ");
		String name = sc.next();

		System.out.println("Enter Product Id : ");
		int id = sc.nextInt();

		System.out.println("Enter Product Unit Price : ");
		int up = sc.nextInt();

		System.out.println("Enter Product Discount : ");
		int discount = sc.nextInt();

		return new Product(id, name, up, discount);
	}

}
