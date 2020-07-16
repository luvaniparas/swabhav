package com.techlab.Game;

public class Football extends Game {

	@Override
	public void initialization() {
		System.out.println("Football :: Initialization");
	}

	@Override
	public void startPlay() {
		System.out.println("Football :: StartPlay");
	}

	@Override
	public void endPlay() {
		System.out.println("Football :: EndPlay");
	}

}
