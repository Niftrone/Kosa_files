package com.adu.overloading;

//직원에 대한 정보를 저장하는 클래스

public class Employee {
	private int empno;
	private String name;
	private double salary;
	private String address;

	////////////// 필드 기본값 설정 ///////////////

	public final static String DEFAULT_NAME = "홍길동";
	public final static double BASIC_SALARY = 100.0;
	public final static String DEFAULT_ADDRESS = "서울시";

	/*
	 * Employee 생성자 3개 생성자명은 동일 / 인자값 리스트는 서로 다르다 --> 생성자 오버로딩
	 * 
	 * 필수값만으로 객체를 생성할때 사용 나머지 필드는 초기화가 안되어서 기본값으로 진행 됨 결과적으로 데이터베이스 테이블 컬럼에 기본값 들어갈
	 * 것이다.
	 */
	public Employee(int empno) {
//		this.empno = empno;
		//
		this(empno, DEFAULT_NAME, BASIC_SALARY, DEFAULT_ADDRESS);
	}

	public Employee(int empno, String name, double salary, String address) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public Employee(int empno, String name) {
		this(empno, name, BASIC_SALARY, DEFAULT_ADDRESS);
	}

	public String getDetails() {
		return empno + ", " + name + ", " + salary + ", " + address;
	}

}
