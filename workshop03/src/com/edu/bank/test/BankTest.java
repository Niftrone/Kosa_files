package com.edu.bank.test;

import java.util.Scanner;

import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String wdrawalmachine;
		boolean test = true;

		System.out.println("통장 개설을 시작합니다.");

		for (int i = 0; i < 2; i++) {

			System.out.println("통장주 명을 입력하세요");
			String name = scan.nextLine();

			System.out.println("주소를 입력하세요");
			String address = scan.nextLine();

			System.out.println("AccNumber를 입력하세요");
			int accNumber = scan.nextInt();
			scan.nextLine();

			System.out.println("bank 이름을 입력하세요");
			String bankName = scan.nextLine();

			System.out.println("통장에 입금하세요");
			double balance = scan.nextDouble();
			scan.nextLine();

			Customer customer = new Customer(name, address);
			customer.setAccount(new Account(accNumber, bankName, balance));

			System.out.println(customer.getCustomerInfo());

			while (test) {
				System.out.println("출금 : d, 입금 : a, 종료 : q");
				wdrawalmachine = scan.nextLine();
				switch (wdrawalmachine) {
				case "d":
					System.out.println("출금할 금액");
					double withdrawAmt = scan.nextDouble();
					scan.nextLine();

					customer.getAccount().withdraw(withdrawAmt);
					System.out.println("출금 후 잔액 : " + customer.getAccount().getAccountInfo());
					break;

				case "a":
					System.out.println("입금할 금액");
					double depositAmt = scan.nextDouble();
					scan.nextLine();

					customer.getAccount().deposit(depositAmt);
					System.out.println("입금 후 잔액 : " + customer.getAccount().getAccountInfo());
					break;

				case "q":
					test = false;
					break;
				}
			}
			
			System.out.println("최종 잔액 : " + customer.getAccount().getbalance());
		}

	}
}
