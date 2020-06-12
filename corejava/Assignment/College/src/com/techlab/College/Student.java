package com.techlab.College;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Student {

	private int sId;
	private String sName, address,department;
	private Date dob;

	public Student(int sId, String sName, String address, String dob,String department) throws ParseException {
		this.sId = sId;
		this.sName = sName;
		this.address = address;
		this.dob = setDate(dob);
		this.department = department ;
	}

	public int getsId() {
		return sId;
	}

	public String getsName() {
		return sName;
	}

	public String getDepartment() {
		return department;
	}
	
	public static Date setDate(String dob) throws ParseException {
		SimpleDateFormat sDate = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sDate.parse(dob);
		return d;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", address=" + address + ", department=" + department
				+ ", dob=" + dob + "]";
	}




}
