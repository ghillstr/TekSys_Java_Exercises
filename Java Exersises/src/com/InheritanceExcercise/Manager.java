package com.InheritanceExcercise;

public class Manager extends Employee {

	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double salary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		setBasicSalary(salary);

	}

	@Override
	public double calculateTransportAllowance() {
		double transportAllowance = 15 * getBasicSalary() / 100;
		// System.out.println(transportAllowance);
		return transportAllowance;
	}

}
