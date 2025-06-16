package com.adu.oop.test;

import com.adu.oop.NoteBook;

public class NoteBookTest {

	public static void main(String[] args) {
		
		NoteBook nb = new NoteBook();
		
		nb.serialNumber = 1;
		nb.brand = "삼성 노트북";
		nb.price = 120.45;
		
		nb.printNoteBookInfo();

	}

}
