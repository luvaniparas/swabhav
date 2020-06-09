package com.techlab.MyContatct.test;

import java.io.IOException;
import java.util.Scanner;

import com.techlab.MyContact.MyContact;
import com.techlab.MyContact.MyContactManager;

public class ContactTest extends MyContactManager {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		boolean exit = false;
		String lName;
		int index;

		MyContact[] contactArray = new MyContact[2];

		do {
			System.out.println(
					"Enter -> \n1.AddContact \n2.ModifyContact \n3.SearchContact \n4.DeleteContact \n5.DisplayContact \n6.Exit");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				addContact(contactArray);
				break;

			case 2:
				lName = getLname();
				modifyContact(contactArray, lName);
				break;

			case 3:
				lName = getLname();
				index = searchContact(contactArray, lName);
				try {
					if (index >= 0) {
						System.out.println(contactArray[index]);
					} else {
						throw new NotFoundException("No data found ):");
					}
				} catch (NotFoundException e) {
					System.err.println(e.getMessage());
				}
				break;

			case 4:
				lName = getLname();
				index = deleteContact(contactArray, lName);
				System.out.println(contactArray[index]);
				break;

			case 5:
				displayContact(contactArray);
				break;

			case 6:
				exit = true;
				break;

			default:
				System.out.println("Enter Valid Choice ): ");
				break;
			}
		} while (exit != true);
	}

	public static String getLname() {
		sc.nextLine();
		System.out.println("Enter Last-Name -> ");
		String lName = sc.nextLine();
		return lName;
	}

	public static MyContact getContactInfo() {
		System.out.println("Enter Contact Infromation -> ");

		String lName = getLname();
		lName = validateString(lName);

		System.out.println("Enter First-Name -> ");
		String fName = sc.nextLine();
		fName = validateString(fName);

		System.out.println("Enter Email-ID -> ");
		String emailId = sc.nextLine();
		emailId = validateString(emailId);

		System.out.println("Enter PhoneNumber -> ");
		long phNumber = sc.nextLong();

		return new MyContact(fName, lName, emailId, phNumber);
	}

}
