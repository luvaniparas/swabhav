package com.techlabs.student.sstaic.test;

import com.techlabs.student.sstatic.Student;

public class StudentTest {

	public static void main(String[] args) {
		/*
		 * Static Block Executes only once in the program "countOfInstances" is static
		 * Incrementing after each call In case1 same obj calling getcount() method In
		 * C2 diff. obj is calling getCount()
		 * 
		 * Case1 Student s1 = new Student(22, "abc", 8.5f);
		 * System.out.println(s1.getCount());
		 * 
		 * Student s2 = new Student(22, "abc", 8.5f); System.out.println(s1.getCount());
		 * 
		 * Student s3 = new Student(22, "abc", 8.5f); System.out.println(s1.getCount());
		 */

		// case2
		/*
		 * 
		 * 
		 * Student s1 = new Student(22, "abc", 8.5f); System.out.println(s1.getCount());
		 * 
		 * Student s2 = new Student(22, "abc", 8.5f); System.out.println(s2.getCount());
		 * 
		 * Student s3 = new Student(22, "abc", 8.5f); System.out.println(s3.getCount());
		 */
		
		//case3
		/*
		 * SameOutput
		 */
		Student s1 = new Student(22,"sona",8.5f);

		Student s2 = new Student(22,"Saloni",9.23f);
		
		Student s3 = new Student(22,"Raju",6.25f);
		
		System.out.println("Head count = "+Student.headCount()); 
		/* class level access specifiers
		 * Student. 
		 * IV = can not access
		 * Methods = only static Members
		 * Static Variable & Methods = can access
		 */
	}

}
