package com.techlab.game;

public class ResultAnalyzer {

	private Board board;
	private EResult result = EResult.INPROGRESS;

	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	public String checkWinner() {

		if (board.isBoardFull())
			return EResult.DRAW.toString();
		if (testRow().equals(EResult.WIN))
			return EResult.WIN.toString();
		if (testColumn().equals(EResult.WIN))
			return EResult.WIN.toString();
		if (testDiagonal().equals(EResult.WIN))
			return EResult.WIN.toString();

		return result.toString();
	}

	public EResult testRow() {

		int j = 0, resultCount = 1;
		EResult result = EResult.INPROGRESS;

		for (int i = 1; i < board.getBoard().length; i++) {
			if (!board.getBoard()[j].getText().equals("-")
					&& board.getBoard()[j].getText().equals(board.getBoard()[i].getText())) {

				if (++resultCount == board.getBoardSize()) {
					result = EResult.WIN;
					break;
				}
			} else {
				i = j + board.getBoardSize();
				j = j + board.getBoardSize();
				resultCount = 1;
				result = EResult.INPROGRESS;
			}
		}

		return result;
	}

	public EResult testColumn() {

		int j = 0, resultCount = 1;
		EResult result = EResult.INPROGRESS;

		for (int i = board.getBoardSize(); j < (board.getBoard().length / board.getBoardSize()); i += board
				.getBoardSize()) {
			if (!board.getBoard()[j].getText().equals("-")
					&& board.getBoard()[j].getText().equals(board.getBoard()[i].getText())) {
				if (++resultCount == board.getBoardSize()) {
					result = EResult.WIN;
					break;
				}

			} else {

				j++;
				i = j;
				resultCount = 1;
				result = EResult.INPROGRESS;

			}
		}

		return result;
	}

	public EResult testDiagonal() {

		int j = 0, resultCount = 1;
		boolean resultFound = false;
		EResult result = EResult.INPROGRESS;

		for (int i = (board.getBoardSize() + 1); i < board.getBoard().length; i += (board.getBoardSize() + 1)) {

			if (!board.getBoard()[j].getText().equals("-")
					&& board.getBoard()[j].getText().equals(board.getBoard()[i].getText())) {
				if (++resultCount == board.getBoardSize()) {
					result = EResult.WIN;
					resultFound = true;
					break;
				}
			} else {
				resultCount = 1;
				break;
			}
		}

		j = board.getBoardSize() - 1;

		for (int i = (j * 2); i < board.getBoard().length - j; i += j) {

			if (resultFound) {
				break;
			}
			if (!board.getBoard()[j].getText().equals("-")
					&& board.getBoard()[j].getText().equals(board.getBoard()[i].getText())) {
				if (++resultCount == board.getBoardSize()) {
					result = EResult.WIN;
					break;
				}
			}
		}

		return result;
	}

}
