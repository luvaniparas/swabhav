package com.techlabs.circleTest;

import com.techlabs.circle.Circle;

public class CircleReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(); 
		Circle c2; 
		c2=c1;

		c2.setRadius(c2.getRadius()+1); 
		c2.setColor(c2.getColor());  

		System.out.println("Inside main :");
		System.out.println("value of c1 :"+c1.hashCode());
		System.out.println("value of c2 :"+c2.hashCode());
		
		printInfo(c1); 
		printInfo(c2);

		}
		static void printInfo(Circle c)
		{
		System.out.println(c.getRadius());//???
		System.out.println(c.getColor());
		System.out.println(c.calculateArea());
		System.out.println(c.calculateParameter());
		System.out.println("Inside PrintInfo :");
		System.out.println("value of c1 :"+c.hashCode());
		System.out.println("value of c2 :"+c.hashCode());
	
	}
	}


