package com.adu.child;

import com.adu.parent.Employee;
import com.adu.util.MyDate;

public class Engineer extends Employee{
	private String tech;
	private int bonus;
	
	public Engineer(int empno,String name, double salary, MyDate birthDate,  String tech, int bonus) {
		super(empno, name, salary, birthDate);
		this.tech = tech;
		this.bonus = bonus;
	}

	public String getTech() {
		return tech;
	}

	public void changeTech(String tech) {
		this.tech = tech;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
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
		
		return super.toString() + " tech=" + tech + ", bonus=" + bonus + "]";
	}
		
	
}
