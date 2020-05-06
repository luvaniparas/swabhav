package com.techlabs;

public class AnonymousObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Addition is :" + new AnonymousObjectTest().addition());
	}

	public int addition() {
		int a = 10, b = 20, c;
		c = a + b;
		return c;
	}
}
