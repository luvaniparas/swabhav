package com.techlab.student.test;

import com.techlab.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Student1", 7.0f, Student.branchName.CS);
		Student s2 = new Student(102, "Student2", 8.0f, Student.branchName.IT);
		Student s3 = new Student(101, "Student1", 7.0f, Student.branchName.CS);

		if (s1.hashCode() == s3.hashCode()) {

			if (s1.equals(s3))
				System.out.println("Both Objects are equal. ");
			else
				System.out.println("Both Objects are not equal. ");

		} else
			System.out.println("Both Objects are not equal. ");
	
		System.out.println(s1.toString());
		
	}

}
