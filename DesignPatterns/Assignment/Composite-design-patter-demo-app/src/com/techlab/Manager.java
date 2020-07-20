package com.techlab;

public class Manager implements IEmployee {

	private String name, position;
	private int id;

	public Manager(String name, String position, int id) {
		this.name = name;
		this.position = position;
		this.id = id;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(name + " " + id + " " + position);
	}

}
