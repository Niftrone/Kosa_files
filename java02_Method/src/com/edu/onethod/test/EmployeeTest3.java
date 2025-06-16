package com.edu.onethod.test;
 /*
   Employee Test 2 에서는 여러명의 직원을 생성하는 코드
   scott, adams 총 3명의 직원을 생성
   세명의 직원 정보 출력
   
   */

import java.util.Date;

import com.edu.onethod.Employee;

public class EmployeeTest3 {

	public static void main(String[] args) {

		Employee lee = new Employee();
		
		Employee scott = new Employee();
		
		Employee adams = new Employee();
		
		lee.setEmployee("lee ", "경기도 안양시 ", new Date(2008, 10, 21));
		scott.setEmployee("scott ", "경기도 안산시 ", new Date(2008, 5, 11));
		adams.setEmployee("adams ", "경기도 수원시 ", new Date(2008, 4, 22));
		
		System.out.println(lee.getEmployee()); 
		System.out.println(scott.getEmployee());
		System.out.println(adams.getEmployee());
		
	}

}

