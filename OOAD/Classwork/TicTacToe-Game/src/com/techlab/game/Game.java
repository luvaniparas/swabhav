package com.techlab.game;

import java.util.ArrayList;

import com.techlab.game.test.ConsoleGameTest;

public class Game {

	private ArrayList<Player> players = new ArrayList<Player>();
	private Board board;
	private ResultAnalyzer analyzeResult;
	private int current_player = 0, next_player = 1;
	private int flag = 0;

	public Game(ArrayList<Player> players, Board board, ResultAnalyzer analyzeResult) {
		this.players = players;
		this.board = board;
		this.analyzeResult = analyzeResult;
	}

	public Board getBoard() {
		return board;
	}

	public boolean play(int location) throws CellAlreadyOccupiedException, OutOfCellException {
		if (board.addMarkToCell(getCurrentPlayer().getMark(), location)) {
			ConsoleGameTest.printBoard();
			if (flag == 0) {
				current_player++;
				next_player--;
				flag++;
			} else {
				current_player--;
				next_player++;
				flag--;
			}
			return true;
		}
		return false;

	}

	public Player getCurrentPlayer() {
		return players.get(current_player);
	}

	public Player getNextPlayer() {
		return players.get(next_player);
	}

	public String getStatus() {
		return analyzeResult.checkWinner();
	}

}
