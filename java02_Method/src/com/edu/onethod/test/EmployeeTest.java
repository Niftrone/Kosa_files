package com.edu.onethod.test;
 
import java.util.Date;

import com.edu.onethod.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		/*
		 1. employee를 메모리(jvm, platform)에 올린다
		 2. 4개의 멤버가 올라간다...접근해서 사용
		    필드 접근 ---> 필드 초기화
		    메소드 ---> 메소드 호출 
		  */
		Employee em = new Employee();
		Date today = new Date(2008, 10, 21);
		
		em.address = "경기도 안양 ";
		em.name = "이우진 ";
		em.hiredate = today;
		
		System.out.println(em.getEmployee()); 
		
	}

}
