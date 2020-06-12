package com.techlab.College;

import java.util.ArrayList;

public class College {

	private int clgId;
	private String clgName;
	static ArrayList<Department> dList;

	public College(int clgId, String clgName) {
		this.clgId = clgId;
		this.clgName = clgName;
	}

	public College(ArrayList<Department> dList) {
		this.dList = dList;
	}

	public int getClgId() {
		return clgId;
	}

	public String getClgName() {
		return clgName;
	}

	@Override
	public String toString() {
		return "College [clgId=" + clgId + ", clgName=" + clgName + "]";
	}
	
	public static void printDepartmentData() {
		for (Object o : dList) {
			System.out.println(o);
		}
	}
	
	
}
