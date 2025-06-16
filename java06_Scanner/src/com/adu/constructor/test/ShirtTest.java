package com.adu.constructor.test;

import com.adu.constructor.Shirt;

public class ShirtTest {
	public static void main(String[] args) {
		
		Shirt longT = new Shirt("나이키", 110, true);
		Shirt shortT = new Shirt("아디다스", 110, false);
		
		
		longT.setShirt("나이키", 110, true);
		
		System.out.println(longT.getDetails());
		System.out.println(shortT.getDetails());
	}
}
