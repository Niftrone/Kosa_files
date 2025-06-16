package com.adu.condition.test;

public class GradeSwitchTest3 {

	public static void main(String[] args) {
		int grade = 80;
		
		switch(grade) {
			case 90:
			case 100:
				System.out.println("A");
				break;
			case 85:
			case 80:
				System.out.println("B");
				break;
			case 75:
			case 70:
				System.out.println("C");
				break;
			default :
				System.out.println("재시험");
		}

	}

}
