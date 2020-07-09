package com.techlab.game.test.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.game.Board;
import com.techlab.game.Cell;
import com.techlab.game.Mark;

class BoardJUnit {

	String empty = " ";
	int expectedSize = 9;
	int cellOne = 0;
	Mark xMark = Mark.X;
	String emptyBoard[] = new String[9];
	String board[] = new String[9];

	@Test
	void check_if_board_is_created_with_proper_number_of_Cells() {
		assertEquals(expectedSize, Board.getBoard().length);
	}

	@Test
	void check_if_board_has_empty_cells() {

		for (int i = 0; i < expectedSize; i++) {
			assertEquals(Board.getBoard()[i], emptyBoard[i]);
		}

	}

	@Test
	void check_if_marks_can_be_set_on_a_given_position() {
		board[0] = String.valueOf(xMark);

		Board.setBoard(board);
		Cell.checkCell(Board.getBoard(), cellOne);

		for (int i = 0; i < board.length; i++) {
			assertEquals(board[i], Board.getBoard()[i]);
		}
	}

	@Test
	void check_if_marks_dont_overwrite_other_marks_and_throws_exception_if_we_try() {
		board[1] = String.valueOf(xMark);

		Cell.checkCell(Board.getBoard(), cellOne);

	}

	@Test
	void check_if_board_full_returns_true_if_board_is_full() {

		boolean expected = true;

		for (int i = 0; i < board.length; i++) {
			board[i] = String.valueOf(xMark);
		}

		Board.setBoard(board);

		boolean output = Board.isBoardFull();
		assertEquals(output, expected);

	}

}
