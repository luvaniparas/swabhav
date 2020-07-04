package com.techlab.Employee;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public interface ILoader {

	public File loadFile(String str) throws MalformedURLException, IOException;

}
