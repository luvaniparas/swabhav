package com.techlab.organization;

public class Analayst extends Employee {
	private double perks = 20.0 ;

	
	public Analayst(int id, String name, float basicPay) {
		super(id, name, basicPay);
	}

	@Override
	public double calculateSalary() {
		gsalary = basicPay ;
		salary = gsalary + ((perks/100)*gsalary) ;
		return salary ;
	}
	
	
	
}
