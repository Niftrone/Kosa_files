package com.adu.constructor.test;

import com.adu.constructor.NoteBook;
import com.adu.constructor.Programmer;
/*
  NoteBook ----> Programmer
  Hasing 공식
  
  class Programmer{
  	1.
  	NoteBook noteBook;
  	
  	2. 주입통로 2가지 (생성자, setNoteBook())
  	public void setNoteBook(NoteBook noteBook){
  		this.noteBook = noteBook;
  	}
  }
  
 */


public class ProgrammerTest2 {
	public static void main(String[] args) {
		
		Programmer james = new Programmer("James","자바",3300,100);
		Programmer kimana = new Programmer("김안나","코틀린",3400,400);
		
		james.buyNoteBook(new NoteBook(12, "Apple", 100.10f));
		kimana.buyNoteBook( new NoteBook(11, "Lg", 95.10f));
		
//		System.out.println("제임스의 연봉 : "+ James.getProgrammerSalary());
//		
//		kimana.increaseProgrammerSalary(50);
//		kimana.getProgrammerSalary();
//		
//		System.out.println("김안나의 연봉 : " + kimana.getProgrammerSalary());
		
		printProgrammerInfo(james);
		printProgrammerInfo(kimana);
		
		System.out.println("\n=============================");
		/*
		 * FQCN FullName
		 * Full
		 * Qualifed
		 * Class
		 * Name
		 * */
		System.out.println(james);
		System.out.println(kimana);
	}
	
	private static void printProgrammerInfo(Programmer programmer) {
		String programmerInfo = programmer.getProgrammerInfo();
		String noteBokkInfo = programmer.getNoteBook().getDetails();
		
		System.out.println(programmerInfo + noteBokkInfo);
		
	}
}
