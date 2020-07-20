package com.techlab.test;

import com.techlab.CDBuilder;
import com.techlab.CDType;

public class CDTest {

	public static void main(String[] args) {

		CDBuilder cdb = new CDBuilder();
		CDType s1 = cdb.buildSonyCD();
		CDType s2 = cdb.buildSamsungCD();

		s1.showItems();
		s2.showItems();

	}

}
