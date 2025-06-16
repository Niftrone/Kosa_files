package com.adu.test;
/*
 * ArrayList
 * List의 자식
 * 순서를 가지면서 객체를 저장...중복도 가능
 * add(), remove, get(), set(), size(), isEmpty(), clear(), removeAll()
 * 
 * 이전의 배열과 같다
 * 대신에 사이즈가 알아서 늘어난다.
 * 사이즈에 대해서 신경 쓸 필요 없다.
 * */

import java.util.ArrayList;

import com.adu.vo.Employee;

public class ArrayListTest1 {

	public static void main(String[] args) {
		//알아서 10칸 짜리 배열이 만들어짐.. 11명을 추가하려고 하면 알아서 다시 10칸이 추가로 늘어남
		ArrayList<Employee> i = new ArrayList<Employee>();
		i.add(new Employee(111, "AAA", 1000.0));
		i.add(new Employee(222, "BBB", 2000.0));
		i.add(new Employee(333, "CCC", 3000.0));
		i.add(new Employee(444, "DDD", 4000.0));
		
		// 3번째 객체를 삭제
		Employee delEmp=i.get(2); 
		boolean d = i.remove(delEmp);
		System.out.println("del? : " + d);
		// 2번째 FFF 객체를 추가
		i.add(1, new Employee(555, "FFF", 3000.0));
		// 마지막 객체의 급여를 3200으로 변경 
		i.set(i.size() - 1, new Employee(333, "CCC", 3200.0));
		//리스트안의 모든 정보를 출력
		for(Employee e : i) {
			if(!i.isEmpty()) {
				System.out.println(e);
			}
		}
		
		
		
	}

}
