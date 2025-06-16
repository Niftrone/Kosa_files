package com.edu.exception.test;

public class RuntimeExceptionTest2 {

	public static void main(String[] args) {
		String[] str = {
			"Hello"	,
			"No, I Mean it",
			"Nice to meet you"
		};
		
		int i = 0;
		try {
			while(i<=3) {
				//메소드 안에서 줄 단위로 예외가 발생한다
				//i가 0, 1, 2 일때는 정상적으로 작동
				//i가 3이 될때 앱이 죽는다
				// 예외를 처리한다는 것은 비정상 종료 -> 정상 종료 로 바꾸는것
				// try{예외 발생 가능성 있는 코드} catch(){예외가 발생시}
				
				System.out.println(str[i]);
				i++;
			}
		} catch(NullPointerException e) {
			System.out.println("범위를 넘었습니다.1");
		} catch(ArithmeticException e) {
			System.out.println("범위를 넘었습니다.2");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("범위를 넘었습니다.3");
		}

		System.out.println("The end....");
	}

}
