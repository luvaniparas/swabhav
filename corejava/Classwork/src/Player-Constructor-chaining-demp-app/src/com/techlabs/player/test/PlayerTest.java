package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTest {
	public static void main(String args[]) {
		Player p2 = new Player(101, "pqr", -24);
		Player p1 = new Player(102, "abc", -20);
		Player p3 = new Player(103, "xyz", 24);
		printInfo(p2);
		printInfo(p1);
		printInfo(p3);
	}

	public static void printInfo(Player p) {
		System.out.println("\nId :" + p.getId());
		System.out.println("Name :" + p.getName());
		System.out.println("Age :" + p.getAge());
	}
}
