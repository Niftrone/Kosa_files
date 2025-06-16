package com.adu.operator.test;
//자바에서 사용되는 기본적인 연산자 정리

public class OperatorTest {
	int size;// Field 변수

	public static void main(String[] args) {
		// local 변수 main 안에서만 사용 가능
		int i = 5;
		int j = 3;

		System.out.println("연산자 = : 할당(asgin)");
		System.out.println("연산자 % : 나머지 값(모둘러스)" + i % j);
		System.out.println("연산자 / : 나눈 값" + i / j);

		/*
		 * 98 두 자리수
		 */

		int num = 98;

		System.out.println("10의자리 : " + num / 10);
		System.out.println("1의자리 : " + num % 10);

		int k = 10;
		System.out.println(k++);
		System.out.println(k);

		int m = 10;
		System.out.println(--m);
		System.out.println(m);

		/////////////// same object? another object? /////////////////

		Operator1 o1 = new Operator1();
//		Operator1 o2 = new Operator1();
		Operator1 o2 = new Operator1();
		/*
		 * 주소값이 같으면 Heap에 올라가 있는 같은 객체를 가르킨다 주소값이 다르면 Heap에 올라가 있는 서로 다른 객체를 가르킨다
		 */

		System.out.println("Reference Value o1=> " + o1);
		System.out.println("Reference Value o1=> " + o2);

		System.out.println("Same Object ==> " + (o1 == o2));
		System.out.println("Another Object ==> " + (o1 != o2));

		//////////////////// Short Circuit /////////////////////
		/*
		 * 뒷 부분의 논리연산자를 진행시키지 않고 건너뛸수 있다. 뒷 부분 수행시 발생할 수 있는 예외상황을 건너뛸수 있다.
		 */

		System.out.println(o1.test1() | o1.test2());
		System.out.println(o1.test1() & o1.test2());

		// || 앞선 값에서 true 값이 나오면 바로 true 값을 표출함
		System.out.println(o1.test1() || o1.test2());
		System.out.println(o1.test1() && o1.test2());
		// && 앞선 값에서 false 값이 나오면 바로 false 값을 표출함
		
		System.out.println("msg = " + (o1.msg == o2.msg));
		//스트링 데이터값을 비교할때는 반드시 equals()를 사용, ==연산자 사용하면 안됨!	
		System.out.println("msg = " + (o1.msg.equals(o2.msg)));
	}// main

}// class

class Operator1 {

	String msg = "Hello";

	public boolean test1() {
//		System.out.println("test1() calling....");
		return true;
	}

	public boolean test2() {
//		System.out.println("test1() calling....");
		return false;
	}

}

class Operator2 {

	public boolean test1() {
		System.out.println("test1() calling....");
		return true;
	}

	public boolean test2() {
		System.out.println("test1() calling....");
		return false;
	}
}
