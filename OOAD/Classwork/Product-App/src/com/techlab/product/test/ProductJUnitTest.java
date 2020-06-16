package com.techlab.product.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techlab.product.Product;

class ProductJUnitTest {

	@BeforeAll
	public static void BeforeAllAnnotation() {
		System.out.println("@BeforeAll");
	}

	@BeforeEach
	public void beforeAnnotation() {
		System.out.println("@Before Annotation");
	}

	@Test
	void testParameterConstructorProduct() {
		int expectedProdId = 1;
		int expectedDiscount = 10;
		int expectedUnitPrice = 100;
		String expectedProdName = "parle";

		Product p = new Product(1, 10, 100, "parle");

		assertEquals(expectedProdId, p.getProdid());
		assertEquals(expectedDiscount, p.getDiscount());
		assertEquals(expectedUnitPrice, p.getUnitprice());
		assertEquals(expectedProdName, p.getProdname());

		System.out.println("@Test");
	}

	@AfterEach
	public void afterAnnotation() {
		System.out.println("@AfterEach Annotation");
	}

	@AfterAll
	public static void afterClassAnnotation() {
		System.out.println("@afterAll Annotation");
	}

}
