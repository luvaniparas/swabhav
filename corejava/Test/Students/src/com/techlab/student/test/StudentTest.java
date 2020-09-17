package com.techlab.student.test;

import java.util.LinkedList;

public class StudentTest {

	private int rollNumber;
	private String name;
	
	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentTest(String name, int rollNumber) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	public static void addStudent(LinkedList<StudentTest> sList, StudentTest s) {
		sList.add(s);
	}
	
	public static void removeStudent(LinkedList<StudentTest> sList, int index) {
		sList.remove(index);
	}

	public static void updateStudent(LinkedList<StudentTest> sList, StudentTest s,String name,int rollNumber) {
		s.setName(name);
		s.setRollNumber(rollNumber);
	}
	
	@Override
	public String toString() {
		return "StudentTest [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	
}
