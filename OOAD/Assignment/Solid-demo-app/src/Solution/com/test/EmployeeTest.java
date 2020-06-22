package Solution.com.test;

import Solution.com.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "John", 30);
		e1.calculateSalary();
		System.out.println(e1);
	}
}
