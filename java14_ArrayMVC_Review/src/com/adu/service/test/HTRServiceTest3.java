package com.adu.service.test;

import com.adu.service.HRService;
import com.adu.util.MyDate;
import com.adu.vo.Engineer;
import com.adu.vo.SalseMan;

public class HTRServiceTest3 {

	public static void main(String[] args) {
		/*
		 * 객체하나를 받아온다
		 * 
		 * addengineer 호출 3번 엔지니어 3명 등록
		 * 
		 * add salseman 호출 2번 2명 등록
		 * 
		 * 2번째 엔지니어의 메인 스킬을 변경
		 * 
		 * 1번째 세일스맨의 보너스를 변경
		 * 
		 * 모든 엔지니어 세일즈맨 정보를 콘솔로 출력
		 * */
		HRService service = HRService.getHRService();
		
		service.addEmployee(new Engineer("사원12", "이우진", "코틀린", new MyDate(2000,5,8)));
		service.addEmployee(new Engineer("사원13", "김아인", "자바", new MyDate(2002,12,11)));
		service.addEmployee(new Engineer("사원14", "박경군", "HTML", new MyDate(1999,4,23)));
		
		service.addEmployee(new SalseMan("사원15", "박찬긴", 100, new MyDate(1999,3,12)));
		service.addEmployee(new SalseMan("사원16", "이아령", 200, new MyDate(1980,12,11)));
		
		service.updateEmployee(new Engineer("사원14", "박경군", "HTML", new MyDate(1999,4,23)), "유니티");
		System.out.println("============유니티로 업데이트============");
		System.out.println(service.getEngineer("사원14"));
		
		service.updateEmployee(new SalseMan("사원16", "이아령", 200, new MyDate(1980,12,11)), 150);
		System.out.println("===========보너스 200 -> 150 변경=============");
		System.out.println(service.getSalseMan("사원16"));
		
		System.out.println("============getAllEngineer()============");
		Engineer[] engineers = service.getAllEngineers();
		for(Engineer e : engineers) {
			if(e == null) {
				break;
			}
			System.out.println(e);
		}
		
		System.out.println("============deleteEngineer()============");
		service.deleteEngineer("사원12");
		
		for(Engineer e : engineers) {
			if(e == null) {
				break;
			}
			System.out.println(e);
		}
	}

}
