package com.techlab.Bank.test;

import com.techlab.Bank.Account;
import com.techlab.Bank.EmailListner;
import com.techlab.Bank.SmsListner;

public class AccountTest {

	public static void main(String[] args) {

		Account a1 = new Account(101, "user1", 1000);
		a1.addListner(new SmsListner(a1));
		a1.addListner(new EmailListner(a1));

		a1.deposite(500);
		a1.withdraw(100);
	}

}
