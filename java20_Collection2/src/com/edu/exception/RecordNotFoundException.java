package com.edu.exception;

public class RecordNotFoundException extends Exception{
	public RecordNotFoundException(){
		this("this is RecordNotFound");
	}
	public RecordNotFoundException(String message){
		super(message);
	}
}
