package com.InheritanceExcercise;

public class Manager extends Employee {

	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double salary) {
		super(employeeId, employeeName, employeeAddress, employeePhone, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateTransportAllowance() {
		double transportAllowance = 15 * basicSalary / 100;
		System.out.println(transportAllowance);
		return transportAllowance;
	}

}
