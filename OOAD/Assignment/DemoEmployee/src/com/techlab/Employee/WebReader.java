package com.techlab.Employee;

import java.io.File;

public class WebReader implements ILoader {

	@Override
	public File loadData() {
		
		File webReader = new File("WebEmployeeData");
		return webReader ;
	}

}
