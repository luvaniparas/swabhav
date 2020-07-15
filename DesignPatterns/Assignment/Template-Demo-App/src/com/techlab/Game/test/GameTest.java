package com.techlab.Game.test;

import com.techlab.Game.Cricket;
import com.techlab.Game.Football;
import com.techlab.Game.Game;

public class GameTest {

	public static void main(String[] args) {
		Game c = new Cricket();
		c.play();

		System.out.println();
		
		Game f = new Football();
		f.play();
	}

}
