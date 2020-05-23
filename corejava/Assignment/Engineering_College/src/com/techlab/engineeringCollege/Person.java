package com.techlab.engineeringCollege;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private String address,id;
	private Date dateOfBirth;

	public Person(String id, String address, String dateOfBirth) throws ParseException {
		this.id = id;
		this.address = address;
		this.dateOfBirth = setDate(dateOfBirth);
	}

	public String getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	private Date setDate(String dob) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(dob);
		return d;

	}
}
