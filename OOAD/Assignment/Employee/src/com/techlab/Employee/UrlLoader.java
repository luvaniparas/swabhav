package com.techlab.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlLoader implements ILoader {

	@Override
	public File loadFile(String str) throws IOException {

		URL url = new URL(str);
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

		String inputLine;
		File csvFile = new File("src/resource/webEmployeeData.txt");
		FileWriter file = new FileWriter(csvFile);
		while ((inputLine = in.readLine()) != null) {
			file.write(inputLine + "\n");
		}
		file.close();
		in.close();

		return csvFile;

	}

}
