package com.techlab.Bank;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accountNumber;
	private String name;
	private double balance;
	private double amount;
	private List<IListner> listners;
	private boolean credited = false;
	private boolean debited = false;

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		listners = new ArrayList<IListner>();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public List<IListner> getListners() {
		return listners;
	}

	public boolean isCredited() {
		return credited;
	}

	public boolean isDebited() {
		return debited;
	}

	public void deposite(double amount) {
		this.amount = amount;
		balance += amount;
		this.debited = true;
		notifyListner();
		this.debited = false;
	}

	public double getAmount() {
		return amount;
	}

	public void withdraw(double amount) {
		this.amount = amount;
		balance -= amount;
		this.credited = true;
		notifyListner();
		this.credited = false;
	}

	public void addListner(IListner l) {
		listners.add(l);
	}

	public void notifyListner() {
		for (IListner l : listners) {
			l.update();
		}
	}

}
