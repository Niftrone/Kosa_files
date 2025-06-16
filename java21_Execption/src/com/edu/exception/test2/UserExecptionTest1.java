package com.edu.exception.test2;
/*
 * 예외를 처리하는 2가지 방법
 * 
 * 1. try catch :: 즉각적으로 바로 처리
 * 
 * 2. throws :: 폭탄을 던진다 ..메서드 선언부에서 발생한 폭탄을 던진다
 * 
 * 2가지 다 사용?
 * 
 * 1. 내가 특정한 조건에서 고의적으로 폭탄을 터트리겠다
 * 2. 폭탄을 내가 직접 제조해서 사용하겠다
 * 
 */
public class UserExecptionTest1{

	public static void main(String[] args) {
		User user = new User();
		System.out.println("1.fo() calling");
		try {
			user.go();
		}catch(ArithmeticException e) {
			System.out.println("오류 발생 " + e.getMessage());
		}

		System.out.println("3.fo() finished");
	}

}

class User {
	public void go() throws ArithmeticException{
		System.out.println("2. go() working..");
		int i = 10;
		int j = 0;
		throw new ArithmeticException("0을 나눔");
//		System.out.println("연산적용" + i/j);
	}
}
