package com.techlab.MyContact;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlab.MyContatct.test.ContactTest;

public class MyContactManager {
	static int i = 0;
	static ContactTest ctObj = new ContactTest();

	// case1
	public static void addContact(MyContact[] contactArray) throws IOException {
		while (i < contactArray.length) {
			contactArray[i] = ctObj.getContactInfo();
			i++;
		}
		SerializingContacts(contactArray);
	}

	// case3
	public static int searchContact(MyContact[] contactArray, String lName) {
		int index = -1;
		for (int i = 0; i < contactArray.length; i++) {
			if (contactArray[i].getlName().equals(lName)) {
				index = i;
			}
		}
		return index;
	}

	public static void modifyContact(MyContact[] contactArray, String lName) throws IOException {
		int index = searchContact(contactArray, lName);
		contactArray[index] = ctObj.getContactInfo() ;
		SerializingContacts(contactArray);
	}
	
	//case4
	public static int deleteContact(MyContact[] contactArray, String lName) throws IOException {
		int index = searchContact(contactArray, lName);
		contactArray[index] = null;
		SerializingContacts(contactArray);
		return index;
	}

	// case5
	public static void displayContact(MyContact[] contactArray) throws ClassNotFoundException, IOException {
		deSerializingContacts(contactArray);
	}

	public static void SerializingContacts(MyContact contactArray[]) throws IOException {

		File f = new File("MyContact.txt");
		FileOutputStream fout = new FileOutputStream(f);
		ObjectOutputStream out = new ObjectOutputStream(fout);

		for (MyContact temp : contactArray) {
			out.writeObject(temp);
		}

		out.flush();
		out.close();

	}

	public static void deSerializingContacts(MyContact contactArray[]) throws IOException, ClassNotFoundException {

		File f = new File("MyContact.txt");
		FileInputStream fout = new FileInputStream(f);
		ObjectInputStream in = new ObjectInputStream(fout);

		for (int i = 0; i < contactArray.length; i++) {
			contactArray[i] = (MyContact) in.readObject();
			System.out.println(contactArray[i]);
		}
		in.close();

	}
}
