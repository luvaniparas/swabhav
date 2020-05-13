package com.techlabs.person.test;

import com.techlabs.person.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("abc", 25, "Male", 6.6f, 50.0f, 16);
		Person p2 = new Person("", -21, "FeMale", 5.6f, 40.0f, 26);

		p1.doWorkOut();
		p1.doEat();

		p2.doWorkOut();
		p2.doEat();

		printInfo(p1);
		printInfo(p2);

	}

	public static void printInfo(Person p) {
		System.out.println("\nName:" + p.getName());
		System.out.println("Age:" + p.getAge());
		System.out.println("Gender:" + p.getGender());
		System.out.println("Height:" + p.getHeight());
		System.out.println("Weight:" + p.getWeight());
	
		if (p.getBmi() < 18.5) {
			System.out.println("Under Weight:" + p.getBmi());
		} else if (p.getBmi() > 18.5 && p.getBmi() < 24.9) {
			System.out.println("Normal Weight" + p.getBmi());
		} else {
			System.out.println("Over Weight" + p.getBmi());
		}
	}
}
