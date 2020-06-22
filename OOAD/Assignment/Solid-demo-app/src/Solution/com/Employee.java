package Solution.com;

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

	public int geteBonus() {
		return eBonus;
	}

	public void seteBonus(int eBonus) {
		this.eBonus = eBonus;
	}

	public int getPresentDays() {
		return presentDays;
	}

	public void calculateSalary() {
		eSalary = DAILYWAGE * presentDays;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeID = " + eId + ", EmployeeName=" + eName + ", EmployeeSalary=" + eSalary
				+ ", EmployeeBonus" + eBonus + "]";
	}

}

class EmployeeBonus {
	public void employeeBonus(Employee e) {
		e.seteBonus((int) (e.geteSalary() + (0.1 * e.geteSalary())));
	}
}