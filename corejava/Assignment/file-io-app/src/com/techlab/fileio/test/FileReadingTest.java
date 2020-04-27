package com.techlab.fileio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReadingTest {

	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReadingTest cobj = new FileReadingTest();
		File fobj = new File(
				"C:\\swabhav\\corejava\\Assignment\\file-io-app\\src\\com\\techlab\\fileio\\test\\logTest_app.csv");
		// FileWriter myWriter = new
		// FileWriter("C:\\swabhav\\corejava\\Assignment\\file-io-app\\src\\com\\techlab\\fileio\\test\\logTest_app.csv");
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
		String str = "null" ;
		Boolean blr = true ;
		String replaceString ;
		
		while (sc.hasNext()) {
			/*if (sc.nextLine().length() != 1) {
				System.out.println(sc.next());
			}*/
			String line = sc.nextLine();
			 if(line.contains(str) == blr ) {
				replaceString=line.replace(str,"Unspecified");  
				System.out.println(replaceString); 
			}
			 else
			 {
				 System.out.println(line);	 
			 }
		}
		sc.close();
	}
}
