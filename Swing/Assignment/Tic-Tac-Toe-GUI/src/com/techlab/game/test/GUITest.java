package com.techlab.game.test;

import com.techlab.game.Board;
import com.techlab.game.Game;
import com.techlab.game.ResultAnalyzer;

public class GUITest {

	public static void main(String[] args) {
		Board board = new Board();
		Game game = new Game(board, new ResultAnalyzer(board));
	}

}
