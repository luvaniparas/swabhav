package com.techlab.shopping;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SerializationCustomer implements Serializable {

	static File CustomerInfo = new File(
			"C:\\swabhav\\OOAD\\Assignment\\Shopping-Cart-Apps\\src\\com\\techlab\\textFiles\\CustomerInfo.txt");

	public static void writeData(ArrayList<Customer> c) throws IOException {

		FileOutputStream fileOut = new FileOutputStream(CustomerInfo);
		ObjectOutputStream out = new ObjectOutputStream(fileOut);

		out.writeObject(c);

		out.close();
		fileOut.close();
	}

	public static void readData(ArrayList<Customer> c) throws IOException, ClassNotFoundException {

		FileInputStream fout = new FileInputStream(CustomerInfo);
		ObjectInputStream in = new ObjectInputStream(fout);

		c = (ArrayList<Customer>) in.readObject();
		System.out.println(c);

		in.close();

	}
}
