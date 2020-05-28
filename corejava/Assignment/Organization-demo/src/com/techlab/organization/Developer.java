package com.techlab.organization;

public class Developer extends Employee {
	private double bonus = 30 ;
	double gsalary ;
	
	public Developer(int id, String name, float basicPay) {
		super(id, name,basicPay);
	}
	
	public double getBonus() {
		return bonus;
	}
	
	@Override
	public double calculateSalary() {
		gsalary = basicPay ;
		salary = gsalary + ((bonus/100)*gsalary) ;
		return salary ;
	}
	
	
}
