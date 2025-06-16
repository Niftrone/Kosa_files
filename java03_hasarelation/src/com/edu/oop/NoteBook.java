package com.edu.oop;

public class NoteBook {
	public int serialNumber;
	public String brand;
	public int price;
	
	public void setNoteBook(int serialNumber, String brand, int price) {
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.price = price;
	}
	
	public String getNoteBook() {
		return serialNumber + ", " + brand + ", " + price;
	}
}
