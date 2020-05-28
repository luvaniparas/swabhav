package com.techlab.account;

public class CurrentAccount extends Account {
	private final static double DEFAULT_BALANCE = 1000;

	public CurrentAccount(int accountnumber, String name, double balance) {
		super(accountnumber, name, balance);
	}

	@Override
	public void withdraw(double money) {
		super.money = money ;
		if (getBalance() - money < DEFAULT_BALANCE) {
			wFlag = true;
		} else {
			super.balance -= money  ;
			wFlag = false;
			withdrawFlag = true ;
		}

	}

}
