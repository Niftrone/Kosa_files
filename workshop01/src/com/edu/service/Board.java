package com.edu.service;

import java.util.Date;

public class Board {
	public String title;
	public String content;
	public Date updateDate;
	public int count;	
	
	public Writer writer;
	
	//writer 정보를 설정하는 함수
	public void setWriterInfo(Writer writer) {
		this.writer = writer;
	}
	
	//board 정보를 송출하는 함수
	public String getBoard() {
		updateCount();
		return title + content + updateDate + " " + count + " " + writer.name;
	}
	//board 정보를 설정하는 함수
	public void setBoard(String title, String content, Date updateDate) {
		this.title = title;
		this.content = content;
		this.updateDate = updateDate;

	}
	//방문객수를 늘려주는 함수
	private void updateCount() {
		this.count ++;
	}
	
	
}