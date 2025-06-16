package com.edu.exception.test3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileService {
	public void readFile(String fileName) {
		System.out.println("2. FileReader Creating");

		// fileName 파일을 일어들이는 로직을 작성
		// Stream에 대한 이해가 필요
		// 아래 new의 의미는 객체를 생성한다는 것이 아닌 stream 자원을 열어서 사용하겠다는 것
		try {
			FileReader fr = new FileReader(fileName);//file명이 잘못 되었거나 , 경로가 잘못 되었을때 에러
			System.out.println("3. 파일을 성공적으로 찾았습니다.");
			fr.read();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		}
	}
}

public class CompileExceptionTest1 {
	public static void main(String[] args) {
		System.out.println("1. readFile() calling.....");
		FileService service = new FileService();
		service.readFile("text.txt");
	}

}
