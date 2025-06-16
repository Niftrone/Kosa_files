package com.edu.exception.test3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileService4 {
	public void readFile(String fileName) throws FileNotFoundException, IOException {
		System.out.println("2. FileReader Creating");
		//finally 블럭안에서 자원을 반납해야하는 경우에는 try with resource구분 사용
		try(FileReader is = new FileReader(fileName)) {
			int data;
			while((data=is.read()) != -1) {
				System.out.println((char)data);
			}
		}
	}
}

public class CompileExceptionTest4 {
	public static void main(String[] args) {
		System.out.println("1. readFile() calling.....");
		FileService4 service = new FileService4();
		try {
			service.readFile("text.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
