package com.techlab.game;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Cell extends JFrame {

	private static EMark mark;

	public static void setMark(EMark mark) {
		Cell.mark = mark;
	}

	public static void markCell(JButton btn) throws AlreadyOccupiedException {
		
		if (btn.getText().equals("-")) {
			btn.setFont(new Font("Monaco", Font.PLAIN, 20));
			btn.setText(mark.toString());
		} else {
			throw new AlreadyOccupiedException("Choose another! \nThis cell is already Occupied ): ");
		}

	}

}
