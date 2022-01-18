package com.pnc;

import java.util.Arrays;
import java.util.Random;

public class ArrayExercises {
	public static void main(String[] args) {
		 slide33();
		 slide43();
		 question1();
		 question2();
		 question3();
		 question4();
		 question5();
		 question6();
		 question7();
		 question8();
		 question9();
		question10();
	}

	public static void slide33() {

		int[] deck = new int[52];

		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
			int cardNumber = deck[i] / 13;
			switch (cardNumber) {
			case 0:
				System.out.println(deck[i] + ": Spade");
				break;
			case 1:
				System.out.println(deck[i] + ": Heart");
				break;
			case 2:
				System.out.println(deck[i] + ": Diamond");
				break;
			case 3:
				System.out.println(deck[i] + ": Club");
				break;
			}
		}

	}

	public static void slide43() {
		Random r = new Random();
		int[][] values = new int[2][3];
		int nRows = values.length;
		int nColums = values[0].length;
		for (int row = 0; row < nRows; row++) {
			for (int col = 0; col < nColums; col++) {
				values[row][col] = 0 + r.nextInt(11);
				int v = values[row][col];
				System.out.printf("  %d\t", values[row][col]);
			}
			System.out.println();
		}

	}

	public static void question1() {
		int[] arr = { 1, 2, 3 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void question2() {
		int[] arr = { 13, 5, 7, 68, 2 };
		System.out.println(arr[2]);
	}

	public static void question3() {
		String[] arr = { "red", "green", "blue", "yellow" };
		String[] arr2 = arr.clone();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void question4() {
		int[] arr = { 1, 2, 3, 4, 6 };
		System.out.println(arr[0]);
		System.out.println(arr[arr.length - 1]);
		// System.out.println(arr[arr.length]);
		// System.out.println(arr[5]);
	}

	public static void question5() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}

	}

	public static void question6() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 2;
			System.out.println(arr[i]);
		}

	}

	public static void question7() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;

		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

	}

	public static void question8() {
		String[] arr = { "red", "green", "blue", "yellow" };
		System.out.println("Array 1");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("\t index: " + i + " Output: " + arr[i]);
		}
		String temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;
		System.out.println("Array 2");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("\t index: " + i + " Output: " + arr[i]);
		}

	}

	public static void question9() {
		int[] arr = { 4, 2, 9, 13, 1, 0 };
		Arrays.sort(arr);
		System.out.println("Array in ascendong order: " + Arrays.toString(arr));
		System.out.println("\nThe smallest number is " + arr[0]);
		System.out.println("\nThe biggest number is " + arr[arr.length - 1]);

	}

	public static void question10() {
		Object[] arr = new Object[5];
		arr[0] = 5;
		arr[1] = "red";
		arr[2] = "yellow";
		arr[3] = "blue";
		arr[4] = 3.5;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
