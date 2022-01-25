package com.InheritanceExcercise;

public class Trainee extends Employee {

	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double salary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		setBasicSalary(salary);
	}

}
