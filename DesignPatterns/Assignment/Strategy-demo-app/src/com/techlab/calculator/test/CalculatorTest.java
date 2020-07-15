package com.techlab.calculator.test;

import com.techlab.calculator.Addition;
import com.techlab.calculator.Context;
import com.techlab.calculator.Multiplication;

public class CalculatorTest {

	public static void main(String[] args) {

		Context c = new Context(new Addition());
		System.out.println("Addition 10+20 = " + c.perform(10, 20));
		
		c= new Context(new Multiplication());
		System.out.println("Multiplication 10*20 = "+c.perform(10,20));

	}

}
