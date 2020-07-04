package com.techlab.Employee.Test;

import java.io.File;
import java.util.HashSet;

import com.techlab.Employee.Analyzer;
import com.techlab.Employee.FileLoader;
import com.techlab.Employee.ILoader;
import com.techlab.Employee.Parser;
import com.techlab.Employee.UrlLoader;

/* Employee id, Employee name, Employee designation, Manager id, Date of joining, Salary, Commission and Department number.*/

public class EmployeeTest {

	public static void main(String[] args) throws Exception {

//		ILoader load = new FileLoader();
//		File txtfile = load.loadFile("C:\\swabhav\\OOAD\\Assignment\\Employee\\src\\Resource\\EmployeeData.txt");

		ILoader web = new UrlLoader();
		File urlFile = web.loadFile("https://swabhav-tech.firebaseapp.com/emp.txt");

		Parser p = new Parser();
//		HashSet<String> empData = p.parseFile(txtfile);
		HashSet<String> empData = p.parseFile(urlFile);

		Analyzer a = new Analyzer();
		String maxSalariedPerson = a.calculateMaximumSalariedPerson(empData);
		System.out.println("Highest salary employee => \n" + maxSalariedPerson);

		HashSet<String> deptNoData = a.countEmployee(empData, 30);
		if (!deptNoData.isEmpty()) {
			System.out.println("\nDEPARTMENT => \n");
			for (String s : deptNoData) {
				System.out.println(s);
			}
		} else {
			System.out.println("Employees Not Found!");
		}

		HashSet<String> designationData = a.countEmployee(empData, "MANAGER");
		if (!designationData.isEmpty()) {
			System.out.println("\nDESIGNATION => \n");
			for (String s : designationData) {
				System.out.println(s);
			}
		} else {
			System.out.println("Employees Not Found!");
		}

	}

}
