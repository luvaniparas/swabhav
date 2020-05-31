package com.techlab.organization;

public class Manager extends Employee {
	private double hra = 50.0 ; 
	private double ta = 40.0;
	private double da = 30.0;
	
	public Manager(int id, String name, float basicPay) {
		super(id, name, basicPay);
	}

	@Override
	public double calculateSalary() {
		gsalary = basicPay ;
		salary = gsalary + ((hra/100)*gsalary) ;
		return salary ;
	}

}
