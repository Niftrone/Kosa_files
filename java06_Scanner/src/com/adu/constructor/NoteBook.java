package com.adu.constructor;

public class NoteBook {
	long serialNimber;
	String maker;
	float price;
	
	public NoteBook() {}
	public NoteBook(long serialNimber, String maker, float price) {
//		필드 초기화
		this.serialNimber = serialNimber;
		this.maker = maker;
		this.price = price;
	}
	
	public String getDetails() {
		return serialNimber + "\t" + maker + "\t" + price;
	}
	
	public void discountPrice(int discountValue) {
		price -= discountValue;
	}
}
