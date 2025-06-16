package com.edu.bank;

public class Customer {
	private String name;
	private String address;
	private Account account;

	public Customer() {
	}

	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public String getCustomerInfo() {
		if (account == null) {
			return String.format("고객명: %s, 주소: %s, 계좌: 없음", name, address);
		}
		return String.format("고객명: %s, 주소: %s, 계좌: [%s]", name, address, account.getAccountInfo());
	}

}
