package com.techlab.account.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlab.account.Account;

class AccountTest {

	Account acc = new Account("paras", 5000.0);
	
	@Test
	void testTwoParameterConstructorAccount() {
		// Arrange
		String expectedaccname = "paras";
		double expectedBalance = 5000.0;
		// Assert
		assertEquals(expectedaccname, acc.getAccName());
		assertEquals(expectedBalance,acc.getBalance(),0);
	}

	@Test
	void testOneparmeterConstructorAccount() {
		// Arrange
		String expectedaccname = "paras";
		// Assert
		assertEquals(expectedaccname, acc.getAccName());
	}

	@Test
	void testDeposite() {
		// Arrange
		double expectedbalance = 6000;
		// Act
		acc.deposit(1000);
		// Assert
		assertEquals(expectedbalance, acc.getBalance(),0);
	}

	@Test
	void testWithdraw() {
		// Arrange
		double expectedbalance = 4000;
		// Act
		acc.withdraw(1000);
		// Assert
		assertEquals(expectedbalance, acc.getBalance(),0);
	}
}
