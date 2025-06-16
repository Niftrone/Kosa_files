package com.edu.exception;

public class DuplicateEmpException extends Exception{
	public DuplicateEmpException(){
		this("this is duplicate");
	}
	public DuplicateEmpException(String message){
		super(message);
	}
}
