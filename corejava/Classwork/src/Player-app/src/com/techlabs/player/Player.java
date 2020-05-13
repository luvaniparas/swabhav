package com.techlabs.player;

public class Player {
	private int id;
	private String name;
	private int age;
	private int score;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Player(int id, String name, int age,int score) {
		this(id,name,age);
		this.score = score;
	}
	
	public int getScore() {
		return score;
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

	
	/*
	 * public Player(int newId,String newName,int newAge){ id = newId; name =
	 * newName ; age = newAge ; }
	 */
}
