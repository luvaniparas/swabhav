package com.techlab.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLoader implements ILoader {

	@Override
	public File loadFile(String str) {
		File csvFile = new File(str);

		return csvFile;

	}

}
