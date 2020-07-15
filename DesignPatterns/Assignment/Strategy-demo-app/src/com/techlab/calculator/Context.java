package com.techlab.calculator;

public class Context {

	private IStrategy s;

	public Context(IStrategy s) {
		this.s = s;
	}

	public int perform(int num1, int num2) {
		return s.doOperation(num1, num2);
	}

}
