package com.techlab.Game;

public class Football extends Game {

	@Override
	public void initialization() {
		System.out.println("FootBall Initialize");
		
	}

	@Override
	public void startPlay() {
		System.out.println("Football Play");
	}

	@Override
	public void endPlay() {
		System.out.println("Football end");		
	}

}
