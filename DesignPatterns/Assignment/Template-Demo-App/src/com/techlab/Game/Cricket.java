package com.techlab.Game;

public class Cricket  extends Game{

	@Override
	public void initialization() {
		System.out.println("Cricket initialization");
	}

	@Override
	public void startPlay() {
		System.out.println("Cricket play");
	}

	@Override
	public void endPlay() {
		System.out.println("Cricket end");
	}

}
