package com.techlab.student;

public class Student {

	private int id;
	private String name;
	private float cgpa;
	private branchName assign;

	public enum branchName {
		CS, IT, EXTC
	}

	public Student(int id, String name, float cgpa, branchName value) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		assign = value;
	}

	public int id() {
		return id;
	}

	public String name() {
		return name;
	}

	public float cgpa() {
		return cgpa;
	}
	
	public branchName getbranchName() {
	        return assign;
	    } 
	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (id == s.id && name == s.name) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() 
    { 
        return id + " " + name + " " + cgpa + " "; 
    }
}




