package com.techlabs.player;

import com.techlabs.player.test.PlayerTest;

public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerTest p1 = new PlayerTest("Player1","Male",1.7f,60f);
		printInfo(p1);
		PlayerTest p2 = new PlayerTest("Player2","Male",1.7f,70f);
		printInfo(p2);
		PlayerTest p3 = new PlayerTest("Player3","Male",1.7f,90f);
		printInfo(p3);
	}
	
	public static void printInfo(PlayerTest p) {
		System.out.println("\nName : "+p.getName());
		System.out.println("Age : "+p.getAge());
		System.out.println("Gender : "+p.getGender());
		System.out.println("Height : "+p.getHeight());
		System.out.println("Weight : "+p.getWeight());
		
		p.doWorkOut();
		System.out.println("After Workout : "+p.getWeight());
		
		p.doEat();
		System.out.println("After Eating : "+p.getWeight());
		
		p.calculateBmi();
		if(p.getBmi() < 18.5) {
			System.out.println("UnderWeight : "+p.getBmi());
		}
		else if(p.getBmi() > 18.5 && p.getBmi() < 24.5) {
			System.out.println("OverWeight : "+p.getBmi());
		}
		else {
			System.out.println("Obese : "+p.getBmi());
		}
	}
}
