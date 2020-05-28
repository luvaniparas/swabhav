package com.techlab.account;

public abstract class Account {
	private int accountnumber;
	private String name;
	protected double balance;
	public boolean wFlag = false ,depositeFlag =false ,withdrawFlag =false;
	protected double money ;
	
	public Account(int accountnumber, String name, double balance) {
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public double getMoney() {
		return money;
	}
	
	public void deposit(double money) {
		this.money = money ;
		depositeFlag =true ;
		balance += money ; 
	}
	
	abstract public void withdraw(double money) ;
	
	
}
