package com.edu.exception.test;

public class RuntimeExceptionTest3 {

	public static void main(String[] args) {
		String[] str = {
			"Hello"	,
			"No, I Mean it",
			"Nice to meet you"
		};
		
		int i = 0;
		try {
			while(i<=3) {
				System.out.println(str[i]);
				i++;
			}
		} catch(NullPointerException e) {
			System.out.println("범위를 넘었습니다.1");
		} catch(ArithmeticException e) {
			System.out.println("범위를 넘었습니다.2");
		} catch(Exception e) {
			System.out.println("범위를 넘었습니다.3" + e);
		}

		System.out.println("The end....");
	}

}
