package com.adu.test2;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.adu.vo.Employee;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer, Employee> map = new HashMap<>();
		map.put(111, new Employee(111, "이수근", 20000.0));
		map.put(444, new Employee(444, "서장훈", 25000.0));
		map.put(333, new Employee(333, "김영철", 30000.0));
		map.put(777, new Employee(777, "김희철", 12000.0));
		map.put(222, new Employee(222, "강호동", 32000.0));
		
		//1
		/*
		 * 맵에 저장된 멤버중에서 777키값에 해당하는 멤버를 출력
		 * */
		System.out.println(map.get(777));
		
		//2
		/*
		 * 이름이 서장훈인 멤버를 찾아서 그 사람의 급여를 출력
		 * */
		
		for(Employee e : map.values()) {
			if(e.getName().equals("서장훈")) {
				System.out.println(e.getSalary());
				break;
			}
		}
		
		//3 멤버중에서 가장많은 급여 가장 적은 급여의 이름
		
		
		

		
//		Employee max = null;
//		Employee min = null;
//		
//		for (Employee emp : map.values()) {
//		    if (max == null || emp.getSalary() > max.getSalary()) {
//		    	max = emp;
//		    }
//		    if (min == null || emp.getSalary() < min.getSalary()) {
//		    	min = emp;
//		    }
//		}
//		System.out.println("최대 : " + max.getName() + "\n최소 : " + min.getName());
		
		//2) Collections.max(모든 salary들의 값들의 집합)
		Collection<Employee> employees = map.values();
		Comparator<Employee> sortSal = Comparator.comparing(Employee::getSalary);
		
		Employee max = Collections.max(employees, sortSal);
		Employee min = Collections.min(employees, sortSal);
		
		System.out.println("최대값 : " + max.getName() + "\n최소값 : " + min.getName());
		
		//3
//		Comparator<Employee> salary = new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//
//				return Double.compare(o1.getSalary(), o2.getSalary());
//			}
//		};
//		Employee maxEmp = Collections.max(map.values(), salary);
//		Employee minEmp = Collections.min(map.values(), salary);
//		
//		System.out.println("\n최대값 : " + maxEmp.getName() + "\n최소값 : " + minEmp.getName());
		
		//4 만약에 888번 직원ㅇ 존재하지 않는다면 888번 직원을 추가 등록
		if(!map.containsKey(888)) {
			map.put(888, new Employee(888, "유재석", 0.0));
		}
		
		for(Employee e : map.values()) {
			System.out.println(e);
		}
		
		map.clear();
		System.out.println("멤버거 비었나요 ? : " + map.isEmpty());

	}

}
