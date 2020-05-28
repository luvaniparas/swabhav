package com.techlab.account.test;

import com.techlab.account.Account;
import com.techlab.account.CurrentAccount;
import com.techlab.account.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		Account sa = new SavingAccount(101, "User1", 1000);
		System.out.println("Saving Account ->");
		sa.deposit(500);
		sa.withdraw(400);
		printInfo(sa);
		sa.withdraw(700);
		printInfo(sa);
		
		Account ca = new CurrentAccount(102, "User2", 2000);
		System.out.println("\nCurrent Account ->");
		ca.deposit(1000);
		ca.withdraw(900);
		printInfo(ca);
		ca.withdraw(1200);
		printInfo(ca);
	}

	public static void printInfo(Account obj) {
		System.out.println("\nAccountnumber :" + obj.getAccountnumber());
		System.out.println("Name :" + obj.getName());
		System.out.println("Balance " + obj.getBalance());

		if (obj.wFlag == true) {
			System.out.println("can not Withdraw "+obj.getMoney());
		}
		if (obj.depositeFlag == true) {
			System.out.println("Money deposited "+obj.getMoney());
		}
		if (obj.withdrawFlag == true) {
			System.out.println("Money Withdrawn "+obj.getMoney());
		}

	}
}
