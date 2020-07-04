package com.techlab.Employee;

import java.util.HashSet;

public class Analyzer {

	final int SALARY_INDEX = 5;
	final int COMISSION_INDEX = 6;
	final int DEPT_INDEX = 7;
	final int DESIGNATION_INDEX = 2;

	public String calculateMaximumSalariedPerson(HashSet<String> empData) {

		int salary = 0;

		String maxSalariedPerson = "";
		String[] employee = null;
		int maximumSalary = 0;

		for (String e : empData) {
			employee = e.split(",", e.length());
			salary = Integer.parseInt(employee[SALARY_INDEX]);
			if (employee[COMISSION_INDEX].equals("NULL")) {
			} else {
				salary += Integer.parseInt(employee[COMISSION_INDEX]);
			}

			if (maximumSalary < salary) {
				maximumSalary = salary;
				maxSalariedPerson = e;
			}
		}

		return maxSalariedPerson;
	}

	public HashSet<String> countEmployee(HashSet<String> empData, int deptNumber) {

		HashSet<String> departmentData = new HashSet<String>();
		String[] employee = null;

		for (String e : empData) {
			employee = e.split(",", e.length());

			if (deptNumber == Integer.parseInt(employee[DEPT_INDEX])) {
				departmentData.add(e);
			}
		}

		return departmentData;
	}

	public HashSet<String> countEmployee(HashSet<String> empData, String designation) {

		HashSet<String> departmentData = new HashSet<String>();
		String[] employee = null;

		for (String e : empData) {
			employee = e.split(",", e.length());
			if (designation.equalsIgnoreCase(employee[DESIGNATION_INDEX].replace("'", ""))) {
				departmentData.add(e);
			}
		}

		return departmentData;
	}

}
