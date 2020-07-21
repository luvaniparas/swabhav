package com.techlab.game;

public class Board {

	private static String[] board;
	private Cell cell;
	private static int size;

	public Board(int size) {
		Board.size = size;
		cell = new Cell();
	}

	public static String[] getBoard() {
		return board;
	}

	public Cell getCell() {
		return cell;
	}

	public static int getSize() {
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

	public boolean addMarkToCell(Mark mark, int location) throws CellAlreadyOccupiedException, OutOfCellException {
		if (!isBoardFull()) {
			cell.setMark(mark);
			board = cell.isCellEmpty(board, location);

			return true;
		}
		return false;
	}
}
