package com.adu.test;

import java.util.HashSet;
import java.util.Set;

import com.adu.vo.Employee;

public class HashSetTest {

	public static void main(String[] args) {
		// Set<제너릭(타입)>
		// 중복을 벗겨내는 Filtering 역할을 한다
		Set<Employee> set = new HashSet<>();
		
		Employee e1 = new Employee(111, "이수근", 23000.0);
		Employee e2 = new Employee(222, "서장훈", 33000.0);
		Employee e3 = new Employee(333, "민경훈", 23000.0);
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e1);
		
		System.out.println(set.size() + " 명");
		System.out.println(set);
		
		/*
		 * 직원중에서 서장훈씨가 포함되어있는지 여부를 출력
		 * 
		 * 이수근을 삭제하고 나머지 직원정보를 출력
		 * 
		 * set 안에 저장된 직원 모두를 삭제 컨테이너가 비워져있는지 확인
		 * */
		
		System.out.println(set.contains(e2) ? "서장훈 있음" : "서장훈 없음" );
		
		set.remove(e1);
		
		for(Employee s : set) {
			System.out.println(s);
		}
		
		set.clear();
		
		System.out.println(set.isEmpty() ? "비어있음" : "비어있지 않음");
	}

}
