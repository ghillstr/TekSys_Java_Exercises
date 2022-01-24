package com.InheritanceExcercise;

public class InheritanceActivity {
	public static void main(String[] args) {
		Manager peter = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		Trainee jack = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		
		System.out.println("Salary:");
		System.out.println("Test Case 1:" ); 
		System.out.println("$" + peter.calculateSalary());
		System.out.println("Test Case 2:" );
		System.out.println("$" + jack.calculateSalary());
		System.out.println("\nTransport Allowance:");
		System.out.println("Test Case 1: " ); 
		System.out.println("$" + peter.calculateTransportAllowance());
		System.out.println("Test Case 2: $" );
		System.out.println("$" + jack.calculateTransportAllowance());
		System.out.println("\nTotal Salary:");
		System.out.println("Test Case 1: " ); 
		peter.totalSalary();
		System.out.println("Test Case 2: " );
		jack.totalSalary();
	}
}
