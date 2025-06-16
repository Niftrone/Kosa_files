package com.adu.parent;

import com.adu.util.MyDate;

//parent Class
public class Employee {
	private int empno;
	private String name;
	private double salary;
	private MyDate birthDate;
	private MyDate hireDate;

	public Employee() {
	}

	public Employee(int empno, String name, double salary, MyDate birthDate, MyDate hireDate) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
	}


	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public MyDate gethireDate() {
		return hireDate;
	}

	public void sethireDate(MyDate hireDate) {
		this.hireDate = hireDate;
	}

	/*
	 * 1. 부모가 가지는 기능을 물려받는다
	 * 2. 자식(자신)에게 맞는 기능으로 고쳐쓴다
	 * 
	 * 메소드 오버라이딩(상속관계에 있는 부모, 지식 클래스에서만 발생)
	 * 메소드 선언부는 동일
	 * 메소드 구현부는 반드시 달라야한다
	 * */
	@Override
	public String toString() {
		return "[empno=" + empno + ", salary=" + salary + ", birthDate=" + birthDate + ", name=" + name + ","+ ", hireDate=" + hireDate + ",";
	}
}
