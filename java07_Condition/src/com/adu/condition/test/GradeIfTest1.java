package com.adu.condition.test;

import java.util.Scanner;

public class GradeIfTest1 {

	public static void main(String[] args) {
		/*
		 1. 학생 성적을 local 변수로 초기화
		    int grade 값은 그때마다 다른 성적을 입력
		    
		 2. 만약 성적이 90이상 A
		 			 80~90 B
		 			 70~80 C
		 			 나머지 재시험
		    
		  */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적을 입력해 주세요.");
		
		int grade = scan.nextInt();
		
		System.out.println(
				grade >= 90 ? "A" :
				grade >= 80 ? "B" :
				grade >= 70 ? "C" :
				"재시험"
				);
	}

}
