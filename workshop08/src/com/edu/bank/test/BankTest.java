package com.edu.bank.test;

import java.util.Scanner;

import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest {

	private static Customer[] customers;
	private static int customNum = 0;
	private static Scanner scan = new Scanner(System.in);
	private static Account account = new Account();
	private static boolean run = true;
	
	public static void main(String[] args) {
		while (run) {
			bankSimulation();
		}
	}
	
	
	
	
	
	
	

	
	
	
	
	
	private static void bankSimulation() {
		System.out.println("--------------------------------------------------");
		System.out.println("1.고객수 | 2. 고객 정보 입력 | 3. 계좌 계설 | 4. 정보 출력 | 5. 종료");
		System.out.println("--------------------------------------------------");
		System.out.print("메뉴 선택 > ");
		int menu = scan.nextInt();
		scan.nextLine();

		switch (menu) {
		case 1:
			customerNumber();
			break;
		case 2:
			customerSetInfo();
			break;
		case 3:
			createBank();
			break;
		case 4:
			getcustomerInfo();
			break;
		case 5:
			run = false;
			System.out.println("프로그램을 종료합니다...");
			break;
		}
	}

	private static void customerNumber() {
		System.out.println("고객 수 입력 > ");
		customNum = scan.nextInt();
		scan.nextLine(); // ★ 또 버퍼 정리
		customers = new Customer[customNum];
	}

	private static void customerSetInfo() {
		for (int i = 0; i < customNum; i++) {
			System.out.println((i + 1) + "번째 고객의 이름 주소 입력");
			customers[i] = new Customer(scan.next(), scan.nextLine());
		}

	}

	private static void createBank() {
		for (int i = 0; i < customNum; i++) {
			System.out.println(customers[i].getName() + " 고객의 계좌번호, 은행명, 잔액을 입력하세요.");
			account = new Account(scan.nextInt(), scan.next(), scan.nextInt());
			scan.nextLine();
			customers[i].setAccount(account);
		}
	}

	private static void getcustomerInfo() {
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerInfo());
			System.out.println("=========================================");
		}

	}
}
