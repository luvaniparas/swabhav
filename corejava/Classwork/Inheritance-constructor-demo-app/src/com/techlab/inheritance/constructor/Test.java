package com.techlab.inheritance.constructor;

public class Test {

	public static void main(String[] args) {
		Parent p = new Parent(100) ;
		System.out.println(p.getFoo());
		
		System.out.println(new Parent(110).getFoo());
		
		System.out.println(new Child().getFoo());

		System.out.println(new Child(50).getFoo());
	}

}
