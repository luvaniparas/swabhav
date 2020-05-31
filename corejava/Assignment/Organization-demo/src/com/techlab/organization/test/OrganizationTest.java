package com.techlab.organization.test;

import java.lang.reflect.*;

import com.techlab.organization.Analayst;
import com.techlab.organization.Developer;
import com.techlab.organization.Employee;
import com.techlab.organization.Manager;

public class OrganizationTest {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		double salary;
		Employee dObj = new Developer(101, "Developer", 10000f);
		Employee aObj = new Analayst(102, "Analayst", 10000f);
		Employee mObj = new Manager(103, "Manager", 10000f);

		System.out.println("-------Developer------");
		printInfo(dObj);
		salary = dObj.calculateSalary();
		getPrivateField(dObj);
		System.out.println("Gross Salary : " + salary);

		System.out.println("-------Analayst------");
		printInfo(aObj);
		salary = aObj.calculateSalary();
		getPrivateField(aObj);
		System.out.println("Gross Salary : " + salary);

		System.out.println("-------Manager------");
		printInfo(mObj);
		salary = mObj.calculateSalary();
		getPrivateField(mObj);
		System.out.println("Gross Salary : " + salary);

	}

	public static void printInfo(Employee obj) {
		System.out.println("Id : " + obj.getId());
		System.out.println("Name : " + obj.getName());
		System.out.println("BasicSalary : " + obj.getBasicPay());
	}

	public static void getPrivateField(Employee obj) throws IllegalArgumentException, IllegalAccessException {
		Field fields[] = obj.getClass().getDeclaredFields();

		for (Field f : fields) {
			f.setAccessible(true);
			System.out.println(f.getName() + " : "+f.getDouble(obj));
		}
	}
}
