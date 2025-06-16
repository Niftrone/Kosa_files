package com.adu.vo;

import com.adu.util.MyDate;

public class Engineer {
	private String empno;
	private String name;
	private String mainSkill;
	private MyDate birthDate;

	public Engineer() {
	}

	public Engineer(String empno, String name, String mainSkill, MyDate birthDate) {
		this.empno = empno;
		this.name = name;
		this.mainSkill = mainSkill;
		this.birthDate = birthDate;
	}

	public String getEmpno() {
		return empno;
	}

	public String getName() {
		return name;
	}

	public String getMainSkill() {
		return mainSkill;
	}

	public void changeMainSkill(String mainSkill) {
		this.mainSkill = mainSkill;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "Engineer [empno=" + empno + ", name=" + name + ", mainSkill=" + mainSkill + ", birthDate=" + birthDate
				+ "]";
	}

}
