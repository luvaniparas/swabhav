package com.techlab.fileio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LogFileTest {
	static boolean isfound = true;
	static Scanner sc;
	static String estr = "ERROR", istr = "INFO", wstr = "WARNING";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LogFileTest cobj = new LogFileTest();
		File fobj = new File(
				"C:\\swabhav\\corejava\\Assignment\\file-io-app\\src\\com\\techlab\\fileio\\test\\db_app.log");
		try {
			sc = new Scanner(fobj);

			if (args.length == 0) {
				cobj.printAll(fobj);
			} else if (args[0].equals("-e")) {
				cobj.printFlag(estr, fobj);
			} else if (args[0].equals("-i")) {
				cobj.printFlag(istr, fobj);
			} else if (args[0].equals("-w")) {
				cobj.printFlag(wstr, fobj);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can not Open file");
			e.printStackTrace();
		}

	}

	public void printFlag(String str, File fobj) {
		try {
			sc = new Scanner(fobj);
		} catch (Exception e) {
			System.out.println("Can not Open file");
			e.printStackTrace();
		}
		System.out.println(str);
		while (sc.hasNext()) {
			if (isfound == sc.next().contains(str)) {
				System.out.println(sc.nextLine());
			} else
				continue;
		}
	}

	public void printAll(File fobj) {
		try {
			sc = new Scanner(fobj);
		} catch (Exception e) {
			System.out.println("Can not Open file");
			e.printStackTrace();
		}
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
}
