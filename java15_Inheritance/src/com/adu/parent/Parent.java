package com.adu.parent;

/**
 * public -> protected -> [default] -> private
 * 
 * */

public class Parent {
	public String publicField = "publicField";
	protected String protectedField = "protectedField";
	String defaultField ="defaultField";
	private String privateField = "privateField";
	
	public void access() {
		System.out.println(publicField);
		System.out.println(protectedField);
		System.out.println(defaultField);
		System.out.println(privateField);
	}
}
