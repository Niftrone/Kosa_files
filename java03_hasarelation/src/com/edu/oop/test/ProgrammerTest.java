package com.edu.oop.test;

import com.edu.oop.NoteBook;
import com.edu.oop.Programmer;

public class ProgrammerTest {

	public static void main(String[] args) {
		//1. NoteBook, Programmer 객체 생성
		NoteBook noteBook = new NoteBook();
		Programmer programmer = new Programmer();
		//2. setXxx 기능을 사용하여 객체 필드 초기화
		programmer.setProgrammer("이우진", "Kitlin", 28000);
		noteBook.setNoteBook(12, "삼성", 100000);
		programmer.setNoteBook(noteBook);
		
		//3. Programmer의 정보를 받아서 콘솔창으로 출력
		System.out.println(programmer.getProgramer() +", " + programmer.getNoteBook().brand);

	}

}
