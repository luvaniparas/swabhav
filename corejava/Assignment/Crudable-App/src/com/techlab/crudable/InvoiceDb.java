package com.techlab.crudable;

public class InvoiceDb implements ICrudable{

	@Override
	public void create() {
		System.out.println("Creating inside InvoiceDb");	
	}

	@Override
	public void read() {
		System.out.println("Reading inside InvoiceDb");	
	}

	@Override
	public void update() {
		System.out.println("Updateing inside InvoiceDb");	
	}

	@Override
	public void delete() {
		System.out.println("Deleteing inside InvoiceDb");		
	}

}
