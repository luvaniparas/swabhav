package com.techlabs.Account;


public class Account {
	final static int MIN_BALANCE = 500;
	private String accno;
	private String accName;
	private double balance;
	public boolean withdraw_Flag = false , transitionFlag = false ;

	public Account(String accName,double balance) {
		this.accName = accName;
		this.balance = balance;
		this.accno = setAccno();
	}

	public Account(String accName) {
		this(accName,MIN_BALANCE);

	}

	public static String setAccno() {
		double num = Math.random()*10000 ;
		int i = (int) num;
		return  String.valueOf(i);
		
	}

	public String getAccno() {
		return accno;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) {
		transitionFlag = true ;
		balance += amt;
	}

	public void withdraw(double amt) {
		transitionFlag = true ;
		if (balance - amt >= 500) {
			balance -= amt;
		} else {
			withdraw_Flag = true;
		}
	}
}
