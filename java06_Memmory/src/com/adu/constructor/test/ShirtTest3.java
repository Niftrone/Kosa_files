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

public class ShirtTest3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //키보드를 통해서 읽어들이는 Scanner 생성
		System.out.println("원하는 셔츠정보를 키보드로 입력받으세요>>");
				
		System.out.println("셔츠 메이커, 사이즈, 긴팔여부 입력 ==>");
		
		String brand = scan.next();
		
		String s = scan.next();
		//parseInt()는 static한 성질의 기능이기 때문에
		//객체생성할 필요없다. 이유는 미리 메모리에 올라가있는 기능이다.
		//클래스이름.기능(); 바로 사용할수 있다.
		int size = Integer.parseInt(s);
		
		String ls = scan.next();
		boolean longSleeved = Boolean.parseBoolean(ls); 
		
		/*
		  Wrapper Class를 제공함
		  	byte	Byte
		  	short	Shrot
		  	int		Integer
		  	long	Long
		  	float	Float
		  	double	Double
		  	boolean	Boolean
		  	char	Character
		  size ::: String --> int Integer         기본형 Primeitive Data Type 소문자_예약어_키워드
		  longSleeved ::: String --> boolean Boolean
		  으로 데이터 형을 바꿔줘야 한다.
		  
		  형변환 시키는 기능을 연결
		  
		  */
		Shirt longT = new Shirt(brand, size, longSleeved);
		System.out.println(longT.getDetails());

	}
}
