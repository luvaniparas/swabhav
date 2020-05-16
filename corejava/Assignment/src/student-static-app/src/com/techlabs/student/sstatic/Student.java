package com.techlabs.student.sstatic;

public class Student {
	public int demo =10 ;
	private int id;
	private String name;
	private float cgpa;
	private static int countOfInstances;

	static {
		int countOfInstances = 0;
		System.out.println("We are in static block");
	}

	public Student(int id, String name, float cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		countOfInstances++;
		System.out.println("We are in constructor");
	}

	public int getCount() {
		return countOfInstances;
	}

	public static int headCount() {
		return countOfInstances;
	}

}
