package com.techlab.Hierarchical;

public class Boy extends Man {
	
	@Override
	public void plays() {
		System.out.println("Playing inside Boy");
	}
	
	public void eat() {
		System.out.println("Eating inside Boy");
	}
	
}
