package com.techlab.Game.Test;

import com.techlab.Game.Cricket;
import com.techlab.Game.Football;
import com.techlab.Game.Game;

public class GameTest {

	public static void main(String[] args) {

		Game g = new Cricket();
		g.play();

		System.out.println();

		g = new Football();
		g.play();

	}

}
