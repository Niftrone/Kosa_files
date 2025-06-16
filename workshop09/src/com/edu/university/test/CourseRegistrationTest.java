package com.edu.university.test;

import com.edu.university.Course;
import com.edu.university.Student;
import com.edu.university.UniversityService;

public class CourseRegistrationTest {
	
	public static void main(String[] args) {
		Course[] cour1 = {
			    new Course("Java", "이교수", 4),
			    new Course("자료구조", "가교수", 3),
			    new Course("유니티", "김교수", 3)
			};
		Course[] cour2 = {
			    new Course("html", "가교수", 4),
			    new Course("백엔드", "교교수", 3),
			    new Course("프론트엔드", "양교수", 3)
			};
		
		Student stu1 = new Student(1, 1524, "이우진");
		Student stu2 = new Student(2, 1234, "이00");
		Student stu3 = new Student(2, 1432, "박00");
		Student stu4 = new Student(3, 1111, "김00");

		Student[] students = {stu1,stu2,stu3,stu4};
		
		students[0].setCoures(cour1);
		students[1].setCoures(cour2);
		students[2].setCoures(cour1);
		students[3].setCoures(cour2);
		//성적 랜덤 입력
		UniversityService unsutyService = new UniversityService(students);
		for (Student student : students) {
			unsutyService.randomGPA(student);
		}
		
		// 1. 학번으로 학생의 모든 정보를 출력하는 기능
		System.out.println(unsutyService.getStudentsInfo(1111));
		
		// 2. 특정한 학생이 수강 과목을 추가하는 기능
		unsutyService.addStudentByCourse(1432, cour2[1]);
		
		// 3. 학년 별 몇명인지 반환
		int[] grade = unsutyService.getGradeDistribution();
		for (int i = 1; i < grade.length - 1; i++) {
		    System.out.println(i + "학년은 " + grade[i] + "명");
		}
		
		// 4. 학생 중에서 총 이수 학점이 가장 많은 학생을 반환
		System.out.println(" \n 학점이 가장 많은 학생 : " + unsutyService.findTopCreditStudent().getName());
		
		System.out.println();
		//5. 모든 수업 중 특정 교수님이 수업하는 모든 수업 반환
		Course[] courses = unsutyService.findProfessorCourse("가교수");

		for (int i = 0; i < courses.length && i < 2; i++) {
		    System.out.println(courses[i].getCourseName());
		}
		
		// 6. 특정 학생이 이수하는 모든 과목의 성적 평균 반환
		double kim = unsutyService.getAverageGpa(1111);
		System.out.printf("김00의 평균 점수 : %.2f" ,kim);
		
		// 7.특정 과목을 수강하는 모든 학생의 성적 분포 반환
		int[] distribut = unsutyService.getGradeDistribution("백엔드");

		System.out.println("\n\nA학점 : " + distribut[0]);
		System.out.println("B학점 : " + distribut[1]);
		System.out.println("C학점 : " + distribut[2]);
		System.out.println("F학점 : " + distribut[3]);
	}
}
