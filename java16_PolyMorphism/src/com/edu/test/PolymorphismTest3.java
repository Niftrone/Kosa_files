
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

public class PolymorphismTest3 {

	public static void main(String[] args) {
		// 이기종간의 집합체
		Employee[] employees = { new Manager(123, "김그린", 34000.0, new MyDate(2000, 04, 23), "기획부"),
				new Manager(222, "아이린", 60000.0, new MyDate(2001, 02, 13), "기획부"),
				new Engineer(333, "브루노", 90000.0, new MyDate(1985, 04, 25), "자바", 300),
				new Engineer(444, "James", 40000.0, new MyDate(1980, 01, 12), "파이썬", 200),
				new Secretary(555, "마룬파이브", 70000.0, new MyDate(1990, 12, 11), "James") };
		/*
		 * employees 안에 저장된 직원들 중에서 Manager인 직원을 찾고 그 직원의 사원번호가 222 라면 그 사원의 부서를 교육부로 변경
		 * 
		 * employees 안에 저장된 직원들 중에서 Secretary인 직원을 찾고 해당 상사를 222사번에 해당하는 상사 이름으로 변경
		 * 
		 * 
		 */
		for (Employee e : employees) {
			if (e instanceof Manager) {
				Manager ma = ((Manager) e);
				if (ma.getEmpno() == 222) {
					ma.changeDept("교육부");
				}
			} else if (e instanceof Secretary) {
				Secretary se = ((Secretary) e);
				for (Employee e1 : employees) {
					if (e1.getEmpno() == 222) {
						se.changeNameOfName(e1.getName());
					}
				}

			}
		}

		/*
		 * employees안에 저장된 직원들의 모든 정보를 출력
		 */
		for(Employee e : employees) {
			System.out.println(e);
		}
		/*
		 * Manager 부서의 모든 직원의 급여를 10% 인상 Engineer 모든 직원의 보너스를 100달라 차감 Secretary 부서의 모든
		 * 직원의 급여는 동결
		 */

		for (Employee e : employees) {
		    if (e instanceof Manager) {
		        Manager ma = (Manager) e;
		        double newSalary = ma.getSalary() * 1.1; // 10% 인상
		        ma.setSalary(newSalary);
		        
		    } else if (e instanceof Engineer) {
		        Engineer en = (Engineer) e;
		        int newBonus = en.getBonus() - 100; // 보너스 100 차감
		        if (newBonus < 0) {
		            newBonus = 0; // 보너스가 음수가 안 되게 처리
		        }
		        en.setBonus(newBonus);

		    } else if (e instanceof Secretary) {
		        // Secretary는 급여 동결이니까 아무것도 안 함
		    }
		}
		/*
		 * employees안에 저장된 직원들의 모든 정보를 출력
		 */

		for(Employee e : employees) {
			System.out.println(e);
		}
		
		//부모 타입으로 자식객체 생성.Polymorphism
		Employee e1 = new Manager(7369, "이서연", 32000.0, new MyDate(1988, 12, 12), "교육부");
		Employee e2 = new Engineer(5566, "이지수", 40000.0, new MyDate(1999, 11, 12), "자바", 100);
		
		System.out.println(e1);
		System.out.println(e2);
		
		//이서연 매니저의 급여를 52000 수정 정보를 출력
		e1.setSalary(52000);
		
		//이서연 매니저의 부서를 개발부서 수정 정보를 출력
		((Manager) e1).changeDept("개발부서");
		
		System.out.println(e1);
	}
}
