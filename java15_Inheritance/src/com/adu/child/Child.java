package com.adu.child;

import com.adu.parent.Parent;

public class Child extends Parent{
	//자식만의 메소드
	public void childAccess() {
		System.out.println(publicField);
		System.out.println(protectedField);
	}
	
	@Override
	/*
	 * 1. 부모의 메소드를 물려 받아야함
	 * 2. 물려받은 메소드를 고쳐 쓴다.
	 * 
	 * */
	public void access() {
		super.access();
		//추가.. 고쳐 쓴다.
		System.out.println("부모에 접근 가능한 필드 :: "+ publicField + " " + protectedField);
	}
}
