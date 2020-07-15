package com.techlab.game.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.game.Board;
import com.techlab.game.GameMaker;
import com.techlab.game.Mark;
import com.techlab.game.Player;

public class ConsoleGameFacadeTest {

	static Scanner sc = new Scanner(System.in);
	static Board board = null;

	public static void main(String[] args) throws Exception {

		System.out.println("--------------------------------");
		System.out.println("\tTic Tac Toe");
		System.out.println("--------------------------------");

		ArrayList<Player> players = new ArrayList<Player>();

		int location;

		getBoardInfo();

		GameMaker game = new GameMaker();
		// Game game = new Game(players, board, new ResultAnalyzer(board));

		String name = getFirstDataFromUser(game, players);
		while (true) {
			System.out.print("Enter cell number " + name + " => ");
			location = sc.nextInt();
			if (game.getPlay(location)) {
				break;
			}
		}

		name = getFirstDataFromUser(game, players);
		while (true) {
			System.out.print("Enter cell number " + name + " => ");
			location = sc.nextInt();
			if (game.getPlay(location)) {
				break;
			}
		}

		while (game.getStatus().equals("INPROGRESS")) {

			System.out.print(" Enter cell number " + game.getCurrentPlayer().getPlayerName() + " => ");
			location = sc.nextInt();

			game.getPlay(location);

		}

		if (game.getStatus().equals("WON")) {
			System.out.println(game.getNextPlayer().getPlayerName() + " is WINNER!!");
		} else if (game.getStatus().equals("DRAW")) {
			System.out.println("It's a DRAW...");
		}

		sc.close();
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

	public static String getFirstDataFromUser(GameMaker game, ArrayList<Player> players) throws Exception {

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

}
