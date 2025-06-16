package com.adu.vo;

//parent Class
public class Employee implements Comparable<Employee>{
	private int empno;
	private String name;
	private double salary;

	public Employee() {
	}

	public Employee(int empno, String name, double salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
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
		return "[name= " + name + ", salary= " + salary +  ", empno= " + empno + "]";
	}

    @Override
    public int compareTo(Employee salary) {
        return Double.compare(this.salary, salary.salary);
    }
}
