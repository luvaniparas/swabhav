package com.techlab.game;

public class CellAlreadyOccupiedException extends Exception {

	CellAlreadyOccupiedException() {
		System.err.println("Already Marked");
	}

}
