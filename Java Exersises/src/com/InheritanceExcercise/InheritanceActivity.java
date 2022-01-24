package com.InheritanceExcercise;

public class InheritanceActivity {
	public static void main(String[] args) {
		Manager peter = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		Trainee jack = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		
		System.out.println("Salary:");
		peter.calculateSalary();
		jack.calculateSalary();
		System.out.println("\nTransport Allowance:");
		peter.calculateTransportAllowance();
		jack.calculateTransportAllowance();
	}
}
