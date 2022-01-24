package com.InheritanceExcercise;

public class Employee {

	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
	
	
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = salary;
		
		

	}

	public double calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.println(salary);
		return salary;
	}
	public double calculateTransportAllowance() {
		double transportAllowance = 10 * basicSalary/ 100;
		System.out.println(transportAllowance);
		return transportAllowance;
	}
	
}
