package com.techlab.game.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlab.game.Board;
import com.techlab.game.Cell;
import com.techlab.game.Mark;

class CellJUnit {

	String board[] = new String[9];
	String emptyBoard[] = new String[9];
	String ExpectedBoard[] = new String[9];
	Mark xMark = Mark.X;
	int cellNumberOne = 0;
	int cellNumberTwo = 1;

	@Test
	void if_marking_is_done_properly() {
		board[0] = String.valueOf(xMark);

		new Cell(xMark);
		Cell.checkCell(Board.getBoard(), cellNumberOne);

		for (int i = 0; i < board.length; i++) {
			assertEquals(board[i], Board.getBoard()[i]);
		}
	}

	@Test
	void if_set_mark_works_properly() {

		board[0] = String.valueOf(xMark);

		Board.setBoard(ExpectedBoard);
		Cell.checkCell(Board.getBoard(), cellNumberOne);

		for (int i = 0; i < board.length; i++) {
			assertEquals(board[i], Board.getBoard()[i]);
		}
	}

	@Test
	void check_if_marks_dont_overwrite_other_marks_in_a_call_and_throws_exception_if_we_try() {
		board[1] = String.valueOf(xMark);

		Cell.checkCell(Board.getBoard(), cellNumberTwo);
		Cell.checkCell(Board.getBoard(), cellNumberTwo);
	}

}
