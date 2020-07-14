package com.techlab.AutoMobile;

public class AutoMobileFactory {

	public IAutoMobile make(String string) {

		if (string == null) {
			return null;
		}
		if (string.equals("BMW")) {
			return new Bmw();
		} else if (string.equals("AUDI")) {
			return new Audi();
		} else if (string.equals("TESLA")) {
			return new Tesla();
		}
		return null;

	}

}
