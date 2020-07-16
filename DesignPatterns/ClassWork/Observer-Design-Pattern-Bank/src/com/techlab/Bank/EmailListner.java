package com.techlab.Bank;

public class EmailListner implements IListner {

	private Account a;

	public EmailListner(Account a) {
		this.a = a;
	}

	@Override
	public void update() {
		System.out.println("Email =>" + "\nDear Customer your Account Number " + a.getAccountNumber() + " Name "
				+ a.getName() + " total Balance " + a.getBalance());

	}

}
