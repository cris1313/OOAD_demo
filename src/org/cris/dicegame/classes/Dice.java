package org.cris.dicegame.classes;

public class Dice {
	private int faceValue;

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	
	public void roll(){
		this.faceValue = (int)Math.ceil(Math.random()*6);
	}

}
