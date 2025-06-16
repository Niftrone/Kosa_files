package com.adu.constructor;

//NoteBook을 사용하는 개발자
public class Programmer {
	String name;
	String mainSkill;
	double salary;
	int bouns;

	NoteBook noteBook;

	public Programmer() {

	}

	public Programmer(String name, String mainSkill, double salary, int bouns) {
		this.name = name;
		this.mainSkill = mainSkill;
		this.salary = salary;
		this.bouns = bouns;
	}

	public void buyNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}

	public NoteBook getNoteBook() {
		return noteBook;
	}
	
	public String getProgrammerInfo() {
		return name + "\t" + mainSkill + "\t" + salary;
	}
	
	//기능 추가
	
	//개발자의 연봉을 반환하는 기능을 정의...
	public double getProgrammerSalary() {
		return salary * 12 + bouns;
	}
	//개발자의 급여를 기존보다 50만원 더 인상하는 기능을 정의...
	public void increaseProgrammerSalary(double increaseSalary) {
		this.salary += increaseSalary;
	}
}
