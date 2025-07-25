package com.edu.dice.impl;

import java.util.Random;

import com.edu.dice.Dice;

public class DiceAImpl implements Dice{
	///Field
	private int value;
	///Constructor
	public DiceAImpl() {
		System.out.println("::"+getClass().getName()+"기본 생성자....");
	}
	public DiceAImpl(int value) {
		this.value = value;
		System.out.println("::"+getClass().getName()+"명시적 생성자....");
	}
	//Method (getter/setter)
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	//==> 주사위를 던저 선택되는 숫자를 생산하는 행위(무작위로 숫자 생산)
	@Override
	public void selectedNumber(){
		value = new Random().nextInt(6) + 1;
	}
	
}//end of class