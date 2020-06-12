package com.techlab.Organization;

import java.util.ArrayList;

public class Partner {
	private int id;
	private String name;
	private double empStrngth, cmpTurnover;

	public static ArrayList<Talent> tList;

	public Partner(int id, String name, double empStrngth, double cmpTurnover) {
		this.id = id;
		this.name = name;
		this.cmpTurnover = cmpTurnover;
		this.empStrngth = empStrngth;
	}

	public Partner(ArrayList<Talent> tList) {
		this.tList = tList;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCmpTurnover() {
		return cmpTurnover;
	}

	public double getEmpStrngth() {
		return empStrngth;
	}

	public void addTalent(Talent t) {
		if (t.getPartner().equals(this.name)) {
			this.tList.add(t);
		}
	}

	@Override
	public String toString() {
		return "Partner [id=" + id + ", name=" + name + ", empStrngth=" + empStrngth + ", cmpTurnover=" + cmpTurnover
				+ "]";
	}

}
