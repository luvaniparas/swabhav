package com.techlab.test;

import com.techlab.CompanyDirector;
import com.techlab.Developer;
import com.techlab.Manager;

public class Client {

	public static void main(String[] args) {

		CompanyDirector cd = new CompanyDirector();

		Developer d1 = new Developer("D1", "Developer", 101);
		Developer d2 = new Developer("D2", "Developer", 102);

		cd.addEmployee(d1);
		cd.addEmployee(d2);

		Manager m1 = new Manager("M1", "Manager", 101);
		Manager m2 = new Manager("M2", "Manager", 102);
		
		cd.addEmployee(m1);
		cd.addEmployee(m2);
		
		cd.showEmpDetails();
	}

}
