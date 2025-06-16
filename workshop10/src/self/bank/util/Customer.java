package self.bank.util;

import self.bank.vo.Account;
import self.bank.vo.Address;

public class Customer {
	private String name;
	private int ssn;
	private Address address;
	private Account account;	
	
	public final static String DEFAULT_NAME = "홍길동";
	public final static int DEFAULT_ZIPCODE = 123;
	public final static int DEFAULT_BALANCE = 100;
	public final static String DEFAULT_REGION = "동대문구";
	public final static String DEFAULT_CITY = "서울시";
	
	public Customer(int ssn) {
		this(DEFAULT_NAME, ssn, new Account(DEFAULT_BALANCE), new Address(DEFAULT_ZIPCODE,DEFAULT_REGION,DEFAULT_CITY));
	}
	
	public Customer(String name, int ssn,Address address) {
		
		this(name,ssn,new Account(DEFAULT_BALANCE),address);		
	}
	
	public Customer(String name, int ssn, Account account, Address address) {
		this.name = name;
		this.ssn = ssn;
		this.account = account;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Account getAccount() {
		return account;
	}
	public int getSsn() {
		return ssn;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", ssn=" + ssn + ", address=" + address + ", account=" + account + "]";
	}
	
}