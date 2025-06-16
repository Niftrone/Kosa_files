package self.bank.service;

import self.bank.util.Customer;

public class BankService {

	public static final int MAX_CUSTOMERS = 100;
	private int numberOfCustomer;
	private Customer[] customers;

	private static BankService service = new BankService();

	private BankService() {
		customers = new Customer[MAX_CUSTOMERS];
		numberOfCustomer = 0;
	}

	public static BankService getInstance() {
		return service;
	}

	public void addCustomer(Customer customer) {
		if (numberOfCustomer < MAX_CUSTOMERS) {
			customers[numberOfCustomer++] = customer;
		} else {
			System.out.println("최대 고객수 초과");
		}
	}

	public Customer getCustomer(int ssn) {
		for(Customer c : customers) {
			if(c.getSsn() == ssn) {
				return c;
			}
		}
		return null;
	}

	public void showAll() {
		for(Customer c : customers) {
			if(c == null) {
				return;
			}
			System.out.println(c.toString());
		}
	}
}
