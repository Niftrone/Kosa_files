package com.adu.child;

import com.adu.parent.Flyer;

public class Bird implements Flyer {

	@Override
	public void flyer() {
		System.out.println("새가 난다");

	}

	@Override
	public void takeOff() {
		System.out.println("새가 날아오른다");

	}

	@Override
	public void land() {
		System.out.println("새가 착지한다");

	}
	
	public String layEggs() {
		return "알을 낳는다";
	}
}
