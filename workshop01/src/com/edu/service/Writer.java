package com.edu.service;

public class Writer {
	public String name;
	public String id;
	
	//writer 정보를 송출하는 함수
	public String getWriterInfo(String name) {
		return name;
	}
	
	//writer 정보를 설정하는 함수
	public void setWriterInfo(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
}