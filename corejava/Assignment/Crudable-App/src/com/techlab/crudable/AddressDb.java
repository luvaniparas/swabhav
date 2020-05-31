package com.techlab.crudable;

public class AddressDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("Creating inside AddressDb");
	}

	@Override
	public void read() {
		System.out.println("Reading inside AddressDb");
	}

	@Override
	public void update() {
		System.out.println("Updating inside AddressDb");
	}

	@Override
	public void delete() {
		System.out.println("Deleting inside AddressDb");
	}

}
