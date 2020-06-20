package com.techlab.shopping.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlab.shopping.Product;

class ProductJUnit {

	@Test
	void testProductConstructor() {
		int expectedProductId = 101;
		String expectedProductName = "T-Shirt";
		int expectedProductUnitPrice = 100;
		int expectedProductDiscount = 10;
		int expectedProductQuantity = 2;

		Product p1 = new Product(101, "T-Shirt", 100, 10);
		p1.setProductQuantity(2);

		assertEquals(expectedProductId, p1.getProductId());
		assertEquals(expectedProductName, p1.getProductName());
		assertEquals(expectedProductUnitPrice, p1.getProductUnitPrice());
		assertEquals(expectedProductDiscount, p1.getProductDiscount());
		assertEquals(expectedProductQuantity, p1.getProductQuantity());

	}

}
