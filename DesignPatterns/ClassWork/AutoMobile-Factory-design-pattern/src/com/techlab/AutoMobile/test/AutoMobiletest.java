package com.techlab.AutoMobile.test;

import com.techlab.AutoMobile.AutoMobileFactory;
import com.techlab.AutoMobile.EAutoType;
import com.techlab.AutoMobile.IAutoMobile;

public class AutoMobiletest {

	public static void main(String[] args) {

		AutoMobileFactory factory = new AutoMobileFactory();

		IAutoMobile bmw = factory.make(EAutoType.BMW.toString());
		bmw.start();
		bmw.stop();

		IAutoMobile audi = factory.make(EAutoType.AUDI.toString());
		audi.start();
		audi.stop();

		IAutoMobile tesla = factory.make(EAutoType.TESLA.toString());
		tesla.start();
		tesla.stop();

	}

}
