/*
 * 배열은 여러개의 데이터를 저장할수 있는 일정의 컬렉션이다
 * 클래스가 제공되지 않기 때문에 특정한 데이터를 저장, 삭제, 수정, 가져올때마다
 * 직접 기능을 만들어야 하는 번거로움이 있다
 * 
 * 또한 배열의 특징으로
 * 1. ReSizing이 안됨 -- 사이즈가 변경되면 새로운 배열 생성
 * 2. Same Data Type -- 데이터 타입이 같은 서로다른 값들을 저장
 * Homegenous Collection (동종간의 집합체)
 * 
 * 상속 기술이 적용되는 순간 이기종간의 집합체가 가능하다
 * Heterogeneous Collection 이 만들어진다.
 * 
 * Employee[] employees 내부에 Engineer 배열, Manager 배열, Secretary 배열이 담긴다.
 * Parent Type 으로 여러개의 자식 객체들을 단일하게 관리할 수 있다.
 * 
 * */

package com.edu.test;

import com.adu.child.Engineer;
import com.adu.child.Manager;
import com.adu.child.Secretary;
import com.adu.parent.Employee;
import com.adu.util.MyDate;

public class PolymorphismTest1 {

	public static void main(String[] args) {
		// 이기종간의 집합체
		Employee[] employees = { 
				new Manager(123, "김그린", 34000.0, new MyDate(2000, 04, 23), "기획부"),
				new Manager(222, "아이린", 60000.0, new MyDate(2001, 02, 13), "기획부"),
				new Engineer(333, "브루노", 90000.0, new MyDate(1985, 04, 25), "자바", 300),
				new Engineer(444, "마스", 40000.0, new MyDate(1980, 01, 12), "파이썬", 200),
				new Secretary(555, "마룬파이브", 70000.0, new MyDate(1990, 12, 11), "James") 
		};

		System.out.println(employees);
		/*
		 * Virtual Method Invocation 원리 (자식) 상속 관계시 오버라이딩한 자식에서만 발생하는 현상 컴파일 시점 -- 부모의
		 * 메소드 호출 실행 시점 -- 자식 메소드 호출
		 */
		for (Employee e : employees) {
			System.out.println(e);
		}

		/*
		 * 부모배열은 단일화가 편함 부모배열의 각 객체의 특징을 가져오지 못함 이럴 때는 Object Casting 을 해야한다
		 */
		for (Employee e : employees) {
			if (e.getEmpno() == 333) {
				((Engineer) e).changeTech("AI");
//				Engineer eg = (Engineer) e;
//				eg.changeTech("AI");
			}
		}

		for (Employee e : employees) {
			System.out.println(e);
		}
	}

}
