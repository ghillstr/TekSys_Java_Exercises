package com.car;

public class Sedan extends Car{
	int length;

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	
	}

	@Override
	public double getSalePrice() {
		if(length > 20) {
			return regularPrice - (.05 * regularPrice);
		}
		return regularPrice - (.10 * regularPrice);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
