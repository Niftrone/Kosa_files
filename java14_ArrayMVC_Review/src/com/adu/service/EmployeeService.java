package com.adu.service;

import com.adu.overloading.Employee;

// 나중에 DAO 클래스가 됨
/*
 * 클래스를 통해서 단 하나의 인스턴스만 생성되도록 상제
 * 싱글통 패턴
 * 
 * 1.해당 클래스에서 하나의 객체를 생성
 *   private static 으로 객체 생성
 *   
 * 2.다른곳에서는 생성하지 못하도록 막아둔다.
 *   생성자 앞에 private 접근 지정자를 쓴다
 *   
 * 3.하나 생성한 인스턴스를 여기저기서 가져다 쓸수 있도록 열어둠
 *   public EmployeeService getInstance(){}
 * */
public class EmployeeService {
	
	private static EmployeeService service = new EmployeeService();
	
	private EmployeeService() {
		System.out.println("EmployeeService Creating...");
	}
	
	public static EmployeeService getInstance() {
		return service;
	}
	
	public void addEmployee(Employee employee) {
		System.out.println(employee.getDetails() + "님 가입 성공");
	}
	
	public String getEmployee(String name) {
		return name + "검색 성공";
	}
}
