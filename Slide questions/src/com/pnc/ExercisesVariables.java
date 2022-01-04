package com.pnc;

public class ExercisesVariables {
	public static void main(String[] args) {
		
		
		//1
		
		int a = 1;
		int b = 1;
		
		System.out.println(a + b);
		
		
	 //2 
		int c = 1;
		int d = 1;
		int sum = 0;
		sum = c + d;
		System.out.println(sum);
	 
		
	//3
		double ab = 2.09;
		int cd = 3;
		double sum3 = 0;
		double abDouble = cd;
		
		sum3 = abDouble + ab;
		
		System.out.println(sum3);
		
		// What variable type must the sum be? Double
		
	//4
		double x =  4.9;
		int y = 7;
		double result = 0;
		result = x/y;
		System.out.println(result);
	
		//What happens? What corrections are needed? Error, needs to be casted to a double
		
	//5 
		double g = 97;
		double h = 9;
		double results1 = g/h;
		System.out.println(results1);
		int intResults1 = (int) results1;
		System.out.println(intResults1);
	
	//6
		int x2 = 5;
		int y2 = 6;
		
		int q = y2/x2;
		System.out.println(q);
		
		double y2Double = (double) y2;
		
		double q2 = y2Double/x2;
		System.out.println(q2);
		
		
	//7
		final double PI = 3.14;
		
		int radius = 6;
		
		double circumference = radius*PI*2;
		
		System.out.println(circumference);
		
	//8 
		double coffee = 3.50;
		double espresso = 1.50;
		double latte = 4.50;
		double subtotal = 0;
		double totalSale = 0;
		final double salesTax = .05;
		
		subtotal = (coffee * 3) + (espresso * 4) + (latte * 2);
		//System.out.println(subtotal);
		totalSale = (subtotal * salesTax) + subtotal;
		System.out.printf("Your Total is %.2f", totalSale);
		
		
	}
}
