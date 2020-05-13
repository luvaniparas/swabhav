package com.techlabs.person;

public class Person {

	private String name;
	private int age;
	private String gender;
	private float height;
	private float weight;
	private double bmi;

	public Person(String name, int age, String gender, float height, float weight,double bmi) {
		if (name.isEmpty()) {
			this.name = "UnSpecified";
		} else {
			this.name = name;
		}

		if (age < 0) {
			this.age = Math.abs(age);
		} else {
			this.age = age;
		}
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi ;
		
	}

	public Person(String name, String gender, float height, float weight,double bmi) {
		this(name,0,gender,height,weight,bmi);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}
	
	public double getBmi() {
		return bmi;
	}
	
	public void doWorkOut() {
		weight = (float) (weight -(weight*0.2));
	}
	public void doEat() {
		weight = (float) (weight -(weight*0.05));
	}
}
