package com.edu.service.test;

import java.util.Date;
import java.util.Scanner;

import com.edu.service.Board;
import com.edu.service.Writer;


public class BoardAppTest {

	public static void main(String[] args) {
		
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		Board board = new Board();
		Writer writer = new Writer();
		String id;
		
		// 반복문으로 2번 반복
		for(int i=0; i < 2; i++) {
			System.out.println("이름을 입력하세요.");
			String name = scan.nextLine();
			
			System.out.println("아이디를 입력하세요.");
		// 예외 처리
			while(true) {
				try {
					id = scan.nextLine();
					Integer.parseInt(id);
					break;
				}
				catch(Exception e) {
					System.out.println("숫자로만 입력하세요.");
				}
				
			}
			// 정보 입력
			writer.setWriterInfo(name, id);
			board.setBoard("워크샵 ", "숙제 내용 ", new Date());
			board.setWriterInfo(writer);
			
			// 출력 란
			System.out.println(board.getBoard());
		}


	}

}
