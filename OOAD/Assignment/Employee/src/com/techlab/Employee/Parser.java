package com.techlab.Employee;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class Parser {

	HashSet<String> empData;

	public Parser() {
		empData = new HashSet<String>();
	}

	public HashSet<String> parseFile(File file) throws Exception {

		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			empData.add(scan.next());
		}

		scan.close();
		return empData;
	}

}
