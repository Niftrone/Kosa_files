package com.edu.university;

public class Course {
	private String courseName;
	private String professor;
	private int credit;
	private char gpa;
	
	
	public Course() {
		
	}
	
	public Course(String courseName, String professor, int credit) {
		super();
		this.courseName = courseName;
		this.professor = professor;
		this.credit = credit;
	}
	
	public void setGpa(char gpa) {
		this.gpa = gpa;
	}

	public String getCourseName() {
		return courseName;
	}
	public String getProfessor() {
		return professor;
	}
	public int getCredit() {
		return credit;
	}
	public char getGpa() {
		return gpa;
	}
	
	public String getCourse() {
		return courseName + professor + credit + gpa;
	}
	
}
