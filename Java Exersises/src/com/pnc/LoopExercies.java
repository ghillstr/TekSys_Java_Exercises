package com.pnc;

import java.util.Scanner;

public class LoopExercies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 question1();
		 question2();
		 question3();
		 question4();
		 question5();
		 question6();
		 question7();
		 question8();
		 question9();
	}

	public static void question1() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	}

	public static void question2() {
		int i = 0;
		while (i < 100) {
			i = i + 10;
			System.out.println(i);

		}
	}

	public static void question3() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i < 11);
	}

	public static void question4() {
		int i = 0;
		for (i = 0; i < 101; i++) {
			if (i >= 25 && i <= 75)
				continue;

			if (i % 5 == 0) {

				System.out.println(i);

			}

		}
	}

	public static void question5() {
		int i = 0;
		for (i = 0; i < 101; i++) {
			if (i > 50) {
				break;
			}
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}

	}

	public static void question6() {
		for (int i = 1; i < 3; i++) {
			System.out.println("Week " + i + ": \n");
			for (int j = 1; j < 6; j++) {
				System.out.println("Day " + j + "\n");
			}

		}
	}

	public static void question7() {
		int sum = 0;
		int num = 0;

		for (int i = 10; i <= 200; i++) {
			num = i;
			sum = 0;
			while (num != 0) {
				int r = num % 10;
				num = num / 10;
				sum = sum * 10 + r;
			}

			if (i == sum)
				System.out.print(i + " ");

		}

	}

	public static void question8() {
		int n1 = 0;
		int n2 = 1;
		int n3;
		int i = 0;
		int count = 10;
		System.out.print(n1 + ", " + n2);
		do {
			for (i = 2; i < count; ++i) {
				n3 = n1 + n2;
				System.out.print(", " + n3);
				n1 = n2;
				n2 = n3;
			}
		} while (n1 + n2 <= 50);
	}

	public static void question9() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("Inner loop: i: " + i + ", j: " + j);
			}
		}
	}

}
