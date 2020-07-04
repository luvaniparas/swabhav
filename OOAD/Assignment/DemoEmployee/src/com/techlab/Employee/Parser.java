package com.techlab.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Parser {

	HashSet<String> employeesData;

	public Parser() {
		employeesData = new HashSet<String>();
	}

	public HashSet<String> parseData(File f) throws FileNotFoundException {

		Scanner sc = new Scanner(f);
		while (sc.hasNext()) {
			employeesData.add(sc.next());
		}

		sc.close();
		return employeesData;
	}

}
