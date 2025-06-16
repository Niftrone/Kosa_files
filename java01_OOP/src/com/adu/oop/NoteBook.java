package com.adu.oop;

public class NoteBook {
	public int serialNumber;
	public String brand;
	public double price;
	
	public void printNoteBookInfo() {
		System.out.printf("시리얼 넘버 : %d \n",serialNumber);
		System.out.printf("브랜드 : %s \n",brand);
		System.out.printf("가격 : %.3f", price);		
	}
}
