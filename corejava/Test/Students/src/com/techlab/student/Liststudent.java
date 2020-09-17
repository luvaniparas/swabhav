package com.techlab.student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import com.techlab.student.test.StudentTest;

public class Liststudent {
		
	static LinkedList<StudentTest> sList;
	static Scanner sc ;
	
	public static void main(String[] args) {		
		sc = new Scanner(System.in);
		
		sList = new LinkedList<StudentTest>();
		
		//add
		StudentTest s1 = getStudentInfo();
		StudentTest.addStudent(sList,s1);
		
		//Updated
		StudentTest.updateStudent(sList, s1, "Paras Luvani", 01);
		
		//remove
		StudentTest.removeStudent(sList, 0);
		
		//read
		display();
	}
	
	public static StudentTest getStudentInfo() {
		System.out.print("Enter name : ");
		String name = sc.next();
		
		System.out.print("Enter roll Number : ");
		int rollNumber = sc.nextInt();
		
		return new StudentTest(name,rollNumber);	
	}
	
	public static void display() {
		
		Iterator<StudentTest> itr = sList.iterator();
		System.out.println("Reading List => ");

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
		
}
