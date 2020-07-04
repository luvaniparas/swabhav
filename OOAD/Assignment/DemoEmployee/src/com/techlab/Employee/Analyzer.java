package com.techlab.Employee;

import java.util.HashSet;

/* Employee id, Employee name, Employee designation, Manager id, Date of joining, Salary, Commission and Department number.*/

public class Analyzer {
	final int SALARY_INDEX = 5;

	public String HighestSalaryEmployee(HashSet<String> employeesData) {

		String maxSalaryPerson = "";
		String[] emp;
		int salary, maxSalary = 0;

		for (String s : employeesData) {

			emp = s.split(",", s.length());
			salary = Integer.parseInt(emp[SALARY_INDEX]);
			if (maxSalary < salary) {
				maxSalary = salary;
				maxSalaryPerson = s;
			}

		}

		return maxSalaryPerson;

	}

}
