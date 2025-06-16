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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.adu.vo.Employee;

public class SortTest3 {

	public static void main(String[] args) {
		//알아서 10칸 짜리 배열이 만들어짐.. 11명을 추가하려고 하면 알아서 다시 10칸이 추가로 늘어남
		List<Employee> i = new ArrayList<Employee>();
		i.add(new Employee(888, "AAA", 1000.0));
		i.add(new Employee(222, "BBB", 2000.0));
		i.add(new Employee(111, "FFF", 4000.0));
		i.add(new Employee(444, "CCC", 4000.0));
		
//		System.out.println(i);
		
		
		for(Employee e : i) {
			System.out.println(e);
		}
		
		System.out.println("========== DESC ==========");
		
		Collections.sort(i);
		
		for(Employee e : i) {
			System.out.println(e);
		}
		
	}

}
