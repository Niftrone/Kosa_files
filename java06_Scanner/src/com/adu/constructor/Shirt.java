package com.adu.constructor;


public class Shirt {
	public String brand;
	public int size;
	public boolean longSleeved;
	
	// 인스턴스를 위한 함수
	public Shirt(String brand, int size, boolean longSleeved) {
		//필드 초기화 메소드 
		this.brand = brand;
		this.size = size;
		this.longSleeved = longSleeved;
	}
	
	/*
	  메소드 정의 
	                        메소드 선언부
	  */
	public void setShirt(String brand, int size, boolean longSleeved) {
		//필드 초기화 메소드 
		this.brand = brand;
		this.size = size;
		this.longSleeved = longSleeved;
	}
	
	public String getDetails() {
		return brand + "\t " + size + "\t" + longSleeved;
	}
}
