package org.cris.classes;

public class DiceGame {

	Dice dice1;
	Dice dice2;
	//result1 and result2 are used for gui
	private int result1;
	private int result2;
	public int getResult1() {
		return result1;
	}

	public int getResult2() {
		return result2;
	}

	
	
	public void play(){
		dice1 = new Dice();
		dice2 = new Dice();
		dice1.roll();
		dice2.roll();
		this.result1 = dice1.getFaceValue();
		this.result2 = dice2.getFaceValue();
	}
	
}
