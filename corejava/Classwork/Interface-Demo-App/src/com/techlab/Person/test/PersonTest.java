package com.techlab.Person.test;

import com.techlab.Person.PersonInterface;

public class PersonTest implements PersonInterface {

	public static void main(String args[]) {
		PersonTest obj = new PersonTest() ;
		obj.printName();
	}

	@Override
	public void printName() {
		System.out.println(""+name);
	}
}
