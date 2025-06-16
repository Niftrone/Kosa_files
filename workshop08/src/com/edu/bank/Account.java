package com.edu.bank;

public class Account {
	private int accNumber;
	private String bankName;
	private double balance;

	public Account() {
	}

	public Account(int accNumber, String bankName, double balance) {
		this.accNumber = accNumber;
		this.bankName = bankName;
		this.balance = balance;
	}

	public void withdraw(double amt) {
		if (amt > balance) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= amt;
	}

	public void deposit(double amt) {
		if (amt <= 0) {
			throw new IllegalArgumentException("입금 금액은 0보다 커야 합니다.");
		}
		balance += amt;
	}

	public String getAccountInfo() {
		return accNumber + "\t" + bankName + "\t" + balance;
	}
	
	public String getbalance() {
		return "" + balance;
	}
}
