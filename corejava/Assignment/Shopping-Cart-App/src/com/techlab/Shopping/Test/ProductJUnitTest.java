package com.techlab.Shopping.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlab.Shopping.Product;

class ProductJUnitTest {

	@Test
	void testParameterConstructorProduct() {
		int expectedProdId = 1 ;
		int expectedDiscount = 10 ;
		int expectedUnitPrice = 100 ;
		String expectedProdName = "parle" ;
		
		Product p = new Product(1,10,100,"parle");
		
		assertEquals(expectedProdId , p.getProdid());
		assertEquals(expectedDiscount , p.getDiscount());
		assertEquals(expectedUnitPrice , p.getUnitprice());
		assertEquals(expectedProdName , p.getProdname());
	}
	
	

}
