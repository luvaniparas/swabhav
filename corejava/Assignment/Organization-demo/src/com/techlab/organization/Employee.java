package com.techlab.organization;

public abstract class Employee {
	private int id;
	private String name;
	private double grossSalary;
	protected float basicPay;
	protected double salary;
	protected double gsalary ;
	
	public Employee(int id, String name, float basicPay) {
		this.id = id;
		this.name = name;
		this.basicPay = basicPay;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public float getBasicPay() {
		return basicPay;
	}	
	
	public double getSalary() {
		return salary;
	}

	public abstract double calculateSalary();
}
