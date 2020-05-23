package com.techlab.engineeringCollege.test;

import java.text.ParseException;

import com.techlab.engineeringCollege.Person;
import com.techlab.engineeringCollege.Professor;
import com.techlab.engineeringCollege.Student;

public class CollegeTest {

	public static void main(String[] args) throws ParseException {
	
		//Person p1 = new Person("101","a1,abc","2019-10-11");
		Student s1 = new Student("101","a1,abc","10/02/2010","CS");
		Professor pr1 =new Professor("102","a2,abc","11/03/2011",10);
		
		printStudentInfo(s1);
		printCommonInfo(s1);
		
		printProfessorInfo(pr1);
		printCommonInfo(pr1);
		
	}

	public static void printProfessorInfo(Professor p) {
		System.out.println("\nProfessor -> ");
		System.out.println("Salary : "+p.getSalary());
	}
	
	public static void printStudentInfo(Student s) {
		System.out.println("\nStudent -> ");
		System.out.println("Branch : "+s.getBranch());
	}
	
	public static void printCommonInfo(Person p) {
		System.out.println("ID : "+p.getId());
		System.out.println("Address : "+p.getAddress());
		System.out.println("Date : "+p.getDateOfBirth());
	}
	
}
