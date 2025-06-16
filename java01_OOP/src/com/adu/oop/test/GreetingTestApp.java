package com.adu.oop.test;
import com.adu.oop.*;
/*
 필드에 값을 주입
 주입된값을 호출..메소드 호출
 메모리 할당
 */

public class GreetingTestApp {

	public static void main(String[] args) {
		//1. 클래스의 멤버를 메모리에 올린다 (메모리 할당) 객체생성
		Greeting g = new Greeting();
		
		//2. 메모리 올라간 멤버에 접근
		// 필드 접근... 필드에 값을 넣는다 필드 초기화
		g.greet = "반갑습니다";
		// 필드 = value 실제값
		g.target = "MSA FullStack 3기 여러분";
		
		
		// 메소드 접근... 메소드를 호출		
		g.printMessage();
		
	}

}
