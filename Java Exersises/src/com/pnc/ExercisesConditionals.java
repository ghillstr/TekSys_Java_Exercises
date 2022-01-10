package com.pnc;

import java.util.*;

public class ExercisesConditionals {
	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Grade: ");
		question5(sc);
		System.out.println("Enter Number, 1 through 7: ");
		question6(sc);
		sc.close();

	}

	public static void question1() {
		// int x = 7;
		int x = 15;
		if (x < 10) {
			System.out.println("Less then 10");
		}

	}

	public static void question2() {
		// int x = 7;
		int x = 15;
		if (x < 10) {
			System.out.println("Less then 10");
		} else if (x > 10) {
			System.out.println("Greater then 10");
		}
	}

	public static void question3() {
		// int x = 15;
		int x = 50;
		if (x < 10) {
			System.out.println("Less then 10");
		} else if (x > 10 && x < 20) {
			System.out.println("Between 10 and 20");
		} else if (x >= 20) {
			System.out.println("Greater than or equal to 20");
		}
	}

	public static void question4() {
		// int x = 15;
		int x = 5;
		if (x < 10 || x > 20) {
			System.out.println("Out of Range");
		} else {
			System.out.println("In Range");
		}
	}

	public static void question5(Scanner sc) {
		int grade = sc.nextInt();
		if (grade <= 100 && grade >= 90) {
			System.out.println("A");
		} else if (grade <= 89 && grade >= 80) {
			System.out.println("B");
		} else if (grade <= 79 && grade >= 70) {
			System.out.println("C");
		} else if (grade <= 69 && grade >= 60) {
			System.out.println("D");
		} else if (grade < 60 && grade >= 0) {
			System.out.println("F");
		} else {
			System.out.println("Out of Range");
		}

	}

	public static void question6(Scanner sc) {
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:
			System.out.println("THURSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		case 7:
			System.out.println("SUNDAY");
			break;
		default:
			System.out.println("Out of Range");
			break;

		}

	}
}
