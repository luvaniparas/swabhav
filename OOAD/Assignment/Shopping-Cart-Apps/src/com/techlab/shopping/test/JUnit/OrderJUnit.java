package com.techlab.shopping.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import com.techlab.shopping.LineItem;
import com.techlab.shopping.Order;

class OrderJUnit {

	@Test
	void testOrderConstructor() throws ParseException {
		int expectedOrderId = 101;

		LineItem li = null;

		Order o1 = new Order(101, li);

		assertEquals(expectedOrderId, o1.getOrderId());

	}

}
