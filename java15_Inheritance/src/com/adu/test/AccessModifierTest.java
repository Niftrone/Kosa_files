package com.adu.test;

import com.adu.child.Child;

public class AccessModifierTest {

	public static void main(String[] args) {
		//child 객체 생성
		Child child = new Child();
		//childAccess();
		child.childAccess();
		//access
		child.access();
		
	}

}
