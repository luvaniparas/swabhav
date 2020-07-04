package com.techlab.game;

public class Cell {

	public static Mark mark;

	public Cell(Mark mark) {

		Cell.mark = mark;

	}

	public static void checkCell(String board[], int cell) {
		String empty = null;
		try {
			if (board[cell] == empty) {
				board[cell] = String.valueOf(mark);
			} else {
				throw new occupiedException("Cell is Already Occupied ): ");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
