package com.techlabs.player.test;

public class PlayerTest {
	private final static int DEFAULT_AGE=25;
	private String name;
	private int age;
	private String gender;
	private float height;
	private float weight;
	private float bmi ;

	// Constructor
	public PlayerTest(String name, int age, String gender, float height, float weight) {
		if (name.isEmpty() == true) {
			this.name = "unspecified";
		} else {
			this.name = name;
		}
		
		if (age <0) {
			this.age = Math.abs(age);
		} else {
			this.age = age ;
		}
		
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	
	//Constructor Chainning
	public PlayerTest(String name, String gender, float height, float weight) {
		this(name,DEFAULT_AGE,gender, height, weight);	
	}
	
	// getters
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
	
	public float getBmi() {
		return bmi;
	}
	
	//Methods
	public void doWorkOut() {
		weight = weight-(weight*0.2f); 
	}
	public void doEat() {
		weight = weight+(weight*0.05f);
	}
	
	public void calculateBmi() {
		bmi = weight/(height*height) ;
	}
	
}
