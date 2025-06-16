package com.adu.vo;

import com.adu.util.MyDate;

public class SalseMan {
	private String empno;
	private String name;
	private int bonus;
	private MyDate birthDate;

	public SalseMan() {
	}

	public SalseMan(String empno, String name, int bonus, MyDate birthDate) {
		super();
		this.empno = empno;
		this.name = name;
		this.bonus = bonus;
		this.birthDate = birthDate;
	}

	public String getEmpno() {
		return empno;
	}

	public String getName() {
		return name;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getBonus() {
		return bonus;
	}

	public void changeMainSkill(int bonus) {
		this.bonus = bonus;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "SalseMan [empno=" + empno + ", name=" + name + ", bonus=" + bonus + ", birthDate=" + birthDate
				+ "]";
	}

}
