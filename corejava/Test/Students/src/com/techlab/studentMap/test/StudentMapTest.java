package com.techlab.studentMap.test;

import java.util.HashMap;

public class StudentMapTest {
	
	private int rollNumber;
	private String name;
	
	public StudentMapTest(String name ,int rollNumber) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//add
	public static void addStudent(HashMap<Integer, String> studentMap, int rollNumber , String name) {
		studentMap.put(rollNumber,name);
	}
	
	//remove
	public static void removeStudent(HashMap<Integer, String> studentMap, int rollNumber) {
		studentMap.remove(rollNumber);
	}
	
	//update
	public static void updateStudent(HashMap<Integer, String> studentMap, int rollNumber,String name) {
		studentMap.replace(rollNumber,name);
	}
	
	@Override
	public String toString() {
		return "StudentMapTest [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	
	
	
	
}
