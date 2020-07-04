package com.techlab.Employee;

import java.io.File;

public class TextReader implements ILoader {

	@Override
	public File loadData() {

		File txtReader = new File("TextEmployeeData");
		return txtReader;
	}

}
