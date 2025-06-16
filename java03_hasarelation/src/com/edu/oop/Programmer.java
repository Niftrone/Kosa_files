package com.edu.oop;

public class Programmer {
	public String name;
	public String mainSkill;
	public int salary;
	
	public NoteBook noteBook;
	
	public void setProgrammer(String name, String mainSkill, int salary) {
		this.name = name;
		this.mainSkill = mainSkill;
		this.salary = salary;
		
	}
	
	public void setNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}
	
	public String getProgramer() {
		return name +  ", " + mainSkill + ", " + salary;
	}
	
	public NoteBook getNoteBook() {
		return noteBook;
	}
}
