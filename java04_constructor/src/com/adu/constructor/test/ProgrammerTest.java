package com.adu.constructor.test;

import com.adu.constructor.NoteBook;
import com.adu.constructor.Programmer;

public class ProgrammerTest {
	public static void main(String[] args) {
		/*
		 *  프로그래머 객체를 2명 생성
		 *  제임스 김안나
		 *  제임스가 애플사 노트북 구매
		 *  김안나는  lg 사 노트북을 구매
		 *  제임스의 연봉을 출력
		 *  김안나의 급여를 50만원 인상
		 *  김안나의 연봉을 출력
		 *  
		 *  각각 개발자의 정보를 최종적으로 출력
		 * */
		
		Programmer jamse = new Programmer("Jamse","자바",3300,100);
		Programmer kimana = new Programmer("김안나","코틀린",3400,400);
		
		NoteBook appleNoteBook = new NoteBook(12, "Apple", 100.10f);
		NoteBook lgNoteBook = new NoteBook(11, "Lg", 95.10f);
		
		jamse.buyNoteBook(appleNoteBook);
		kimana.buyNoteBook(lgNoteBook);
		
		System.out.println("제임스의 연봉 : "+ jamse.getProgrammerSalary());
		
		kimana.increaseProgrammerSalary(50);
		kimana.getProgrammerSalary();
		
		System.out.println("김안나의 연봉 : " + kimana.getProgrammerSalary());
		
		printProgrammerInfo(jamse);
		printProgrammerInfo(kimana);
		
//		System.out.println(jamse.getProgrammerInfo() + "\t" + jamse.getNoteBook().getDetails());
//		System.out.println(kimana.getProgrammerInfo() + "\t" + kimana.getNoteBook().getDetails());
	}
	
	private static void printProgrammerInfo(Programmer programmer) {
		String programmerInfo = programmer.getProgrammerInfo();
		String noteBokkInfo = programmer.getNoteBook().getDetails();
		
		System.out.println(programmerInfo + noteBokkInfo);
		
	}
}
