package com.techlab.game.test;

import java.util.Scanner;

import com.techlab.game.Board;
import com.techlab.game.Game;
import com.techlab.game.Mark;
import com.techlab.game.Player;
import com.techlab.game.Result;

public class GameTest {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("--------------------------------");
		System.out.println("\tTic Tac Toe");
		System.out.println("--------------------------------");

		Board.printBoard();

		Player p1 = createPlayer();
		Mark markX = Mark.X;
		firstMove(p1, markX);

		Player p2 = createPlayer();
		Mark markO = Mark.O;
		firstMove(p2, markO);

		Game.playgame(p1, p2);

	}



	public static void firstMove(Player p, Mark m) {
		p.setMark(m);
		new Game(p);
		Game.startGame(p);
	}

	public static Player createPlayer() {
		System.out.println("Enter Player Name => ");
		String pName = sc.next();
		return new Player(pName);
	}

	public static int getCell() {
		System.out.println("Enter Cell number => ");
		int cell = sc.nextInt();
		return cell;
	}

}
