package com.pnc;

import java.util.*;

public class ConditionalQuestions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		slide12(sc);
		slide15(sc);
		slide23(sc);
		slide43(sc);
		slide47(sc);
		slide61(sc);
		
		sc.close();
		

	}

	// 12- Conditional Statements
	private static void slide12(Scanner sc) {
		System.out.println("enter number: ");
		int num = sc.nextInt();
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println(num + " is divisible by 2 and 3");
		}
		System.out.println("enter number: ");
		int num2 = sc.nextInt();
		if (num2 % 2 == 0 || num2 % 3 == 0) {
			System.out.println(num2 + " is divisible by 2 or 3");
		}
		System.out.println("enter number: ");
		int num3 = sc.nextInt();
		if (num3 % 2 == 0 ^ num2 % 3 == 0) {
			System.out.println(num3 + " is divisible by 2 or 3, but not both");
		}
	}

	// 15- Conditional Statements
	private static void slide15(Scanner sc) {
		System.out.println("enter year: ");
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("This is a Leap Year!");
		} else {
			System.out.println("This is not a Leap Year!");
		}
	}

	// 23 - Conditional Statements
	private static void slide23(Scanner sc) {
		Random rand = new Random();
		int lottoNum = rand.nextInt(99);
		int revUserNum = 0;
		int firstDigitUser = 0;
		int secondDigitUser = 0;
		int secondDigitlotto = 0;
		String lottoNumString = Integer.toString(lottoNum);
		int firstDigitlotto = Character.digit(lottoNumString.charAt(0), 10);
		try {
			secondDigitlotto = Character.digit(lottoNumString.charAt(1), 10);
		} catch (Exception e) {

		}

		System.out.println("enter number: ");

		int userNum = sc.nextInt();
		final int userNum1 = userNum;
		String userNumString = Integer.toString(userNum);
		firstDigitUser = Character.digit(userNumString.charAt(0), 10);
		try {
			secondDigitUser = Character.digit(userNumString.charAt(1), 10);
		} catch (Exception e) {

		}

		while (userNum != 0) {
			int digit = userNum % 10;
			revUserNum = revUserNum * 10 + digit;
			userNum /= 10;
		}

		if (lottoNum == userNum1) {
			System.out.println("You Win $5000!");
		} else if (revUserNum == lottoNum) {
			System.out.println("You Win $1000!");
		} else if (firstDigitlotto == firstDigitUser || secondDigitlotto == firstDigitUser
				|| secondDigitUser == secondDigitlotto) {
			System.out.println("You win $250!");
		} else {
			System.out.println("No Winnings");
		}
	}

	// 43 -BMI calculator
	private static void slide43(Scanner sc) {
		System.out.println("Enter weight (kg): ");
		double weight = sc.nextDouble();
		System.out.println("Enter height (m): ");
		double height = sc.nextDouble();
		double bmi = weight / (Math.pow(height, 2));

		if (bmi >= 30) {
			System.out.println(bmi + " :Obese");
		} else if (bmi < 30 && bmi >= 25) {
			System.out.println(bmi + " :Overweight");
		} else if (bmi >= 18.5 && bmi < 25.0) {
			System.out.println(bmi + " :Noraml");
		} else {
			System.out.println(bmi + " :Underweight");
		}
	}

	// 61 -Chinese Zodiac
	private static void slide61(Scanner sc) {
		System.out.println("Enter year: ");
		int inputYear = sc.nextInt();

		int zodiac = inputYear % 12;
		switch (zodiac) {
		case 0:
			System.out.println("Year of the Monkey");
			break;
		case 1:
			System.out.println("Year of the Rooster");
			break;
		case 2:
			System.out.println("Year of the Dog");
			break;
		case 3:
			System.out.println("Year of the Pig");
			break;
		case 4:
			System.out.println("Year of the Rat");
			break;
		case 5:
			System.out.println("Year of the Ox");
			break;
		case 6:
			System.out.println("Year of the Tiger");
			break;
		case 7:
			System.out.println("Year of the Rabbit");
			break;
		case 8:
			System.out.println("Year of the Dragon");
			break;
		case 9:
			System.out.println("Year of the Snake");
			break;
		case 10:
			System.out.println("Year of the Horse");
			break;
		case 11:
			System.out.println("Year of the Sheep");
			break;

		}
	}

	// 47 -Computing Taxes
	private static double singleFilter(double income) {
		if (income < 8350) {
			return income * 0.1;
		} else if (income < 33950) {
			return income * 0.15;
		} else if (income < 82250) {
			return income * 0.25;
		} else if (income < 171550) {
			return income * 0.28;
		} else if (income < 372950) {
			return income * 0.33;
		} else {
			return income * 0.35;
		}

	}

	private static double marriedJointlyFilter(double income) {
		if (income < 16700) {
			return income * 0.1;
		} else if (income < 67900) {
			return income * 0.15;
		} else if (income < 137050) {
			return income * 0.25;
		} else if (income < 208850) {
			return income * 0.28;
		} else if (income < 372950) {
			return income * 0.33;
		} else {
			return income * 0.35;
		}

	}

	private static double marriedSeparateFilter(double income) {
		if (income < 8350) {
			return income * 0.1;
		} else if (income < 33950) {
			return income * 0.15;
		} else if (income < 68525) {
			return income * 0.25;
		} else if (income < 104425) {
			return income * 0.28;
		} else if (income < 186475) {
			return income * 0.33;
		} else {
			return income * 0.35;
		}

	}

	private static double hoH(double income) {
		if (income < 11950) {
			return income * 0.1;
		} else if (income < 45500) {
			return income * 0.15;
		} else if (income < 117450) {
			return income * 0.25;
		} else if (income < 190200) {
			return income * 0.28;
		} else if (income < 372950) {
			return income * 0.33;
		} else {
			return income * 0.35;
		}

	}

	private static void slide47(Scanner input) {

		System.out.println(
				"Filing status:\n1: Single\n2: Married" + "\n3: Married Filing Separately\n4: Head of Household");

		int filterStatus = input.nextInt();
		System.out.println("Enter Income: ");
		double income = input.nextDouble();

		switch (filterStatus) {

		case 1:
			System.out.println(singleFilter(income));
			break;
		case 2:
			System.out.println(marriedJointlyFilter(income));
			break;
		case 3:
			System.out.println(marriedSeparateFilter(income));
			break;
		case 4:
			System.out.println(hoH(income));
			break;
		}

	}

}
