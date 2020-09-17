package com.techlab.studentSet.test;

import java.util.HashSet;
import java.util.LinkedList;

import com.techlab.student.test.StudentTest;

public class studentSetTest {
	
	private int rollNumber;
	private String name;
	
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

	public studentSetTest( String name , int rollNumber) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public static void addStudent(HashSet<studentSetTest> studentSet, studentSetTest s) {
		studentSet.add(s);
	}
	
	public static void removeStudent(HashSet<studentSetTest> studentSet, studentSetTest s) {
		studentSet.remove(s);
	}
	
	public static void updateStudent(HashSet<studentSetTest> studentSet, studentSetTest s , studentSetTest s2) {
		studentSet.remove(s);
		studentSet.add(s2);
	}
	
	@Override
	public String toString() {
		return "studentSetTest [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	
}
