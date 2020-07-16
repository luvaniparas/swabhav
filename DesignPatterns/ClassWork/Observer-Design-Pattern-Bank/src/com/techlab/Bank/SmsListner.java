package com.techlab.Bank;

import java.time.LocalDateTime;

public class SmsListner implements IListner {

	private Account a;

	public SmsListner(Account a) {
		this.a = a;
	}

	@Override
	public void update() {
		if (a.isCredited()) {
			System.out.println("Sms =>" + "\nDear Customer your Account Number " + a.getAccountNumber() + " Name "
					+ a.getName() + "has been credited with" + a.getAmount() + " total Balance " + a.getBalance()
					+ " on " + LocalDateTime.now());
		}
		if (a.isDebited()) {
			System.out.println("Sms =>" + "\nDear Customer your Account Number " + a.getAccountNumber() + " Name "
					+ a.getName() + "has been debited with" + a.getAmount() + " total Balance " + a.getBalance()
					+ " on " + LocalDateTime.now());
		}

	}

}
