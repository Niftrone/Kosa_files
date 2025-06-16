package com.adu.service;

import com.adu.util.MyDate;
import com.adu.vo.Engineer;
import com.adu.vo.SalseMan;

public class HRService {

	Engineer[] engineers = null;
	int eidx = 0;

	SalseMan[] salseMans = null;
	int sidx = 0;

	private static HRService service = new HRService(10);

	private HRService(int size) {
		engineers = new Engineer[size];
		salseMans = new SalseMan[size];
	}

	public static HRService getHRService() {
		return service;
	}

	// 서비스 기능을 정의 C
	public void addEmployee(Engineer engineer) {
		if (eidx < engineers.length) {
			engineers[eidx++] = engineer;
			System.out.println(engineer.getName() + "님이 등록 되었습니다.");
		} else {
			System.out.println("공간이 모자릅니다.");
		}
	}

	public void addEmployee(SalseMan salseMan) {
		// SalseMan 배열에 추가하고 인덱스를 하나 증가
		if (sidx < salseMans.length) {
			salseMans[sidx++] = salseMan;
			System.out.println(salseMan.getName() + "님이 등록 되었습니다.");
		} else {
			System.out.println("공간이 모자릅니다.");
		}
	}

	// empno 에 해당하는 나머지 정보를 수정하는 기능..
	// 특정한 대상을 추가하는 기능...u
	public void updateEmployee(Engineer engineer, String changeSkill) {
		boolean found = false;
		for (Engineer engine : engineers) {
			if (engine != null && engine.getEmpno().equals(engineer.getEmpno())) {
				engine.changeMainSkill(changeSkill);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("사원번호가 잘못되었습니다.");
		}
	}

	public void updateEmployee(SalseMan salseMan, int bonus) {
		boolean found = false;
		for (SalseMan sale : salseMans) {
			if (sale != null && sale.getEmpno().equals(salseMan.getEmpno())) {
				sale.setBonus(bonus);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("사원번호가 잘못되었습니다.");
		}
	}

	// 정보를 검색하는 기능 R
	public Engineer getEngineer(String empno) {
		for (Engineer e : engineers) {
			if (e.getEmpno().equals(empno)) {
				return e;
			}
		}
		return null;
	}

	public SalseMan getSalseMan(String empno) {
		for (SalseMan e : salseMans) {
			if (e.getEmpno().equals(empno)) {
				return e;
			}
		}
		return null;
	}

	public Engineer[] getAllEngineers() {
		return engineers;
	}

	public SalseMan[] getAllSalseMans() {
		return salseMans;
	}

	// 특정한 대상을 삭제하는 기능 D
	public void deleteEngineer(String empno) {
		int delEmpno = -1;
		for (int i = 0; eidx > i; i++) {
			if (engineers[i] != null && engineers[i].getEmpno().equals(empno)) {
				delEmpno = i;
				break;
			}
		}

		if (delEmpno != -1) {
			for (int i = delEmpno; i < eidx; i++) {
				engineers[i] = engineers[i + 1];
			}
			engineers[eidx - 1] = null;
			eidx--;
			System.out.println(empno + " 엔지니어 삭제 완료");
		} else {
			System.out.println("삭제할 엔지니어를 찾지 못함");
		}
	}
}
