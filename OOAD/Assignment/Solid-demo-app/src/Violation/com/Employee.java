package Violation.com;

public class Employee {

	private int eId, eSalary, presentDays, eBonus;
	private String eName;

	public static int DAILYWAGE = 1000;

	public Employee(int eId, String eName, int presentDays) {
		this.eId = eId;
		this.eName = eName;
		this.presentDays = presentDays;
	}

	public int geteId() {
		return eId;
	}

	public int geteSalary() {
		return eSalary;
	}

	public String geteName() {
		return eName;
	}

	public int getPresentDays() {
		return presentDays;
	}

	// Violates Single responsibility Principles
	// 2 responsibility
	// 1 - Calculate Salary
	// 2 - Employee Bonus

	public void calculateSalary() {
		eSalary = DAILYWAGE * presentDays;
	}

	public void employeeBonus() {
		eBonus = (int) (eSalary + (0.1 * eSalary));
	}
	
	//Violates Open-Closed principle
	
	public void employeePayment() {
		
	}
	
	@Override
	public String toString() {
		return "Employee [EmployeeID = " + eId + ", EmployeeName=" + eName + ", EmployeeSalary=" + eSalary
				+ ", EmployeeBonus" + eBonus + "]";
	}

}
