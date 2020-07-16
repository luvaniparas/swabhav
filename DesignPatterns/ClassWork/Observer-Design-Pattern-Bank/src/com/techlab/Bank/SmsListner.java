package com.techlab.Bank;

public class SmsListner implements IListner {

	private Account a;

	public SmsListner(Account a) {
		this.a = a;
	}

	@Override
	public void update() {
		System.out.println("Sms =>"+"\nDear Customer your Account Number " + a.getAccountNumber() + " Name " + a.getName()
				+ " total Balance " + a.getBalance());
	}

}
