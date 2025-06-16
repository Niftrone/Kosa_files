package com.adu.child;

import com.adu.parent.Flyer;

public class SuperMan implements Flyer{

	@Override
	public void flyer() {
		System.out.println("슈퍼맨이 납니다");
	}

	@Override
	public void takeOff() {
		System.out.println("슈퍼맨이 점프합니다.");
	}

	@Override
	public void land() {
		System.out.println("슈퍼맨이 착지합니다.");
	}
	
	public String stopBullet() {
		return "총알을 막음";
	}
}
