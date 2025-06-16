package com.adu.overloading.test;

import com.adu.overloading.Employee;

public class EmployeeTest1 {

	public static void main(String[] args) {
		Employee e1 = new Employee(7214);//필드 초기화를 안해줌
		Employee e2 = new Employee(7369, "아아낱");//사원 번호 + 이름
		Employee e3 = new Employee(7521, "아담스", 30000.0, "Brandon");
		
		System.out.println(e1.getDetails());
		System.out.println(e2.getDetails());
		System.out.println(e3.getDetails());
		
	}

}
