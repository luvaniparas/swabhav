package com.techlabs.candidate.test;

import com.techlabs.candidate.Candidate;

public class CandidateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate c1 = new Candidate(21,"A",01,"Paras");
		Candidate c2 = new Candidate(23,"B",02,"Xyz");
		
		CandidateTest ctobj = new CandidateTest();
		
		/*
		c1.setAge(23);
		c1.setCreditpoint("A");
		c1.setId(01);
		c1.setName("Paras");
		
		c2.setAge(21);
		c2.setCreditpoint("B");
		c2.setId(02);
		c2.setName("abc");
		*/
		
		
		 c1.WhoIsElder(c2) ;
		if(c1.isElder == true) {
			System.out.println(c2.getName()+" Elder then "+c1.getName());
				
		}else {
			System.out.println(c1.getName()+" Elder then "+c2.getName());
			
		}
		
		
		 c1.WhoIsElder(c2) ;
			if(c1.isBetter == true) {
				System.out.println("\n"+c2.getName()+" Better then "+c1.getName());
				
			}else {
				System.out.println("\n"+c1.getName()+" Better then "+c2.getName());
			
			}
			ctobj.printInfo(c1);
			ctobj.printInfo(c2);
	}
	
	public void printInfo(Candidate c) {
		System.out.println("\nName :"+c.getName());
		System.out.println("Id :"+c.getId());
		System.out.println("Age :"+c.getAge());
		System.out.println("CreditPoint :"+c.getCreditpoint());
		
		
	}
}