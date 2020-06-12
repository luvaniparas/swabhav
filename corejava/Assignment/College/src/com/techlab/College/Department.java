package com.techlab.College;

import java.util.ArrayList;

public class Department {
	private int departmentId;
	private String departmentName;
	static ArrayList<Student> sList =  new ArrayList<Student>() ;

	public Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public Department(ArrayList<Student> sList) {
		this.sList = sList;
	}

	public Department() {

	}

	public int getDepartmentId() {
		return departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

	public void addStudents(Student s) {
	
		for(int i= 0 ; i < sList.size() ;i++ ) {
			if (sList.equals(s.getDepartment())) {
				sList.add(s);
			}	
		}
		
	}

	public static void printStudentData() {
		for (Object o : sList) {
			System.out.println(o);
		}
	}
}
