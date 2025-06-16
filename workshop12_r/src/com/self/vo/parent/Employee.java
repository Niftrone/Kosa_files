package com.self.vo.parent;

import com.self.util.MyDate;

public class Employee {
	private int empno;
	private String name;
	private MyDate birthDate;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(int empno, String name, MyDate birthDate, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}

	public void upgradeSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public double getSalary() {
		return salary;
	}
	

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}
	
	public String toString() {
		return empno+" , "+name + ", " + salary + ", " + birthDate;
	}
}
