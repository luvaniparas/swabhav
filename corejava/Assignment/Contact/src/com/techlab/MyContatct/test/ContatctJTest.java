package com.techlab.MyContatct.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlab.MyContact.MyContact;

class ContatctJTest {

	@Test
	void testConstructorMyContact() {

		String expectedfName = "paras", expectedlName = "luvani", expectedEmailId = "p.l@gmail.com";
		long expectedPhNumber = 1;

		MyContact c = new MyContact("paras", "luvani", "p.l@gmail.com", 1);

		assertEquals(expectedfName, c.getfName());
		assertEquals(expectedlName, c.getlName());
		assertEquals(expectedEmailId, c.getEmailId());
		assertEquals(expectedPhNumber, c.getPhoneNo());
	}

}
