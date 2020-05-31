package com.techlab.crudable;

public class CustomerDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("Creating inside CustomerDb");
	}

	@Override
	public void read() {
		System.out.println("Reading inside CustomerDb");		
	}

	@Override
	public void update() {
		System.out.println("Updateing inside CustomerDb");		
	}

	@Override
	public void delete() {
		System.out.println("Deleteing inside CustomerDb");		
	}

	

}
