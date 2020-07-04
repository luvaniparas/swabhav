package com.techlab.game;

public class Board {

	public static String board[] = new String[9];

	public static String[] getBoard() {
		return board;
	}

	public static void printBoard() {
		System.out.println("----------------------");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println();
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println();
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("----------------------");
	}
}
