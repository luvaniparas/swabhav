package com.techlab.game;

public class ResultAnalyzer {

	private Board board;

	static Result result = Result.INPROGRESS;

	public ResultAnalyzer() {

	}

	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	public Result checkWinner() {

		if (checkRow().equals(Result.WON)) {
			return result;
		}

		if (checkColumn().equals(Result.WON)) {
			return result;
		}
		if (checkDiagonal().equals(Result.WON)) {
			return result;
		}

		return result;
	}

	public Result checkRow() {

		for (int i = 0; i < Board.getBoard().length; i += 3) {
			if (!Board.getBoard()[i].equals("-") && Board.getBoard()[i].equals(Board.getBoard()[i + 1])
					&& Board.getBoard()[i].equals(Board.getBoard()[i + 2])) {
				result = Result.WON;
				break;
			} else {
				return result;
			}
		}
		return result;

	}

	public Result checkColumn() {

		for (int i = 0; i < Board.getBoard().length; i++) {
			if (!Board.getBoard()[i].equals("-") && Board.getBoard()[i].equals(Board.getBoard()[i + 3])
					&& Board.getBoard()[i].equals(Board.getBoard()[i + 6])) {
				result = Result.WON;
				break;
			} else {
				return result;
			}
		}
		return result;
	}

	public Result checkDiagonal() {

		if (!Board.getBoard()[0].equals("-") && Board.getBoard()[0].equals(Board.getBoard()[4])
				&& Board.getBoard()[0].equals(Board.getBoard()[8]))
			result = Result.WON;
		if (!Board.getBoard()[2].equals("-") && Board.getBoard()[2].equals(Board.getBoard()[4])
				&& Board.getBoard()[2].equals(Board.getBoard()[6]))
			result = Result.WON;
		return Result.WON;

	}

}
