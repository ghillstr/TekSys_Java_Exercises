package com.car;

public class Truck extends Car {
	int weight;

	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalePrice() {
		if(weight > 2000) {
			return regularPrice - (0.1 * regularPrice);
		}
		return regularPrice - (0.2 * regularPrice);
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}


}
