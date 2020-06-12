package com.techlab.pwd;

public class PasswordValidator {

	public boolean isValide(String s) {
		if (s.length() > 5 && s.length() < 11) {
			return true;
		} else {
			return false;
		}
	}

}
