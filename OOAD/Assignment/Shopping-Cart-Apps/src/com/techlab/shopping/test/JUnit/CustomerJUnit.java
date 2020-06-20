package com.techlab.shopping.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import com.techlab.shopping.Customer;
import com.techlab.shopping.LineItem;
import com.techlab.shopping.Order;

class CustomerJUnit {
	@Test
	void testCustomerConstructor() throws ParseException {

		String expectedCustomerName = "John";
		String expectedCustomeraddress = "404/galaxy";
		String customerDOB = "20/06/20";
		String expectedCustomerDOB = Customer.generateDate(customerDOB);

		Customer c1 = new Customer("John", "404/galaxy", "20/06/20");

		assertEquals(expectedCustomerName, c1.getCustomerName());
		assertEquals(expectedCustomeraddress, c1.getCustomeraddress());
		assertEquals(expectedCustomerDOB, c1.getCustomerDOB());
	}

}
