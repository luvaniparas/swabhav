package com.techlab.game;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Board extends JFrame {

	private JButton[] board;
	private Cell cell;
	private int boardSize = 3;

	public Board() {
		cell = new Cell();
	}

	public JButton[] getBoard() {
		return board;
	}

	public int getBoardSize() {
		return boardSize;
	}

	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}

	public void createBoard() {
		board = new JButton[boardSize * boardSize];

		for (int i = 0; i < board.length; i++) {
			board[i] = new JButton("-");
		}

	}

	public void addMarkToCell(EMark mark, JButton button) {

		Cell.setMark(mark);
		try {
			Cell.markCell(button);
		} catch (AlreadyOccupiedException e1) {
			JOptionPane.showMessageDialog(null,
					new AlreadyOccupiedException("Choose another! \nThis cell is already Occupied ): "));
		}

	}

	public boolean isBoardFull() {

		for (int i = 0; i < board.length; i++) {
			if (!board[i].getText().equals("")) {
				return false;
			}
		}

		return true;
	}

}
