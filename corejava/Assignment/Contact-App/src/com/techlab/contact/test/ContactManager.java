package com.techlab.contact.test;

import java.io.*;
import java.util.Scanner;
import com.techlab.contact.Contact;

public class ContactManager extends Contact {

	public ContactManager(String fName, String lName, long phoneNo, String emailId) {
		super(fName, lName, phoneNo, emailId);
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Contact obj[] = new Contact[5];

		Contact obj1 = new Contact("user", "1", 1, "user1@gmail.com");
		Contact obj2 = new Contact("user", "2", 22, "user2@gmail.com");
		Contact obj3 = new Contact("user", "3", 333, "user3@gmail.com");
		Contact obj4 = new Contact("user", "4", 4444, "user4@gmail.com");

		obj[0] = obj1;
		obj[1] = obj2;
		obj[2] = obj3;
		obj[3] = obj4;

		for (int i = 0; i < 20; i++) {
			System.out.println(
					"\nEnter 1.AddContact\t\n2.ModifyContact\t\n3.SearchContact\t\n4.DeleteContact\t\n5.DisplayContact");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				addToContacts(obj);
				break;

			case 2:
				ModifyContactByName(obj);
				break;

			case 3:
				searchContactByName(obj);
				break;

			case 4:
				deleteContact(obj);
				break;

			case 5:
				displayContactList(obj);
				break;

			default:
				System.out.println("Enetr Valid choice");
			}
		}
	}

	public static void addToContacts(Contact obj[]) throws IOException {
		Contact contactObj = printInfo();
		System.out.println("Contact added successfully");

		for (int i = 4; i < obj.length; i++) {
			obj[i] = contactObj;
		}
		SerializingContacts(obj);
	}

	public static void ModifyContactByName(Contact obj[]) throws IOException, ClassNotFoundException {
		sc.nextLine();
		System.out.println("Eneter last name of contact to modify : ");
		String search = sc.nextLine();
		File f = new File("Contact.txt");
		FileInputStream fout = new FileInputStream(f);
		ObjectInputStream in = new ObjectInputStream(fout);

		for (int i = 0; i < obj.length; i++) {
			obj[i] = (Contact) in.readObject();
			String str1 = obj[i].getlName();

			if (str1.equals(search)) {
				Contact modified = printInfo();
				obj[4] = modified;
				SerializingContacts(obj);
			} 

		}
		in.close();

	}

	public static void searchContactByName(Contact obj[]) throws ClassNotFoundException, IOException {

		sc.nextLine();
		System.out.println("Enetr LastName to search");
		String search = sc.nextLine();

		File f = new File("Contact.txt");
		FileInputStream fout = new FileInputStream(f);
		ObjectInputStream in = new ObjectInputStream(fout);

		for (int i = 0; i < obj.length; i++) {
			obj[i] = (Contact) in.readObject();
			String str1 = obj[i].getlName();

			if (str1.equals(search)) {
				System.out.println(obj[i]);
				break;
			}

		}
		in.close();

	}

	public static void deleteContact(Contact obj[]) throws IOException, ClassNotFoundException {
		sc.nextLine();
		System.out.println("Enetr LastName to delete");
		String search = sc.nextLine();

		File f = new File("Contact.txt");
		FileInputStream fout = new FileInputStream(f);
		ObjectInputStream in = new ObjectInputStream(fout);

		for (int i = 0; i < obj.length; i++) {
			obj[i] = (Contact) in.readObject();
			String str1 = obj[i].getlName();

			if (str1.equals(search)) {
				System.out.println("Contact deleted : " + obj[i]);
				obj[i] = null;
			}
		}
		in.close();
		
		SerializingContacts(obj);
	}

	public static void displayContactList(Contact obj[]) throws ClassNotFoundException, IOException {
		System.out.println("\nDisplaying Contacts -> ");
		deSerializingContacts(obj);

	}

	public static void SerializingContacts(Contact c[]) throws IOException {

		File f = new File("Contact.txt");
		FileOutputStream fout = new FileOutputStream(f);
		ObjectOutputStream out = new ObjectOutputStream(fout);

		for (Contact temp : c) {
			out.writeObject(temp);
		}

		out.flush();
		out.close();

	}

	public static void deSerializingContacts(Contact c[]) throws IOException, ClassNotFoundException {

		File f = new File("Contact.txt");
		FileInputStream fout = new FileInputStream(f);
		ObjectInputStream in = new ObjectInputStream(fout);

		for (int i = 0; i < c.length; i++) {
			c[i] = (Contact) in.readObject();
			System.out.println(c[i]);
		}
		in.close();

	}

	public static Contact printInfo() {
		sc.nextLine();
		System.out.println("Enter FirstName : ");
		String fname = sc.nextLine();

		System.out.println("Enter LastName : ");
		String lname = sc.nextLine();

		System.out.println("Enter PhoneNumber : ");
		long phNumber = sc.nextLong();
		sc.nextLine();

		System.out.println("Enter EmailID :");
		String emailId = sc.nextLine();

		Contact contactObj = new Contact(fname, lname, phNumber, emailId);
		return contactObj;

	}
}
