package com.techlab;

public class BankAccount {

	public static class Builder {

		private long accountNumber;
		private String owner;
		private String branch;
		private double balance;
		private double interestRate;

		public Builder(long accountNumber) {
			this.accountNumber = accountNumber;
		}

		public Builder withOwner(String owner) {
			this.owner = owner;
			System.out.println("withOwner() " + this);
			return this;
		}

		public Builder atBranch(String branch) {
			this.branch = branch;
			System.out.println("atBranch() " + this);
			return this;
		}

		public Builder openingBalance(double balance) {
			this.balance = balance;
			System.out.println("openingBalance() " + this);
			return this;
		}

		public Builder atRate(double interestRate) {
			this.interestRate = interestRate;
			System.out.println("atRate() " + this);
			return this;
		}

		public BankAccount build() {
			BankAccount account = new BankAccount(); // Since the builder is in the BankAccount class, we can invoke its
														// private constructor.
			account.accountNumber = this.accountNumber;
			account.owner = this.owner;
			account.branch = this.branch;
			account.balance = this.balance;
			account.interestRate = this.interestRate;
			return account;

		}

	}

}
