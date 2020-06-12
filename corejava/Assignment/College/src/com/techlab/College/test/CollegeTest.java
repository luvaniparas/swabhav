package com.techlab.College.test;

import java.text.ParseException;
import java.util.ArrayList;

import com.techlab.College.College;
import com.techlab.College.Department;
import com.techlab.College.Student;

public class CollegeTest {

	public static void main(String[] args) throws ParseException {

		College c = new College(101, "SAKEC");

		//Department List
		ArrayList<Department> dList = new ArrayList();
		Department d1 = new Department(1, "CS");
		Department d2 = new Department(2, "IT");
		Department d3 = new Department(3, "EXTC");
		Department d4 = new Department(4, "MECH");
		dList.add(d1);
		dList.add(d2);
		dList.add(d3);
		dList.add(d4);
		//College Has-a Department List
		new College(dList);

		//Student List
		ArrayList<Student> sList = new ArrayList();
		Student s1 = new Student(1, "student1", "101/galaxy", "31/03/1999","CS");
		Student s2 = new Student(2, "student2", "202/Ashok", "02/02/1998","CS");
		Student s3 = new Student(3, "student3", "303/galaxy", "31/05/1999","IT");
		Student s4 = new Student(4, "student4", "404/Ashok", "02/06/1998","EXTC");
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		Department d = new Department(sList);
		d.addStudents(s1);
		d.addStudents(s2);
		d.addStudents(s3);
		d.addStudents(s4);
		
		printInfo(c) ;
	}

	
	
	public static void printInfo(College c) {
		System.out.println("College Information -> ");
		System.out.println(c);

		System.out.println("Departments : ");
		College.printDepartmentData();

		System.out.println("StudentData : ");
		Department.printStudentData();

	}
}
