package com.adu.constructor.test;

import java.util.Scanner;

/*
  ShirtTest는 Shirt 객체를 생성할때 인자값으로 실제값을 바로 입력했다.
  즉 컴파일 시점에 실제값이 입력되었다.
  프로그램은 실행할때마다 서로다른 값을 받아들일수 있는 통로를 가져야한다. 
  
  실행시점에서 값을 받아들이기 위해서는 Scanner를 사용할수 있어야 한다.
  우리는 실행할때 키보드를 통해서 원하는 값을 읽어들이는 Scanner를 사용할 것이다.
  
  1. Scanner 객체 생성
     Scanner의 멤버가 메모리에 올라간다.
     
  2.
  
  */

import com.adu.constructor.Shirt;

public class ShirtTest2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //키보드를 통해서 읽어들이는 Scanner 생성
		System.out.println("원하는 셔츠정보를 키보드로 입력받으세요>>");
		
//		while(true) {
//		    System.out.println("셔츠 브랜드를 입력하세요>>");
//		    String brand = scan.nextLine();
//
//		    System.out.println("셔츠 사이즈를 입력하세요>>");
//		    int size = scan.nextInt();
//		    scan.nextLine(); // 줄바꿈 문자 제거
//
//		    System.out.println("셔츠 긴팔여부 입력>>");
//		    boolean longSleeved = scan.nextBoolean();
//		    scan.nextLine(); // 줄바꿈 문자 제거
//
//		    Shirt longT = new Shirt(brand, size, longSleeved);
//
//		    System.out.println(longT.getDetails());
//		}
		
		System.out.println("셔츠 메이커, 사이즈, 긴팔여부 입력 ==>");
		
		String brand = scan.next();
		int size = scan.nextInt();
		boolean longSleeved = scan.nextBoolean();
		
		Shirt longT = new Shirt(brand, size, longSleeved);
		System.out.println(longT.getDetails());

	}
}
