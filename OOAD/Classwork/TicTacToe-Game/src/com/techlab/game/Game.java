package com.techlab.game;

import java.util.ArrayList;

public class Game {

	private ArrayList<Player> players = new ArrayList<Player>();
	private Board board;
	private ResultAnalyzer analyzeResult;
	private int CURRENT_PLAYER = 0, NEXT_PLAYER = 1;
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

		try {

			if (board.addMarkToCell(getCurrentPlayer().getMark(), location)) {
				board.printBoard();
				if (flag == 0) {
					CURRENT_PLAYER++;
					NEXT_PLAYER--;
					flag++;
				} else {
					CURRENT_PLAYER--;
					NEXT_PLAYER++;
					flag--;
				}
				return true;
			}
		} catch (CellAlreadyOccupiedException e) {
			System.out.println(e.getMessage());
		} catch (OutOfCellException e) {
			System.out.println(e.getMessage());
		}
		return false;

	}

	public Player getCurrentPlayer() {
		return players.get(CURRENT_PLAYER);
	}

	public Player getNextPlayer() {
		return players.get(NEXT_PLAYER);
	}

	public String getStatus() {
		return analyzeResult.checkWinner();
	}

}
