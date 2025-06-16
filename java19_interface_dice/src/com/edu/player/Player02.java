package com.edu.player;

import com.edu.dice.*;

/*
 *	FileName : Player01.java
 *	ㅇ DiceA 를 직접적으로 연결하지 않고 인터페이스 Dice와 연결되어 느슨한 결합을 진행
 *  ㅇ Dice와 결합되었기 때문에 Dice의 자식 클래스인 DiceAImpl, DiceBImpl, DiceCImpl 과도
 *  	언제든지 연결될수 있다.
 *  	해당 소스코드 수정없이 가능하다.
 *  	결과적으로 코드의 재사용성이 좋아졌다.
 */
public class Player02 {

	/// Field
	private Dice dice;
	private int totalValue;

	public Player02(Dice dice) {
		super();
		this.dice = dice;
	}

	/// Constructor Method
	public Player02() {
	}

	/// Method (getter/setter)
	public Dice getDice() {
		return dice;
	}

	public void setDice(Dice dice) {
		this.dice = dice;
	}

	public int getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}

	// ==> count 만큼 주사위를 굴려서 합을 후하는 행위
	public void playDice(int count) {

		System.out.println("==>" + getClass().getName() + ".playDice() start....");
		
		for (int i = 0; i < count; i++) {
			dice.selectedNumber();
			System.out.println("::[ " + dice.getClass().getName() + " ] 의 선택된수 : " + dice.getValue());
			totalValue += dice.getValue();
		}

		System.out.println("==>" + getClass().getName() + ".playDice() end....");
	}

}// end of class