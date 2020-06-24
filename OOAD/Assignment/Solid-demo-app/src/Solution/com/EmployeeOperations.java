package Solution.com;

public class EmployeeOperations {

	public void calculateSalary(Employee e) {
		e.seteSalary(Employee.DAILYWAGE * e.getPresentDays());
	}

	public void employeeBonus(Employee e) {
		e.seteBonus((int) (e.geteSalary() + (0.1 * e.geteSalary())));
	}
}
