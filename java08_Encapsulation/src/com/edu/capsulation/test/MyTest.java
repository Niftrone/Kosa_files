package com.edu.capsulation.test;

import java.util.Scanner;

import com.edu.capsulation.MyDate;

public class MyTest {
	/* Encapsulation
	  1. 필드앞 -->private
	  2.  void setXxx (0,0,0) ---> public
	      Xxx getXxx ()  ---> public
	   
	  3. setXxx() 메소드에서 필드초기화 하기 직전에
	     타당한 값만 필드에 할당되도록 제이문을 달아준다 
	  */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		MyDate md = new MyDate();
//		md.month = 33;
//		md.day = 13;
		
	    System.out.print("월을 입력하세요 (1~12): ");
	    md.setMonth(scan.nextInt());

		System.out.println("일을 입력하세요");
		md.setDay(scan.nextInt());

		
	    if (md.getMonth() != 0 && md.getDay() != 0) {
	        System.out.println("오늘은 " + md.getMonth() + "월 " + md.getDay() + "일 입니다.");
	    } else {
	        System.out.println("입력값이 유효하지 않아 날짜를 표시할 수 없습니다.");
	    }
		
		scan.close();
	}

}
