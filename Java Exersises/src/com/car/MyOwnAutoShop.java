package com.car;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		
		Sedan civic = new Sedan(120, 30000, "red", 19);
		System.out.println(civic.getSalePrice());
		
		
		Ford focus = new Ford(110, 15000, "silver", 2016, 3000);
		Ford escape = new Ford(115, 30000, "green", 2019, 1000);
		System.out.println(focus.getSalePrice());
		System.out.println(escape.getSalePrice());
		
		Car lightning = new Car(150, 35000, "black");
		System.out.println(lightning.getSalePrice());
	}

}
