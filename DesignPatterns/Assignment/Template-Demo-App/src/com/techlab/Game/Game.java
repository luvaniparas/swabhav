package com.techlab.Game;

public abstract class Game {

	public abstract void initialization();

	public	abstract void startPlay();

	public abstract void endPlay();

	public final void play() {
		initialization();
		startPlay();
		endPlay();
	}

}
