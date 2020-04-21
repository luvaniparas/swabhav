package com.techlabs.game;

import java.util.*;

public class GameTest {

	public static void main(String[] args) {
		// double a = Math.random()*10 ;
		Random r = new Random();
		int random = r.nextInt(10);
		System.out.println("Random number is : " + random);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Guess a number");
			int g = sc.nextInt();
			System.out.println("User input" + g);

			if (random > g) {
				System.out.println("Guess is low");
				continue;
			}

			else if (random < g) {
				System.out.println("Guess is High");
				continue;
			}

			else if (random == g) {
				System.out.println("Congratualtions you have guessed right number :" + g);
				break;
			}
		}
	}

}
