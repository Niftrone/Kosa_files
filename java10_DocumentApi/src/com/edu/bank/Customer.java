package com.edu.bank;
// Account와 Has a Relation 관계에 있다.
public class Customer {
	//생성자
	private String name;
	private String address;	
	private Account account;//set
	
	public Customer(){}
	public Customer(String name,String address){
		this.name= name;
		this.address = address;
	}
	public void openAccount(Account account) {
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}	
	public String getCustomerInfo() {
		return name+"\t"+address;
	}
}








