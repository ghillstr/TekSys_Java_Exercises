package com.pnc;

import java.util.Scanner;

public class Questions {
	public static void main(String[] args) {
		
		//display time 
		Scanner sc = new Scanner(System.in);
		int inputSeconds = 0;
		int resultMinutes = 0;
		int resultSecR = 0; //Remaining seconds
		System.out.println("Enter seconds:");
		inputSeconds = sc.nextInt();
		resultMinutes = (inputSeconds / 60);
		resultSecR = (inputSeconds % 60);
		
		System.out.println(resultMinutes + "min and " + resultSecR + "sec");
		
		//Converting Temperature
		double temp = 0;
		double celsius = 0;
		System.out.println("Enter temperature (F):");
		temp = sc.nextDouble();
		celsius =(temp - 32) * 0.5556;
		System.out.printf("%.2f (C) %n", celsius);
		
		
		// Sales Tax
		
		double input = 0;
		double salesTax = .08875;
		double output = 0;
		
		System.out.println("Enter Amount: ");
		input = sc.nextDouble();
		output = input * salesTax;
		System.out.println(output);
		
		
		//Computing Loan Payments
		
		double interestRate = 0;
		int years = 0;
		double loanAmount = 0;
		double monthlyPayment = 0;
		System.out.println("Enter interst Rate:");
		interestRate = sc.nextDouble();
		System.out.println("Enter number of years:");
		years = sc.nextInt();
		System.out.println("Enter Loan Amount:");
		loanAmount = sc.nextDouble();
		monthlyPayment = (loanAmount * interestRate) / (1 -(1/ ((1 + interestRate)*years)));
		System.out.println(monthlyPayment);
		
		
		
	}
}
