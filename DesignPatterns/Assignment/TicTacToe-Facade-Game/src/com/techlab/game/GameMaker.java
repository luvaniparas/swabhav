package com.techlab.game;

import java.util.ArrayList;

public class GameMaker {

	private Game game;
	private Board board = Game.getBoard();
	ArrayList<Player> players = new ArrayList<Player>();

	public GameMaker() {
		game = new Game(players, board, new ResultAnalyzer(board));
	}

	public Board getBoard() {
		return board;
	}

	public boolean getPlay(int location) throws CellAlreadyOccupiedException, OutOfCellException {
		return game.play(location);
	}

	public Player getCurrentPlayer() {
		return game.getCurrentPlayer();
	}

	public Player getNextPlayer() {
		return game.getNextPlayer();
	}

	public String getStatus() {
		return game.getStatus();
	}

}
