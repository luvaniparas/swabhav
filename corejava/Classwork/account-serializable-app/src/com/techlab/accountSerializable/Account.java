package com.techlab.accountSerializable;

import java.io.Serializable;

public class Account implements Serializable {
	final static int MIN_BALANCE = 500;
	private String accno;
	private String accName;
	private double balance;
	public boolean withdraw_Flag = false, transitionFlag = false;
	private int count = 0;

	public Account(String accName, double balance) {
		this.accName = accName;
		this.balance = balance;
		this.accno = setAccno();
	}

	public Account(String accName) {
		this(accName, MIN_BALANCE);

	}

	public static String setAccno() {
		double num = Math.random() * 10000;
		int i = (int) num;
		return String.valueOf(i);

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

	public int getCount() {
		return count;
	}

	public void deposit(double amt) {
		transitionFlag = true;
		balance += amt;
		count++;
	}

	public void withdraw(double amt) {
		transitionFlag = true;
		if (balance - amt >= 500) {
			balance -= amt;
			count++;
		} else {
			withdraw_Flag = true;
		}
	}

	@Override
	public String toString() {
		return "Account : accno=" + accno + ", accName=" + accName + ", balance=" + balance + ", count=" + count + " ";
	}
	
	
}
