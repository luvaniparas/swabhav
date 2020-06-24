package Solution.com.test;

import Solution.com.Employee;
import Solution.com.EmployeeOperations;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "John", 30);
		EmployeeOperations ep = new EmployeeOperations();
		ep.calculateSalary(e1);
		ep.employeeBonus(e1);
		System.out.println(e1);
	}
}
