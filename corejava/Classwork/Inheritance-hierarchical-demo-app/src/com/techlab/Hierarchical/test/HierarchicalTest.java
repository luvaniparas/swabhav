package com.techlab.Hierarchical.test;

import com.techlab.Hierarchical.Boy;
import com.techlab.Hierarchical.Infant;
import com.techlab.Hierarchical.Kid;
import com.techlab.Hierarchical.Man;

public class HierarchicalTest {

	public static void main(String[] args) {
		Man mobj = new Man();
		mobj.plays();
		mobj.reads();
		
		Boy bobj = new Boy();
		bobj.plays();
		bobj.eat();
		bobj.reads();
		
		case1();
		case2();
		case3();
		case4();
		case5();
	}

	public static void case1() {
		System.out.println("Case-1");
		Man x;
		x = new Man();
		x.plays();
		x.reads();
	}
	
	public static void case2() {
		System.out.println("Case-2");
		Boy y;
		y = new Boy();
		y.plays();
		y.eat();
		y.reads();
	}

	public static void case3() {
		System.out.println("Case-3");
		Man x;
		x = new Boy();
		x.plays();
		x.reads();
	}
	
	public static void atThePark(Man b) {
		System.out.print("At the park ");
		b.plays();
	}
      public static void case4() {
    	System.out.println("Case-4");
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}
      
      public static void  case5() {
    	//System.out.println("Case-5");
  		Object x;
  		x = 10;
  		
  		x = "Hello";
  		
  		x = new Man();
  		//will it work or give error ..if works fine try to find why its workinng fine with everything
  	}
}
