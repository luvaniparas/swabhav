package com.techlab.engineeringCollege;

import java.text.ParseException;

public class Professor extends Person {

	private double salary ;
	private final double INCREMENT =500 ;
	
	public Professor(String id, String address, String dateOfBirth,double salary) throws ParseException {
		super(id, address, dateOfBirth);
		this.salary = calculateSalary(salary) ;
	}
	
	public double calculateSalary(double salary2) {
		salary = INCREMENT * salary2 ;
		return salary ;
	}
	
	public double getSalary() {
		return salary;
	}
	
}
