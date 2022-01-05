package com.pnc;

import java.util.*;
import java.io.*;

public class ConditionalQuestions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 12- Conditional Statements

//		System.out.println("enter number: ");
//		int num = sc.nextInt();
//		if (num % 2 == 0 && num % 3 == 0) {
//			System.out.println(num + " is divisible by 2 and 3");
//		}
//		System.out.println("enter number: ");
//		int num2 = sc.nextInt();
//		if (num2 % 2 == 0 || num2 % 3 == 0) {
//			System.out.println(num2 + " is divisible by 2 or 3");
//		}
//		System.out.println("enter number: ");
//		int num3 = sc.nextInt();
//		if (num3 % 2 == 0 ^ num2 % 3 == 0) {
//			System.out.println(num3 + " is divisible by 2 or 3, but not both");
//		}
		// 15- Conditional Statements
//		System.out.println("enter year: ");
//		int year = sc.nextInt();
//		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//			System.out.println("This is a Leap Year!");
//		} else {
//			System.out.println("This is not a Leap Year!");
//		}

		// 23 - Conditional Statements
//
//		Random rand = new Random();
//		int lottoNum = rand.nextInt(99);
//		int revUserNum = 0;
//		int firstDigitUser = 0;
//		int secondDigitUser = 0;
//		int secondDigitlotto = 0;
//		String lottoNumString = Integer.toString(lottoNum);
//		 int firstDigitlotto = Character.digit(lottoNumString.charAt(0), 10);
//		try {
//		 secondDigitlotto  = Character.digit(lottoNumString.charAt(1), 10);
//		 } catch (Exception e) {
//			 
//		 }
//	 
//		System.out.println("enter number: ");
//
//		int userNum = sc.nextInt();
//		final int userNum1 = userNum;
//		String userNumString = Integer.toString(userNum);
//		firstDigitUser = Character.digit(userNumString.charAt(0), 10);
//		try { 
//		 secondDigitUser  = Character.digit(userNumString.charAt(1), 10);
//		 } catch (Exception e) {
//			 
//		 }
//		 
//		while (userNum != 0) {
//			int digit = userNum % 10;
//			revUserNum = revUserNum * 10 + digit;
//			userNum /= 10;
//		}
//		 
//		if (lottoNum == userNum1) {
//			System.out.println("You Win $5000!");
//		} else if (revUserNum == lottoNum) {
//			System.out.println("You Win $1000!");
//		} else if (firstDigitlotto == firstDigitUser || secondDigitlotto == firstDigitUser || secondDigitUser == secondDigitlotto ) {
//			System.out.println("You win $250!");}
//		else {
//			System.out.println("No Winnings");
//		}

		// 43 -BMI calculator
//		
//		System.out.println("Enter weight (kg): ");
//		double weight = sc.nextDouble();
//		System.out.println("Enter height (m): ");
//		double height = sc.nextDouble();
//		double bmi = weight/(Math.pow(height, 2));
//		
//		if(bmi >= 30) {
//			System.out.println(bmi + " :Obese");
//		}else if (bmi < 30 && bmi >= 25){
//			System.out.println(bmi + " :Overweight");
//		}else if (bmi >= 18.5 && bmi < 25.0) {
//			System.out.println(bmi + " :Noraml");		
//		}else {
//			System.out.println(bmi + " :Underweight");
//		}

		// 47 -Computing Taxes

		// 61 -Chinese Zodiac

		System.out.println("Enter year: ");
		int year = sc.nextInt();

		int zodiac = year % 12;
		switch (zodiac) {
		case 0: System.out.println("Year of the Monkey"); break;
		case 1: System.out.println("Year of the Rooster"); break;
		case 2: System.out.println("Year of the Dog"); break;
		case 3: System.out.println("Year of the Pig"); break;
		case 4: System.out.println("Year of the Rat"); break;
		case 5: System.out.println("Year of the Ox"); break;
		case 6: System.out.println("Year of the Tiger"); break;
		case 7: System.out.println("Year of the Rabbit"); break;
		case 8: System.out.println("Year of the Dragon"); break;
		case 9: System.out.println("Year of the Snake"); break;
		case 10: System.out.println("Year of the Horse"); break;
		case 11: System.out.println("Year of the Sheep"); break;
		}

	}

}
