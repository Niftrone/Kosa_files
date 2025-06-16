package com.edu.bank.test;

import java.util.Scanner;

import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest {
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		Customer james = new Customer("James", "NY");
		Customer tomas = new Customer("Tomas", "서울");
		
		System.out.println("값을 직접 입력합니다.");
		james.openAccount(new Account(sc.nextInt(), sc.next(), sc.nextDouble()));
		tomas.openAccount(new Account(sc.nextInt(), sc.next(), sc.nextDouble()));
		
		Account jamesAccount=james.getAccount();
		jamesAccount.deposit(10000.0);
		jamesAccount.deposit(30000.0);
		jamesAccount.withdraw(20000.0);
		
		System.out.println("James Balance ==> "+jamesAccount.getBlance()+" 만원!!");		
		
	}
}






