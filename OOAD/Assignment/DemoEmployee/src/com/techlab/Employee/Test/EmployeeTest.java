package com.techlab.Employee.Test;

import java.io.File;

import com.techlab.Employee.ILoader;
import com.techlab.Employee.Parser;
import com.techlab.Employee.TextReader;

public class EmployeeTest {

	public static void main(String[] args) {

		ILoader txtLoader = new TextReader();
		File f = txtLoader.loadData("C:\\swabhav\\OOAD\\Assignment\\Employee\\src\\Resource\\EmployeeData.txt");
		txtLoader.loadData();

		Parser p = new Parser();
		p.parseData(f);

	}

}
