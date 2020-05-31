package com.techlab.accountSerializable.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.techlab.accountSerializable.Account;

public class AccountTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account arr[] = new Account[5];

		Account a1 = new Account("user1");
		a1.withdraw(400);
		a1.deposit(100);

		Account a2 = new Account("user2");
		a2.deposit(100);
		a2.withdraw(300);
		a2.deposit(100);

		Account a3 = new Account("user3");
		a3.deposit(100);
		a3.withdraw(200);
		a3.deposit(100);

		Account a4 = new Account("user4");
		a4.deposit(100);
		a4.withdraw(100);
		a4.deposit(100);
		a4.withdraw(100);

		Account a5 = new Account("user5");
		a5.deposit(100);
		a5.withdraw(100);
		a5.deposit(100);
		a5.withdraw(100);
		a5.deposit(100);

		arr[0] = a1;
		arr[1] = a2;
		arr[2] = a3;
		arr[3] = a4;
		arr[4] = a5;

		storingAccountHolderDetails(arr);
		retrivingAccountHolderDetails(arr);
		

	}

	public static void storingAccountHolderDetails(Account a[]) {
		try {
			File f = new File("AccountText.txt");
			FileOutputStream fout = new FileOutputStream(f);
			ObjectOutputStream out = new ObjectOutputStream(fout);
			for (Account temp : a) {
				out.writeObject(temp);
			}
			out.flush();
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void retrivingAccountHolderDetails(Account a[]) {

		try { 
			File f = new File("AccountText.txt");
			FileInputStream fout = new FileInputStream(f);
			ObjectInputStream in = new ObjectInputStream(fout);

			for (int i = 0; i < a.length; i++) {
				a[i] = (Account) in.readObject();
				System.out.println(a[i]);
			}
			in.close();
			
		} catch (Exception e) {
			System.out.println("Retrieval" + e);
		}

	}

}
