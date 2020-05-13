package com.techlabs.player;

public class Player {
	private int id;
	private String name;
	private int age;

	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Player(int id, String name, int age) {
		this(id,name);
		if(age<0) {
			this.age = Math.abs(age);
		}
		else {
			this.age =age ;
		}
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
