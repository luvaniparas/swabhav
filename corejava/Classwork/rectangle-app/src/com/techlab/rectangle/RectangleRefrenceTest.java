package com.techlab.rectangle;

public class RectangleRefrenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(); //7708
		
		Rectangle r2; // stack

		r2=r1;// r2=7708 //r1 and r2 are pointing to same memory location


		r2.setBreadth(r2.getBreadth()+1); // 11
		r2.setLength(r2.getLength()+1);  //  11

		System.out.println("Inside main :");
		System.out.println("value of r1 :"+r1.hashCode());
		System.out.println("value of r2 :"+r2.hashCode());
		
		//r,r1,r2-->hashcode()
		printInfo(r1);//comment 
		printInfo(r2);//check hashcode and also check output 

		}
		static void printInfo(Rectangle r)
		{
		System.out.println(r.getBreadth());//???
		System.out.println(r.getLength());
		System.out.println(r.getColor());
		System.out.println("Inside PrintInfo :");
		System.out.println("value of r1 :"+r.hashCode());
		System.out.println("value of r2 :"+r.hashCode());
	
	}

}
