package com.techlab.AutoMobile.test;

import com.techlab.AutoMobile.AutoMobileFactory;
import com.techlab.AutoMobile.EAutoType;
import com.techlab.AutoMobile.IAutoMobile;

public class AutoMobiletest {

	public static void main(String[] args) {

		AutoMobileFactory factory = AutoMobileFactory.getInstance();

		IAutoMobile bmw = factory.make(EAutoType.BMW.toString());
		bmw.start();
		bmw.stop();

		System.out.println();

		IAutoMobile bmw2 = factory.make(EAutoType.BMW.toString());
		bmw2.start();
		bmw2.stop();

		System.out.println("BMW = " + bmw.hashCode());
		System.out.println("BMW2 = " + bmw.hashCode());

	}

}
