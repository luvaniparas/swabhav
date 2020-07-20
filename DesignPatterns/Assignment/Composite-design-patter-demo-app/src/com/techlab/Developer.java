package com.techlab;

public class Developer implements IEmployee {

	private String name, position;
	private int id;

	public Developer(String name, String position, int id) {
		this.name = name;
		this.position = position;
		this.id = id;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(name + " " + id+" "+position);
	}

}
