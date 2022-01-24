package com.monster;

public class StoneMonster extends Monster {

	public StoneMonster(String name) {
		super(name);
		super.attack();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String attack() {
		return "Attack with stones!";
		
	}

}
