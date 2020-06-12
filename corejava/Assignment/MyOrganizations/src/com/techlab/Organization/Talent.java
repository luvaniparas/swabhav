package com.techlab.Organization;

public class Talent {
	private int id;
	private String name, partner;
	private double cgpa;

	public Talent(int id, String name, String partner, double cgpa) {
		this.id = id;
		this.name = name;
		this.partner = partner;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPartner() {
		return partner;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public String toString() {
		return "Talent [id=" + id + ", name=" + name + ", cgpa=" + cgpa + ", partner=" + partner + "]";
	}

}
