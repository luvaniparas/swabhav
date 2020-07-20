package com.techlab;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirector {

	private List<IEmployee> empList = new ArrayList<IEmployee>();

	public void showEmpDetails() {
		for (IEmployee e : empList) {
			e.showEmployeeDetails();
		}
	}

	public void addEmployee(IEmployee e) {
		empList.add(e);
	}

	public void removeEmployee(IEmployee e) {
		empList.remove(e);
	}

}
