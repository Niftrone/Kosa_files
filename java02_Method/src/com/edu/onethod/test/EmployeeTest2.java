package com.edu.onethod.test;
 /*
   Employee Test 2 에서는 여러명의 직원을 생성하는 코드
   scott, adams 총 3명의 직원을 생성
   세명의 직원 정보 출력
   
   */

import java.util.Date;

import com.edu.onethod.Employee;

public class EmployeeTest2 {

	public static void main(String[] args) {

		Employee lee = new Employee();
		Date lee_hireday = new Date(2008, 10, 21);
		
		Employee scott = new Employee();
		Date scott_hireday = new Date(2009, 6, 19);
		
		Employee adams = new Employee();
		Date adams_hireday = new Date(2010, 10, 30);
		
		
		lee.address = "경기도 안양 ";
		lee.name = "이우진 ";
		lee.hiredate = lee_hireday;
		
		scott.address = "경기도 안산 ";
		scott.name = "scott ";
		scott.hiredate = scott_hireday;
		
		adams.address = "서울 강남 ";
		adams.name = "adams ";
		adams.hiredate = adams_hireday;
		
		System.out.println(lee.getEmployee()); 
		System.out.println(scott.getEmployee());
		System.out.println(adams.getEmployee());
		
	}

}

/*
 * 이런식으로 코드작업을 하게되면
 * 직원이 늘어날때마다 그에따라 증가되는 코드 라인은 급속도로 증가하게 됨.
 * 이유는 필드에 직접 값을 할당하기 때문
 * 해결책
 * 필드에 값을 할당하는... 필드초기화하는 기능을 추가로 정의해서 사용하도록 한다
 * */
