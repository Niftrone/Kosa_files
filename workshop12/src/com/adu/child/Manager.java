package com.adu.child;

import com.adu.parent.Employee;
import com.adu.util.MyDate;

public class Manager extends Employee {

	private String dept;

	// this... 이 클래스 자기자신을 가르키는 키워드
	// super... 부모를 가리키는 키워드
	public Manager(int empno, String name, double salary, MyDate birthDate,MyDate hireDate, String dept) {
		super(empno, name, salary, birthDate, hireDate);
		this.dept = dept;
	}

	// 부모가 가진 기능을 물려받고 + 그걸 자식에게 맞게 고쳐쓴다.
	// Method Overriding

	public String getDept() {
		return dept;
	}

	public void changeDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Manager : "+ super.toString() + " dept=" + dept + "]";
	}

}
