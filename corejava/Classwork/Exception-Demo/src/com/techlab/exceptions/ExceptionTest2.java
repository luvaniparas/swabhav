package com.techlab.exceptions;

public class ExceptionTest2 {

	public static void main(String[] args) {
		try {
			m1();
			System.out.println("End of program");
		}
		catch(Exception e ){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	static void m1() throws Exception {
		System.out.println("In M1");
		m2();
	}

	static void m2() throws Exception {
		System.out.println("In M2");
		m3();
	}

	static void m3() throws Exception {
		System.out.println("In M3");
		throw new Exception("Exceptions Occured");
	}

}
