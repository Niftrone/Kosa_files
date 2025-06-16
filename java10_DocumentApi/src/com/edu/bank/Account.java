package com.edu.bank;

/**
 * <pre>
 * {@code
 Account 클래스는 계좌 관련된 정보를 가지고 있는 클래스
 해당 클래스에서는 Java Document 주석을 달아서 처리했다.
 아래에서 사용된 주석은 가장 많이 사용되는 주석이다.
 }
 </pre>
 * 
 * @author LWJ
 * @version project version 1.0.2
 * @since JDK17
 * 
 * 
 */

public class Account {
	/**
	 * 계좌번호 12자리 정수형
	 */
	private int accNumber;
	/**
	 * 은행명
	 */
	private String bankName;
	/**
	 * 계좌 잔액 계좌를 개설할때 최초 입금 금액
	 */
	private double balance;

	/**
	 * 기본 생성자
	 */
	public Account() {
	}

	/**
	 * 명시적 생성자 Account
	 * 
	 * @param accNumber 계좌번호
	 * @param bankName  은행명
	 * @param balance   잔액
	 */
	public Account(int accNumber, String bankName, double balance) {
		this.accNumber = accNumber;
		this.bankName = bankName;
		this.balance = balance;
	}

	/**
	 * 
	 * @return 통장정보(계좌번호, 은행명, 잔액을 문자열로 반환)
	 * 
	 */
	public String getAccountInfo() {
		return accNumber + "\t" + bankName + "\t" + balance;
	}

	/**
	 * @param amt 입금할 일정 금액 특정금액을 입금하는 기능 천원 이상의 금액만 입금이 가능
	 */

	public void deposit(double amt) {
		if (amt <= 0) {
			throw new IllegalArgumentException("입금 금액은 0보다 커야 합니다.");
		}
		balance += amt;
	}

	/**
	 * @param amt 출금할 일정 금액 특정금액을 출금하는 기능 잔액보다 더 큰 금액이 출금될시 예외 발생
	 */

	public void withdraw(double amt) {
		if (amt > balance) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= amt;
	}

	/**
	 * 
	 * @return 잔액을 반환
	 * 
	 */
	public double getBlance() {
		return balance;
	}
}
