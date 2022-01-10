package com.pnc;

import java.util.*;

public class QuesitonsLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// slide22(sc);
		slide23(sc);
		// multiTableSlide50();
		// slide52();

		sc.close();

	}

	public static void slide22(Scanner sc) {
		Random r = new Random();
		while (true) {
			int a = r.nextInt(100) + 1;
			int b = r.nextInt(100) + 1;
			int result = 0;
			System.out.println("What is " + a + " + " + b + "?");
			System.out.println("Enter solution: ");
			if (!sc.hasNextInt()) {
				sc.next();
				break;
			}
			result = sc.nextInt();

			if ((a + b) == result) {
				System.out.println("Correct Answer");
			} else {
				System.out.println("Incorrect Answer");
			}
		}

	}

	public static void slide23(Scanner sc) {
		Random r = new Random();
		char input2;
		do {
			int num = r.nextInt(100) + 1;
			int input = 0;

			//System.out.println(num); 
			while (num != input) {
				System.out.println("Enter number: ");
				input = sc.nextInt();

				if (num > input) {
					System.out.println("Too Low");

				} else if (num < input) {
					System.out.println("Too High");
				}
			}

			System.out.println("Correct");
			System.out.println("Would you like to play again? Yes (Y) or No (N): ");
			input2 = sc.next().charAt(0);
		} while (input2 == 'Y' || input2 == 'y');

	}

	public static void multiTableSlide50() {

		for (int outter = 1; outter < 13; outter++) {
			System.out.println();
			for (int inner = 1; inner < 13; inner++) {
				System.out.printf("%4d", (outter * inner));
			}
		}
	}

	public static void slide52() {
		int years = 0;

		for (double i = 10000; i < 20000; i = (i * 1.07)) {
			years++;

		}
		System.out.println(years);

	}
}
