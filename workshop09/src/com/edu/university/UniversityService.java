package com.edu.university;

import java.util.Arrays;
import java.util.Random;

/*
 * 대학에서 학생이 수업을 신청하고, 학점과 성적조회 등의 기능을 모아놓은 서비스 클래스
 */

public class UniversityService {
	private Student[] students;
	
    public UniversityService(Student[] students) {
        this.students = students;
    }
	
	Student student;
	Course course;
	
	public void randomGPA(Student student) {
	    Random random = new Random();
	    for (Course c : student.getCoures()) {
	        int rand = random.nextInt(4) + 1;
	        char gpa;
	        switch (rand) {
	            case 1: gpa = 'A'; break;
	            case 2: gpa = 'B'; break;
	            case 3: gpa = 'C'; break;
	            default: gpa = 'F'; break;
	        }
	        c.setGpa(gpa);
	    }
	}
//	// 1. 학번으로 학생의 모든 정보를 출력하는 기능
//	getStudentsInfo
    public String getStudentsInfo(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                StringBuilder sb = new StringBuilder();
                sb.append("이름: ").append(student.getName()).append("\n");
                sb.append("학년: ").append(student.getGrade()).append("\n");
                sb.append("학번: ").append(student.getStudentId()).append("\n");
                if (student.getCoures() != null) {
                    sb.append("수강 과목:\n");
                    for (Course c : student.getCoures()) {
                        sb.append("- ").append(c.getCourseName()).append(" (교수: ")
                          .append(c.getProfessor()).append(", 학점: ")
                          .append(c.getCredit()).append(", 성적: ")
                          .append(c.getGpa()).append(")\n");
                    }
                }
                return sb.toString();
            }
        }
        return "학생을 찾을 수 없습니다.";
    }
//	// 2. 특정한 학생이 수강 과목을 추가하는 기능
//	addStudentByCourse
    public void addStudentByCourse(int studentId, Course newCourse) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                Course[] oldCourses = student.getCoures();
                if (oldCourses == null) {
                    student.setCoures(new Course[]{newCourse});
                } else {
                    Course[] newCourses = Arrays.copyOf(oldCourses, oldCourses.length + 1);
                    newCourses[newCourses.length - 1] = newCourse;
                    student.setCoures(newCourses);
                }
                return;
            }
        }
    }

//	// 4. 학생 중에서 총 이수 학점이 가장 많은 학생을 반환
//	findTopCreditStudent
    public Student findTopCreditStudent() {
    	Student topstu = null;
    	int maxCredit = 0;
    	
    	for(Student stu : students) {
    		int totalCredit = 0;
    		Course[] cur = stu.getCoures();
    		if(cur != null) {
    			for(Course c : cur) {
    				totalCredit += c.getCredit();
    			}
    		}
    		if(totalCredit > maxCredit) {
    			maxCredit = totalCredit;
    			topstu = stu;
    		}
    	}
    	return topstu;
    }
//	// 5. 모든 수업 중 특정 교수님이 수업하는 모든 수업 반환
//	findProfessorCourse
    public Course[] findProfessorCourse(String professorName){
    	int count = 0;
    	for(Student stu : students) {
    		Course[] cur = stu.getCoures();
    		for(Course c : cur) {
    			if(c.getProfessor().equals(professorName)) {
    				count++;
    			}
    		}
    	}
    	
    	Course[] findCourse = new Course[count];
    	int idx = 0;
    	for(Student stu : students) {
    		Course[] cur = stu.getCoures();
    		for(Course c : cur) {
    			if(c.getProfessor().equals(professorName)) {
    				findCourse[idx++] = c;
    			}
    		}
    	}
    	
    	return findCourse;
    }
//	// 6. 특정 학생이 이수하는 모든 과목의 성적 평균 반환
//	getAverageGpa
    public double getAverageGpa(int studentId) {
        for(Student stu : students) {
            if(stu.getStudentId() == studentId) {
                Course[] courses = stu.getCoures();
                if(courses == null || courses.length == 0)
                    return 0.0;
                
                double total = 0.0;
                for (Course cour : courses) {
                    total += changeGPA(cour.getGpa());
                }
                return total / courses.length;
            }
        }
        return 0.0;
    }
    
    // 성적 변환기
    private double changeGPA(char gpa) {
        switch (gpa) {
        case 'A':
            return 4.5;
        case 'B':
        	return 4.0;
        case 'C':
        	return 3.5;
        default:
        	return 0.0;
        }
    }
    
//	// 7. 특정 과목을 수강하는 모든 학생의 성적 분포 반환
//	// A - ??명, B - ?? 명, C - ?? 명, F - ?? 명
//	getGradeDistribution
    public int[] getGradeDistribution(String courseName) {
        int[] distribut = new int[4]; // [0] A, [1] B, [2] C, [3] F
        
        for (Student student : students) {
            Course[] courses = student.getCoures();
            if (courses != null) {
                for (Course course : courses) {
                    if (course.getCourseName().equals(courseName)) {
                        char gpa = course.getGpa();
                        switch (gpa) {
                            case 'A':
                            	distribut[0]++;
                                break;
                            case 'B':
                            	distribut[1]++;
                                break;
                            case 'C':
                            	distribut[2]++;
                                break;
                            case 'F':
                            	distribut[3]++;
                                break;
                        }
                    }
                }
            }
        }
        return distribut;
    }
    
//	// 3. 학년 별 몇명인지 반환
//	findByGrade
    public int[] getGradeDistribution() {
        int[] gradeCount = new int[5]; // [0]은 사용 안함, [1] ~ [4] 학년별 학생 수

        for (Student student : students) {
            int grade = student.getGrade();
            if (grade >= 1 && grade <= 4) {
                gradeCount[grade]++;
            }
        }
        return gradeCount;
    }
 }

    


// 1번과 4번은 오버로딩 하여 같은 메소드 명을 공유하고 