package com.adu.condition.test;

public class GradeIfTest2 {

	public static void main(String[] args) {
		//해당코드를 실행할때마다 자동으로 학생성적이 랜덤하게 입력됨
		//성적의 범위가 50 ~ 100점 사이의 점수가 랜덤하게 입력되도록 코드를 작성

		System.out.println("성적을 입력해 주세요.");
		
		int grade = (int)(Math.random()*51) + 50;
		
		
		System.out.println(
				grade >= 90 ? "A" :
				grade >= 80 ? "B" :
				grade >= 70 ? "C" :
				"재시험"
				);
	}

}
