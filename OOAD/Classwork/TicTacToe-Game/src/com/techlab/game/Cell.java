package com.techlab.game;

public class Cell {

	Mark mark;

	public void setMark(Mark mark) {
		this.mark = mark;
	}

	public String[] isCellEmpty(String[] board, int location) throws CellAlreadyOccupiedException, OutOfCellException {

		if (location > board.length - 1) {
			throw new OutOfCellException();
		}

		if (!board[location].equals("-")) {
			throw new CellAlreadyOccupiedException();
		} else {
			board[location] = mark.toString();
			return board;
		}
	}

}
