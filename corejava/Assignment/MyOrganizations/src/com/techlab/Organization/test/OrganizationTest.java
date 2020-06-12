package com.techlab.Organization.test;

import java.text.ParseException;
import java.util.ArrayList;

import com.techlab.Organization.Organization;
import com.techlab.Organization.Partner;
import com.techlab.Organization.Talent;

public class OrganizationTest {

	public static void main(String[] args) throws ParseException {

		Organization o = new Organization(1, "Swabhav", "02/02/2020");

		// Partner ArrayList & passing to Organization
		ArrayList<Partner> pList = new ArrayList<Partner>();
		Partner p1 = new Partner(1, "AurionPro", 1000, 1000000);
		Partner p2 = new Partner(2, "MilesSoftware", 1000, 1000000);
		Partner p3 = new Partner(3, "elpee", 1000, 1000000);
		Partner p4 = new Partner(4, "Nexsales", 1000, 100000);
		Partner p5 = new Partner(5, "B2X", 1000, 100000);
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		pList.add(p4);
		pList.add(p5);
		// Organization has a Partner List
		Organization org = new Organization(pList);

		// Talent ArrayList
		ArrayList<Talent> tList = new ArrayList<Talent>();
		Talent t1 = new Talent(1, "Talent1", "AurionPro", 7);
		Talent t2 = new Talent(2, "Talent2", "MilesSoftware", 8);
		Talent t3 = new Talent(3, "Talent3", "elpee", 6);
		Talent t4 = new Talent(4, "Talent4", "Nexsales", 7);
		Talent t5 = new Talent(5, "Talent5", "B2X", 8);
		Talent t6 = new Talent(6, "Talent6", "B2X", 9);
		org.addTalent(t1);
		org.addTalent(t2);
		org.addTalent(t3);
		org.addTalent(t4);
		org.addTalent(t5);
		org.addTalent(t6);

		// partner has a Talent List
		new Partner(tList);

		p1.addTalent(t1);
		p2.addTalent(t2);
		p3.addTalent(t3);
		p4.addTalent(t4);
		p5.addTalent(t5);
		p5.addTalent(t6);

		printOrganizationInfo(o);

	}

	public static void printPartnerInfo(ArrayList<Partner> pList) {
		for (Object o : pList) {
			System.out.println(o);
		}
	}

	public static void printTalentInfo(ArrayList<Talent> tList) {
		for (Object o : tList) {
			System.out.println(o);
		}
	}

	public static void printOrganizationInfo(Organization o) {

		System.out.println("Organization Information -> ");
		System.out.println(o);

		System.out.println("\nPartners Information : ");
		System.out.println("Partner Count : " + Organization.getPartnerCount());
		printPartnerInfo(Organization.pList);

		System.out.println("\nTalent Information : ");
		printTalentInfo(Partner.tList);
	}

}
