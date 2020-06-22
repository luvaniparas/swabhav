package com.techlab.shopping.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import com.techlab.shopping.LineItem;
import com.techlab.shopping.Product;

class liJUnit {

	LineItem li = new LineItem(101);

	Product p1 = new Product(101, "Shoes", 100, 10);
	Product p2 = new Product(101, "Shoes", 100, 10);
	Product p3 = new Product(103, "Speakers", 100, 10);

	LinkedList<Product> expectedpList = new LinkedList<Product>();

	@Test
	void testAddIntoCart() {
		p1.setProductQuantity(1);
		p2.setProductQuantity(5);

		li.pList.add(p1);

		expectedpList.add(p2);

		li.addIntoCart(p2, 5);

		assertEquals(expectedpList, li.pList);

	}

	@Test
	void testTotalCartCost() {
		p1.setProductQuantity(2);
		p3.setProductQuantity(1);

		li.pList.add(p1);
		li.pList.add(p3);

		int expectedTotalCart = 270;

		int totalCart = li.totalCartCost();

		assertEquals(expectedTotalCart, totalCart);

	}

	@Test
	void testSearchFromCart() throws ClassNotFoundException, IOException {
		p1.setProductQuantity(2);
		p3.setProductQuantity(1);

		li.pList.add(p1);
		li.pList.add(p3);

		int expectedIndex = 1;

		int index = li.searchFromCart(103);

		assertEquals(expectedIndex, index);

	}

	@Test
	void testDeleteFromCart() throws ClassNotFoundException, IOException {
		p1.setProductQuantity(2);
		p3.setProductQuantity(1);

		li.pList.add(p1);
		li.pList.add(p3);

		expectedpList.add(p2);

		li.deleteFromCart(103);

		assertEquals(expectedpList, li.pList);

	}

	@Test
	void testCountProduct() {
		p1.setProductQuantity(2);
		p3.setProductQuantity(1);

		li.pList.add(p1);
		li.pList.add(p3);

		int expectedCount = 2;

		int count = li.countProduct();

		assertEquals(expectedCount, count);
	}

}
