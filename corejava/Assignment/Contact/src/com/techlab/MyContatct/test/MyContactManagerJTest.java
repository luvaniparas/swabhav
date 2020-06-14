package com.techlab.MyContatct.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.techlab.MyContact.MyContact;
import com.techlab.MyContact.MyContactManager;

class MyContactManagerJTest {

	String lName = "l";
	int expectedIndex = 1;

	MyContact ContactArray[] = MyContactManager.getContactArray();
	MyContact expectedContactArray[] = new MyContact[2];
	MyContact expectedModifyContactArray[] = new MyContact[2];

	MyContact m1 = new MyContact("p", "p", "pp", 11);
	MyContact m2 = new MyContact("l", "l", "ll", 22);
	MyContact m3 = new MyContact("z", "z", "zz", 33);

	@Test
	void testValidateString() {
		String n = "";
		String expectedS = "UnSpecified";

		String m = MyContactManager.validateString(n);

		assertEquals(expectedS, m);
	}

	@Test
	void testaddContact() throws IOException {
		expectedContactArray[0] = m1;
		expectedContactArray[1] = m2;

		MyContactManager.addContact(ContactArray);

		assertArrayEquals(expectedContactArray, ContactArray);
	}

	@Test
	void testSearchContact() throws IOException {
		expectedContactArray[0] = m1;
		expectedContactArray[1] = m2;

		int index = MyContactManager.searchContact(expectedContactArray, lName);

		assertEquals(expectedIndex, index);
	}

	@Test
	void testModifyContact() throws IOException {
		expectedModifyContactArray[0] = m1;
		expectedModifyContactArray[1] = m3;

		MyContactManager.modifyContact(ContactArray, lName);

		assertArrayEquals(expectedModifyContactArray, ContactArray);
	}

	@Test
	void testDeleteContact() throws IOException {
		expectedContactArray[0] = m1;
		expectedContactArray[1] = m2;
		
		int index = MyContactManager.deleteContact(expectedContactArray, lName);

		assertEquals(expectedIndex, index);
	}

}
