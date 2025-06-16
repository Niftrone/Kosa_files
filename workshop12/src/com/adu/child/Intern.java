package com.adu.child;

import com.adu.parent.Employee;
import com.adu.util.MyDate;

public class Intern extends Employee{
	
	private MyDate workPeriod;
	
	public Intern(int empno, String name, double salary, MyDate birthDate,MyDate hireDate ,MyDate workPeriod) {
		super(empno, name, salary, birthDate, hireDate);
		this.workPeriod = workPeriod;
	}

	public MyDate getWorkPeriod() {
		return workPeriod;
	}

	public void setWorkPeriod(MyDate workPeriod) {
		this.workPeriod = workPeriod;
	}

	@Override
	public String toString() {
		return "Intern : "+super.toString() + " workPeriod=" + workPeriod + "]";
	}
	
	
}
