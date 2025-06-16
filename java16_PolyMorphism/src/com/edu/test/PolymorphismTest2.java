
package com.edu.test;
/*
 * 배열 관련된 유용한 기능을 가지고 있는 클래스
 * Arrays.copyOf()
 * Arrays.toString(배열)
 * System.arraycopy(source, 0, target, 0, length)
 * */

import java.util.Arrays;

import com.adu.child.Engineer;
import com.adu.child.Manager;
import com.adu.child.Secretary;
import com.adu.parent.Employee;
import com.adu.util.MyDate;

public class PolymorphismTest2 {

	public static void main(String[] args) {
		// 이기종간의 집합체
		Employee[] employees = { 
				new Manager(123, "김그린", 34000.0, new MyDate(2000, 04, 23), "기획부"),
				new Manager(222, "아이린", 60000.0, new MyDate(2001, 02, 13), "기획부"),
				new Engineer(333, "브루노", 90000.0, new MyDate(1985, 04, 25), "자바", 300),
				new Engineer(444, "마스", 40000.0, new MyDate(1980, 01, 12), "파이썬", 200),
				new Secretary(555, "마룬파이브", 70000.0, new MyDate(1990, 12, 11), "James") 
		};
		System.out.println("============ Employee Information ============");
//		for(Employee e : employees) {
//			System.out.println(e);
//		}
		
		// 배열안에 들어있는 데잍들의 정보를 문자열로 출력
		System.out.println(Arrays.toString(employees));
		
		System.out.println("\n ============ Employee's AnnualSalary ============");
		int annualSalary = 0;
		/*
		 * 부모 타입으로 여러 자식 객체들을 관리할때 특정한 타입의 자식 객체를 찾을수 있어야 한다
		 * instanceof 키워드를 사용
		 * 
		 * if(e instanceof Manager){  부모 타입 안에 생성된 객체가 Manager 라면
		 * 	///
		 * }else if(e instanceof Engineer){ 부모 타입 안에 생성된 객체가 Engineer 라면
		 * 	///
		 * }else if(e instanceof Secretary){ 부모 타입 안에 생성된 객체가 Secretary 라면
		 * 
		 * }
		 * 
		 */
		//연봉
		for(Employee e : employees) {
			if(e instanceof Engineer) {
				 Engineer eg = ((Engineer)e);
				 eg.getBonus();
				 annualSalary += (int)(eg.getSalary() * 12 + eg.getBonus());
			}else {
				annualSalary += e.getSalary() * 12;
			}
		}
		
		System.out.println("Employees Total Cost = " + annualSalary);
	}
}
