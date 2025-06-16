package com.adu.array.test2;

import java.util.Scanner;

public class ArrayUsingScannerTest4 {
	
	static int studentNum = 0;
	static int[] scores = null;

	public static void main(String[] args) {
		boolean run = true;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("메뉴 선택 > ");
			
			int menu = scan.nextInt();
			
			switch(menu) {
				case 1: 
					scores = studenCount();
					break;
				case 2:
					System.out.println("학생 성적 입력");
					int idx =0;
					for(int score : scores) {
						System.out.println(idx +1 +"번 학생 성적 입력");
						scores[idx++] = scan.nextInt();
					}
					break;
				case 3: 
					System.out.println("학생들의 성적입니다.");
					for(int score : scores) {
						System.out.print(score + " ");
					}
					System.out.println();
					break;
				case 4:
					int max=0;
					int total=0;
					for(int score : scores) {
						if(score > max) max = score;
						total += score;
					}
					System.out.println("최대값 : " + max + " 총합 : " + total + " 평균 : " + total/scores.length);
					break;
				case 5:
					System.out.println("프로그램 종료");
					run = false;
					break;
				default :
			}
			
		}
		scan.close();
	}
	private static int[] studenCount() {
		System.out.println("학생수 입력");
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[scan.nextInt()];
		return scores;
	}
}
