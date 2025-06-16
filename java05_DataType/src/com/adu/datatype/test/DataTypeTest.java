package com.adu.datatype.test;

public class DataTypeTest {

	int c;

	public static void main(String[] args) {

		DataTypeTest test = new DataTypeTest();
		test.c = 1;

//		 변수명 = 실제값
		byte a = 100;

//		byte 127 까지의 값의 범위를 가짐
//		byte b = 128;
		int b = 128;

//		long, float, double 타입은 값뒤에 무조건 데이터 타입이 생략되어져 있다.
//		값비교 이전에 타입을 먼저 비교한다
//		float salary = 300.34;
//		float salary = 300.34d;

		float salary = 300.34f;
		double salary2 = 300.34;
		long salary3 = 300;

		short x, y, c;
		x = 1;
		y = 2;
		//실제값이 아니기 때문에 타입 비교가 된다
		//이때 사칙연산이 적용되면 int로 형이 승격된다.
		c = (short)(x + y); 

		System.out.println("byte a==> " + a);
		System.out.println("int b==> " + test.c);

	}

}
