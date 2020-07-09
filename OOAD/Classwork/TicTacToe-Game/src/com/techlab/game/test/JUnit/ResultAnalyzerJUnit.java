package com.techlab.game.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlab.game.Board;
import com.techlab.game.Mark;
import com.techlab.game.Result;
import com.techlab.game.ResultAnalyzer;

class ResultAnalyzerJUnit {

	String board[] = new String[9];
	Mark xMark = Mark.X;
	Mark oMark = Mark.O;
	Result won = Result.WON;

	ResultAnalyzer r = new ResultAnalyzer();
	Result ActualResult;

	@Test
	void test_Winning_Row() {
		board[0] = String.valueOf(xMark);
		board[1] = String.valueOf(xMark);
		board[2] = String.valueOf(xMark);

		Board.setBoard(board);

		ActualResult = r.checkWinner();

		assertEquals(ActualResult, won);
	}

	@Test
	void test_Winning_Column() {
		board[0] = String.valueOf(xMark);
		board[3] = String.valueOf(xMark);
		board[6] = String.valueOf(xMark);

		Board.setBoard(board);

		ActualResult = r.checkWinner();

		assertEquals(ActualResult, won);
	}

	@Test
	void test_Winning_diagonal() {
		board[0] = String.valueOf(xMark);
		board[4] = String.valueOf(xMark);
		board[8] = String.valueOf(xMark);

		Board.setBoard(board);

		ActualResult = r.checkWinner();

		assertEquals(ActualResult, won);
	}

	@Test
	void test_draw_Condition() {

		boolean expected = true;

		board[0] = String.valueOf(xMark);
		board[1] = String.valueOf(xMark);
		board[2] = String.valueOf(oMark);
		board[3] = String.valueOf(xMark);
		board[4] = String.valueOf(oMark);
		board[5] = String.valueOf(xMark);
		board[6] = String.valueOf(oMark);
		board[7] = String.valueOf(xMark);
		board[8] = String.valueOf(oMark);

		Board.setBoard(board);

		boolean output = ResultAnalyzer.isBoardFull();
		assertEquals(output, expected);

	}
}
