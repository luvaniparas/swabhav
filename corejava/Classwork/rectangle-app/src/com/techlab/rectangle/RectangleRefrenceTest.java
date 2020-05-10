package com.techlab.rectangle;

public class RectangleRefrenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(); //7708
		
		Rectangle r2; 

		r2=r1;

		r2.setBreadth(r2.getBreadth()+1); 
		r2.setLength(r2.getLength()+1); 

		System.out.println("Inside main :");
		System.out.println("value of r1 :"+r1.hashCode());
		System.out.println("value of r2 :"+r2.hashCode());
		
		
		printInfo(r1); 
		printInfo(r2); 

		}
		static void printInfo(Rectangle r)
		{
		System.out.println(r.getBreadth());
		System.out.println(r.getLength());
		System.out.println(r.getColor());
		System.out.println("Inside PrintInfo :");
		System.out.println("value of r1 :"+r.hashCode());
		System.out.println("value of r2 :"+r.hashCode());
	
	}

}
