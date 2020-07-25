package com.techlab;

public class File implements IStorable {

	private String name;
	private double size;
	private String extension;

	public File(String name, double size, String extension) {
		this.name = name;
		this.size = size;
		this.extension = extension;
	}

	public String getName() {
		return name;
	}

	public double getSize() {
		return size;
	}

	public String getExtension() {
		return extension;
	}

	@Override
	public void display(StringBuilder dashes) {
		dashes.delete(dashes.indexOf("-"), dashes.length());
		dashes.append("-");
		System.out.print("   " + dashes + " " + " " + name + " " + size + " " + extension);
		System.out.println();
	}

}
