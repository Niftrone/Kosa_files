package com.adu.condition.test2;

import java.util.Scanner;

/*
 1			3			2
 cat a	  cat b		  mouse
 
 1.값 입력
 2.요청 (메소드 호출)
 3.반환값 콘솔로 출력
 
  */

public class CatchAMouseTest1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("CatA, CatB, Mouse 각각의 위치를 숫자로 입력 >>>");
		
		CatAMouse solv = new CatAMouse();
		
		int catA = scan.nextInt();
		int catB = scan.nextInt();
		int mouse = scan.nextInt();
		
		String result = solv.solv(catA, catB, mouse);
		System.out.println(result);
		
		scan.close();
	}
	
}

class CatAMouse{
	public String solv(int catA, int catB, int mouse) {
//		if(Math.abs(catA - mouse)  > Math.abs(catB - mouse)) {
//			return "B 고양이가 잡을 것 이다.";
//		}else if(Math.abs(catA - mouse) < Math.abs(catB - mouse)) {
//			return "A 고양이가 잡을 것 이다.";
//		} else {
//			return "쥐 탈출";
//		}
		int catACatchM = Math.abs(catA - mouse);
		int catBCatchM = Math.abs(catB - mouse);
		
		return 
				catACatchM > catBCatchM ? "B 고양이가 잡을 것 이다." :
				catACatchM < catBCatchM ? "A 고양이가 잡을 것 이다." :
				"쥐 탈출";
	}
}

