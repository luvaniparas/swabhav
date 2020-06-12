package com.techlab.pwd;



public class TestPassword {

	public void testLength() {
		PasswordValidator pv = new PasswordValidator();
		Assert.assertEquals(true,"abc123");
	}
	
}
