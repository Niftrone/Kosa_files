package com.adu.test;

import java.util.Scanner;

import com.adu.child.Engineer;
import com.adu.child.Intern;
import com.adu.child.Manager;
import com.adu.parent.Employee;
import com.adu.service.EmployeeService;
import com.adu.util.MyDate;

public class EmployeeServiceTest {

	private static EmployeeService service = EmployeeService.getEmployee();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("1. 사원추가 2. 사원삭제 3. 사원정보변경 4. 사원검색 5. 모든사원출력 6.사원급여인상 7.종료");
			int num = scan.nextInt();
			switch (num) {
			case 1:
				addEmployee();
				break;
			case 2:
				deletEmployee();
				break;
			case 3:
				changeEmployee();
				break;
			case 4:
				findEmployee();
				break;
			case 5:
				printEmployee();
				break;
			case 6:
				System.out.println("엔지니어는 1년당 10달러 인상 매니저는 1년당 5달러 인상 인턴은 해당사항 없음");
				service.raiseEmployee();
				break;
			case 7:
				System.out.println("프로그램이 종료 되었습니다.");
				scan.close();
				return;
			} // switch
		} // while
	}// main

	private static void addEmployee() {
		System.out.println("1.엔지니어 2.매니저 3.인턴");
		int num = scan.nextInt();

		System.out.println("사원번호, 이름, 월급, 출생년도(yyyy MM dd), 입사일(yyyy MM dd) 입력하세요");
		int empno = scan.nextInt();
		String name = scan.next();
		double salary = scan.nextDouble();
		MyDate birthDate = new MyDate(scan.nextInt(), scan.nextInt(), scan.nextInt());
		MyDate hireDate = new MyDate(scan.nextInt(), scan.nextInt(), scan.nextInt());

		Employee em = null;

		switch (num) {
		case 1:
			System.out.println("기술, 보너스를 입력하세요");
			String skill = scan.next();
			int bonus = scan.nextInt();
			em = new Engineer(empno, name, salary, birthDate, hireDate, skill, bonus);
			break;

		case 2:
			System.out.println("부서명을 입력하세요");
			String dept = scan.next();
			em = new Manager(empno, name, salary, birthDate, hireDate, dept);
			break;

		case 3:
			System.out.println("마지막 출근 날짜를 입력하세요(yyyy MM dd)");
			MyDate workPeriod = new MyDate(scan.nextInt(), scan.nextInt(), scan.nextInt());
			em = new Intern(empno, name, salary, birthDate, hireDate, workPeriod);
			break;

		default:
			System.out.println("잘못 입력했습니다.");
			break;
		}

		if (em != null) {
			service.addEmployee(em);
			System.out.println(name + "이 추가되었습니다.");
		}
	}

	private static void deletEmployee() {
		System.out.println("삭제할 사원의 사원번호를 입력하세요");
		int empno = scan.nextInt();

		service.deleteEmployee(empno);
	}

	private static void changeEmployee() {
		System.out.println("사원번호 변경할이름 순으로 입력하세요.");
		service.changeEmployee(scan.nextInt(), scan.next());
	}

	private static void findEmployee() {
		System.out.println("찾을 사원의 번호를 입력하하세요.");
		System.out.println(service.findEmployee(scan.nextInt()));
	}

	private static void printEmployee() {
		service.printEmployee();
	}

}
