package com.techlab.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.Person;

class PersonTest {

	@Test
	void testConstructor() {
		// Arrange
		Double expectedHeight = 7.7;
		Double expectedWeight = 77.7;
		// Act
		Person p = new Person(7.7, 77.7);
		// Assert
		assertEquals(expectedHeight, p.getHeight());
		assertEquals(expectedWeight, p.getWeight());
		
	}

}
