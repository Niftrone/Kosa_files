package com.adu.child;

import com.adu.parent.Flyer;
// class abstract를 가질수 없다. ***
/*
 * 추상화 정도에 따라서 
 * 인터페이스 -> 추상화 클래스 -> 클래스
 *          객체 생성 되지 않음
 */
public abstract class Airplane implements Flyer{

	@Override
	public void flyer() {
		System.out.println("비행기가 납니단");
	}

	@Override
	public void takeOff() {
		System.out.println("비행기가 이륙합니다.");
	}

	public abstract void land();
}
