package com.techlab;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorable {

	private String name;
	private List<IStorable> children = new ArrayList<IStorable>();

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
	public void display(StringBuilder dashes) {
		
		System.out.println(dashes + " " + getName());

		dashes.insert(0, " ");
		for (IStorable s : children) {
			System.out.print(" ");
			s.display(dashes);
		}
		dashes.setLength(0);
		dashes.append("--");
	}

}
