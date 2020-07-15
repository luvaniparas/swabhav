package com.techlab.game;

public class Board {

	private String[] board;
	private Cell cell;
	private int size;

	public Board(int size) {
		this.size = size;
		cell = new Cell();
	}

	public String[] getBoard() {
		return board;
	}

	public Cell getCell() {
		return cell;
	}

	public int getSize() {
		return size;
	}

	public void createBoard() {
		board = new String[size * size];
		for (int i = 0; i < board.length; i++) {
			board[i] = "-";
		}
	}

	public boolean isBoardFull() {

		for (int i = 0; i < board.length; i++) {
			if (board[i].equals("-")) {
				return false;
			}
		}
		return true;
	}

	public void printBoard() {
		int j = 1;

		System.out.println("-----------------------------------------------");
		for (int i = 0; i < board.length; i++) {
			if (j <= size) {
				System.out.print("|" + board[i] + "|");
				j++;
			} else {
				j = 2;
				System.out.println();
				System.out.print("|" + board[i] + "|");
			}
		}
		System.out.println("\n-----------------------------------------------");
	}

	public boolean addMarkToCell(Mark mark, int location) throws CellAlreadyOccupiedException, OutOfCellException {

		if (location > board.length - 1) {
			throw new OutOfCellException();
		}

		if (!isBoardFull()) {
			cell.setMark(mark);
			board = cell.isCellEmpty(board, location);

			return true;
		}
		return false;
	}
}
