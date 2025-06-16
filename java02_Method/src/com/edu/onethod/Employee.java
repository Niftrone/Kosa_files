/*
 package 선언부는 클래스의 가장 윗부분에 온다
 package 뒤에 나오는 이름들은 다 소문자
 상위 패키지와 하위 패키지는 . 로 구분한다
 패키지 레벨은 3개 이상이 기본이다.
 src 밑에 들어가있는 파일은 패키지 파일 이다

  */

package com.edu.onethod;

// Field와 Local Variable 를 구분하는 
// 기준은 변수가 선언된 위치이다

import java.util.Date;

public class Employee {
	public String name;
	public String address;
	public Date hiredate;

//	public void printEmployee() {
//		System.out.println(name + address + hiredate);
//	}
	
	public String getEmployee() {
		return name + address + hiredate;
	}
	
	//필드 초기화 기능 생성
	
	/*
	 * this *이 클래스 자기 자신*
	 * this,name 이클래스의 멤버인 name
	 * */
	
	public void setEmployee(String name,String address,Date hiredate) {
		this.name = name;
		this.address = address;
		this.hiredate = hiredate;
	}
}
