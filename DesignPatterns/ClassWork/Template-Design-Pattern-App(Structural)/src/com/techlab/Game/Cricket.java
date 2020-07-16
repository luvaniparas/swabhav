package com.techlab.Game;

public class Cricket extends Game {

	@Override
	public void initialization() {
		System.out.println("Cricket :: Initialization");
	}

	@Override
	public void startPlay() {
		System.out.println("Cricket :: StartPlay");		
	}

	@Override
	public void endPlay() {
		System.out.println("Cricket :: EndPlay");		
	}

}
