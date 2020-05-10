package com.techlabs.candidate;

public class Candidate {

	private int id, age;
	private String name, creditpoint;
	public boolean isElder = false, isBetter = false;
	
	public Candidate(int age,String Creditpoint,int id,String name){
		this.id=id;
		this.creditpoint=Creditpoint;
		this.age=age;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCreditpoint() {
		return creditpoint;
	}

	public void WhoIsElder(Candidate c) {
		if (c.age > this.age) {
			isElder = true;
		}
	}

	public void WhoIsBetter(Candidate c) {
		int res = creditpoint.compareToIgnoreCase(c.creditpoint);
		if (res < 0) {
			isBetter = true;
		}
	}
	/*
	 * public void setId(int id) { this.id = id; } public void setCreditpoint(String
	 * creditpoint) { this.creditpoint = creditpoint; } public void setAge(int age)
	 * { this.age = age; } public void setName(String name) { this.name = name; }
	 */
}