package com.techlabs.Test;

import com.techlabs.Account.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account a1 = new Account("paras");
		a1.withdraw(400);
		a1.deposit(100);
		printInfo(a1);
	}

	public static void printInfo(Account a) {
		System.out.println("Account Number : " + a.getAccno());
		System.out.println("Account Name : " + a.getAccName());
		System.out.println("Balance : " + a.getBalance());

		if (a.withdraw_Flag == true) {
			System.out.println("Warning : Below 500 can not withdraw : " + a.getBalance());
		}
		if (a.transitionFlag == true) {
			System.out.println("Transistion Performend : " + a.getBalance());
		}
	}
}
