package com.techlab.AutoMobile;

public class AutoMobileFactory {

	private static AutoMobileFactory am;
	private static IAutoMobile bmw, audi, tesla;

	private AutoMobileFactory() {
	}

	public static AutoMobileFactory getInstance() {
		if (am == null)
			am = new AutoMobileFactory();

		return am;
	}

	public IAutoMobile make(String string) {

		if (string.equals("BMW")) {
			if (bmw == null) {
				bmw = new Bmw();
			}
			return bmw;
		}
		if (string.equals("AUDI")) {
			if (audi == null) {
				audi = new Audi();
			}
			return audi;
		}
		if (string.equals("TESLA")) {
			if (tesla == null) {
				tesla = new Tesla();
			}
			return tesla;
		}
		return null;

	}

}
