package com.techlab.Organization;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Organization {

	private int id;
	private String name;
	private Date registerationDate;

	public static ArrayList<Partner> pList;
	public static ArrayList<Talent> tList = new ArrayList<Talent>();

	public Organization(int id, String name, String registerationDate) throws ParseException {
		this.id = id;
		this.name = name;
		this.registerationDate = setRegisterationDate(registerationDate);
	}

	public Organization(ArrayList<Partner> pList) {
		this.pList = pList;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getRegisterationDate() {
		return registerationDate;
	}

	public void addTalent(Talent t) {
		tList.add(t);
	}

	public static Date setRegisterationDate(String registerationDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date d = sdf.parse(registerationDate);
		return d;

	}

	public static int getPartnerCount() {
		int count = pList.size();
		return count;
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", registerationDate=" + registerationDate + "]";
	}

}
