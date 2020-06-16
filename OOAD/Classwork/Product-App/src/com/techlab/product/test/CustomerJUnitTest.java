package com.techlab.product.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.techlab.product.Customer;
import com.techlab.product.Product;

class CustomerJUnitTest {

	int expectedIndex = 0;
	int sId = 101;
	Customer c = new Customer("paras", "101");

	ArrayList<Product> prdList = c.getPrdList();
	ArrayList<Product> expectedPList = new ArrayList<Product>();

	Product p1 = new Product(101, 10, 100, "parle");
	Product p2 = new Product(102, 20, 100, "balaji");

	@Test
	void testConstructorCustomer() {

		String ExpectedCustomerName = "paras";
		String ExpectedCustomerAddress = "101";

		assertEquals(ExpectedCustomerName, c.getCustName());
		assertEquals(ExpectedCustomerAddress, c.getAddress());

	}

	@Test
	void testaddIntoCart() throws IOException {
		expectedPList.add(p1);

		Customer.addIntoCart(prdList);

		assertEquals(expectedPList, prdList);
	}

	@Test
	void testSearchFromCart() throws ClassNotFoundException, IOException {
		expectedPList.add(p1);

		int index = Customer.searchFromCart(expectedPList, sId);

		assertEquals(expectedIndex, index);

	}

	@Test
	void testDeletefromCart() throws ClassNotFoundException, IOException {
		expectedPList.add(p1);

		Customer.deleteFromCart(expectedPList, sId);

		assertEquals(expectedPList, prdList);
	}

	@Test
	void testTotalCartCost() {
		int expectedTotalCart = 170;
		expectedPList.add(p1);
		expectedPList.add(p2);

		int totalCart = Customer.totalCartCost(expectedPList);

		assertEquals(expectedTotalCart, totalCart);
	}

}

