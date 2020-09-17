package com.techlab.studentSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.techlab.studentSet.test.studentSetTest;

public class StudentSet {

	static Scanner sc;
	static HashSet<studentSetTest> studentSet;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		studentSet = new HashSet();
		
		studentSetTest s2 = new studentSetTest("student2",20);
		
		//Create
		studentSetTest s1 = getStudentInfo();
		
		//Add
		studentSetTest.addStudent(studentSet, s1);
		
		//Remove
		studentSetTest.removeStudent(studentSet, s1);
		
		//update
		//studentSetTest.updateStudent(studentSet,s1,s2);
		
		//read
		readSet();
	}

	public static studentSetTest getStudentInfo() {
		System.out.print("Enter name : ");
		String name = sc.next();

		System.out.print("Enter roll Number : ");
		int rollNumber = sc.nextInt();

		return new studentSetTest(name, rollNumber);
	}
	
	public static void readSet() {
		Iterator<studentSetTest> itr = studentSet.iterator();
		System.out.println("Reading => ");

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
