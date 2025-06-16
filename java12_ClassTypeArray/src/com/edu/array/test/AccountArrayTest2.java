package com.edu.array.test;

import com.edu.array.Account;

public class AccountArrayTest2 {

	public static void main(String[] args) {
		//1 account 의 배열을 생성 사이즈는 3 account
		Account[] accounts = new Account[3];
		//2 각각의 배열 요소에 account 객체를 생성
		for(int i=0; accounts.length-1 > i; i++) {
			accounts[i] = new Account(123 + i, "ㅁㄴ"+i, 122+i);
		}
		//3 메모리상 올라간 account[] 배열 위치값을 출력
		for(Account account : accounts) {
			if(account == null) {
				continue;
			}
			System.out.println(account.getAccountInfo());
		}
		//4 모든 account 객체 정보를 출력
		System.out.println(accounts);
	}

}
