package com.adu.parent;
/*
 * 인터페이스 구성요소
 * public abstract method
 * public static final 상수값
 * 
 * 날으는 것과 관련된 기능의 Template
 * 추상메소드 들의 집합..
 * 
 * 필드가 없다.
 */
public interface Flyer {
	int MAX_SPEED = 250;//public static final이 생략되어있다
	
	void flyer(); // public abstract 가 자동으로 붙게된다
	void takeOff();
	void land();
	
}
