package com.techlab.engineeringCollege;

import java.text.ParseException;

public class Student extends Person {
	
	private String branch;
	
	public Student(String id, String address, String dateOfBirth,String branch) throws ParseException {
		super(id, address, dateOfBirth);
		this.branch =branch ;
	}
	
	public String getBranch() {
		return branch ;
	}
	
}
