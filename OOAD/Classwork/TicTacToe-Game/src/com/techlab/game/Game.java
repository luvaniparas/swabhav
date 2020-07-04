package com.techlab.game;

import com.techlab.game.test.GameTest;

public class Game {

	static int count = 0;
	Player p;

	public static int getCount() {
		return count;
	}

	public Game(Player p) {
		this.p = p;
	}

	public static void startGame(Player p) {
		try {
			count++;
			int cellNumber = GameTest.getCell();
			new Cell(p.getMark());
			if (cellNumber < 9 && cellNumber >= 0) {
				Cell.checkCell(Board.getBoard(), cellNumber);
			} else {
				throw new validCell("Enter Valid Cell Number ! ");
			}
			Board.printBoard();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public static Result checkResult() {
		Result status = new ResultAnalyzer().checkWinner();
		return status;
	}

	public static void playgame(Player p1, Player p2) {

		for (int i = 0; i <= 6; i++) {
			if ((i % 2) == 0) {
				if (i > 2) {
					Result r = Game.checkResult();
					if (r == Result.WON) {
						System.out.println("Game Status : " + r);
						break;
					} else if (r == Result.DRAW) {
						System.out.println("Game Status : " + r);
					} else {
						System.out.println("Game Status : " + r);
					}
					Game.startGame(p1);
				} else {
					Game.startGame(p1);
				}
			} else {
				if (i > 2) {
					Result r = Game.checkResult();
					if (r == Result.WON) {
						System.out.println("Game Status : " + r);
						break;
					} else {
						System.out.println("Game Status : " + r);
					}
					Game.startGame(p2);
				} else {
					Game.startGame(p2);
				}
			}
			if (Game.getCount() == 9) {
				System.out.println("Game Status : " + Result.DRAW);
			}
		}

	}

}
