package com.techlabs.boxing.test;

public class BoxingDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		implicitTypecast();
		explicitTypecast();
		boxingAutoboxing();
		unboxingAutounboxing();
	}

	public static void implicitTypecast() {
		System.out.println("Implicit :");
		int x =10 ;
		double d=x;
		System.out.println("Integer : "+x);
		System.out.println("Double : "+d);
	}
	
	public static void explicitTypecast() {
		System.out.println("\nExplicit :");
		double d=100;
		int z =(int) d ;
		System.out.println("Double : "+d);
		System.out.println("Integer : "+z);
	}
	
	public static void boxingAutoboxing() {
		System.out.println("\nAutoBoxing :");
		int a=5 ;
		Integer b = new Integer(5);
		System.out.println("Boxing : "+b);
		Integer c= 5;
		System.out.println("Auto Boxing : "+b);
	}
	
	public static void unboxingAutounboxing() {
		System.out.println("\nAutoUnBoxing :");
		Integer b = new Integer(5);
		int d =b.intValue();
		System.out.println("UnBoxing : "+b);
		Integer c= 5;
		System.out.println("Auto UnBoxing : "+d);
	}
}
