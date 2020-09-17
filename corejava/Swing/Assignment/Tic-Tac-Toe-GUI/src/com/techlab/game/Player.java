package com.techlab.game;

public class Player {

	private String playerName;
	private EMark mark;

	public Player(String playerName, EMark mark) {
		this.playerName = playerName;
		this.mark = mark;
	}

	public String getPlayerName() {
		return playerName;
	}

	public EMark getMark() {
		return mark;
	}

}
