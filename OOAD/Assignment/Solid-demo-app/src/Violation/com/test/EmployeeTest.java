package Violation.com.test;

import Violation.com.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "John", 30);
		e1.calculateSalary();
		e1.employeeBonus();
		System.out.println(e1);
	}

}
