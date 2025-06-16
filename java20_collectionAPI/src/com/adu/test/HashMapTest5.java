package com.adu.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
 * put(key, value) 삽입
 * remove(key) 삭제
 * replace(key, value) 수정
 * get(key) 벨류값
 * keySet() 
 * values()
 * isEmpty()
 * containsKey() ****
 * 
 * */
public class HashMapTest5 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("이수근", 90); // new Integer(90);
		map.put("서장훈", 93); 
		map.put("강호동", 88); 
		map.put("김영철", 98); 
		map.put("김희철", 80); 
		
		//1
		/*
		 * 아는 형님 멤버들의 이름들 추출해서 
		 * 반복문을 통해서 키값에 해당하는 성적을 받아오고
		 * 최종적으로 모든 맴버의 성적과 멤버들의 평균을 구해서 출력
		 * */
		Set set = map.keySet();
		int total = 0;
		for(String name : map.keySet()) {
			System.out.println(name);
			total += map.get(name);
		}
		
		System.out.println(total);
		System.out.println(total / set.size());
		
		//2
		/*
		 * 김희철을 삭제
		 * 민경훈, 95 데이터를 추가
		 * 강호동의 성적은 80으로 변경
		 * */
		
		System.out.println(map.remove("김희철"));
		map.put("민경훈", 95);
		map.replace("강호동", 88, 80);
		
		total = 0;
		for(String name : map.keySet()) {
			System.out.println(name);
			total += map.get(name);
		}
		
		System.out.println(total);
		System.out.println(total / set.size());
		
		System.out.println("=============value===============");
		int sum = 0;
		for(int score : map.values()) {
			sum += score;
		}
		System.out.println(sum);
		System.out.println(sum/map.size());
		
		System.out.println("===========Collections===========");
		System.out.println("멤버중에서 최고성적은 " + Collections.max(map.values()));
		System.out.println("멤버중에서 최고성적은 " + Collections.min(map.values()));
	}
}
