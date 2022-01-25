package com.InterfaceExercies;

public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUsers kid = new KidUsers(10, "Kids");
		KidUsers kid2 = new KidUsers(18, "Fiction");

		System.out.println("Test Case 1:");
		kid.registerAccount();
		kid.requestBook();
		System.out.println("\n");
		kid2.registerAccount();
		kid2.requestBook();

		AdultUsers adult = new AdultUsers(5, "Kids");
		AdultUsers adult2 = new AdultUsers(23, "Fiction");

		System.out.println("\nTest Case 2:");
		adult.registerAccount();
		adult.requestBook();
		System.out.println("\n");
		adult2.registerAccount();
		adult2.requestBook();
	}

}
