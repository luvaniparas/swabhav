package com.techlab.game.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.game.Board;
import com.techlab.game.CellAlreadyOccupiedException;
import com.techlab.game.Game;
import com.techlab.game.Mark;
import com.techlab.game.OutOfCellException;
import com.techlab.game.Player;
import com.techlab.game.ResultAnalyzer;

public class ConsoleGameTest {

	static Scanner sc = new Scanner(System.in);
	static Board board = null;
	static int location;
	static String name;
	static Game game;

	public static void main(String[] args) throws Exception {

		ArrayList<Player> players = new ArrayList<Player>();

		System.out.println("--------------------------------");
		System.out.println("\tTic Tac Toe");
		System.out.println("--------------------------------");

		getBoardInfo();

		game = new Game(players, board, new ResultAnalyzer(board));

		name = getFirstDataFromUser(game, players);
		getCellNumber();

		name = getFirstDataFromUser(game, players);
		getCellNumber();

		while (game.getStatus().equals("INPROGRESS")) {

			System.out.print(" Enter cell number " + game.getCurrentPlayer().getPlayerName() + " => ");
			location = sc.nextInt();

			game.play(location);

		}

		if (game.getStatus().equals("WON")) {
			System.out.println(game.getNextPlayer().getPlayerName() + " is WINNER!!");
		} else if (game.getStatus().equals("DRAW")) {
			System.out.println("It's a DRAW...");
		}

	}

	public static void getCellNumber() throws CellAlreadyOccupiedException, OutOfCellException {
		while (true) {
			System.out.print("Enter cell number " + name + " => ");
			location = sc.nextInt();
			try {
				if (game.play(location)) {
					break;
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

		}
	}

	public static void getBoardInfo() {
		System.out.print("Enter board size: ");
		int size = sc.nextInt();
		if (size > 1) {
			board = new Board(size);
			board.createBoard();
		} else {
			System.out.println("Enter size greater than 1 ");
		}
	}

	public static String getFirstDataFromUser(Game game, ArrayList<Player> players) throws Exception {

		Player player;
		String p;

		System.out.print("Enter your name: ");
		p = sc.next();
		if (players.isEmpty()) {
			player = new Player(p, Mark.X);
		} else {
			player = new Player(p, Mark.O);
		}
		players.add(player);
		return p;

	}

	public static void printBoard() {
		int j = 1;

		System.out.println("-----------------------------------------------");
		for (int i = 0; i < Board.getBoard().length; i++) {
			if (j <= Board.getSize()) {
				System.out.print("|" + Board.getBoard()[i] + "|");
				j++;
			} else {
				j = 2;
				System.out.println();
				System.out.print("|" + Board.getBoard()[i] + "|");
			}
		}
		System.out.println("\n-----------------------------------------------");
	}

}
