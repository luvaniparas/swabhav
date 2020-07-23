package com.techlab;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorable {

	private String name;
	private List<IStorable> children = new ArrayList<IStorable>();;
	String dashes = "--";

	public Folder(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addChildren(IStorable iStorable) {
		children.add(iStorable);
	}

	@Override
	public void display() {

		System.out.println(dashes + " " + getName());

		for (IStorable s : children) {
			System.out.println();
			System.out.print("    ");
			s.display();
		}
	}

}
