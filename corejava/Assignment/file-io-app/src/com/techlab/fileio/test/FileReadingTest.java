package com.techlab.fileio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingTest {

	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReadingTest cobj = new FileReadingTest();
		File fobj = new File(
				"C:\\swabhav\\corejava\\Assignment\\file-io-app\\src\\com\\techlab\\fileio\\test\\logTest_app.csv");
		try {
			sc = new Scanner(fobj);
			cobj.printLog(fobj);
		} catch (FileNotFoundException e) {
			System.out.println("Can not Open file");
			e.printStackTrace();
		}
	}
	
	public void printLog(File fobj) {
		try {
			sc = new Scanner(fobj);
		} catch (Exception e) {
			System.out.println("Can not Open file");
			e.printStackTrace();
		}
		//String line = "";
		
		sc.useDelimiter(",");    
		while (sc.hasNext())   
		{  
		System.out.print(sc.next());  
		}   
		sc.close();
}
}

