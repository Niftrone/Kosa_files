package com.adu.child;

import com.adu.parent.Employee;
import com.adu.util.MyDate;

public class Secretary extends Employee {
	private String nameOfName;

	public Secretary(int empno, String name, double salary, MyDate birthDate, String nameOfName) {
		super(empno, name, salary, birthDate);
		this.nameOfName = nameOfName;
	}

	// 부모가 가진 기능을 물려받고 + 그걸 자식에게 맞게 고쳐쓴다.
	// Method Overriding

	public String getNameOfName() {
		return nameOfName;
	}

	public void changeNameOfName(String nameOfName) {
		this.nameOfName = nameOfName;
	}
	
	@Override
	public String toString() {
		return super.toString() + " nameOfName=" + nameOfName + "]";
	}


}
