package com.edu.university;

public class Student {
	private Course[] coures;
	private int grade;
	private int studentId;
	private String name;
	

	public Student	() {
		
	}
	
	public Student(int grade, int studentId, String name) {
		this.grade = grade;
		this.studentId = studentId;
		this.name = name;
	}
	
	public void setCoures(Course[] coures) {
		this.coures = coures;
	}

	public Course[] getCoures() {
		return coures;
	}


	public int getGrade() {
		return grade;
	}


	public int getStudentId() {
		return studentId;
	}


	public String getName() {
		return name;
	}
	
	
}
