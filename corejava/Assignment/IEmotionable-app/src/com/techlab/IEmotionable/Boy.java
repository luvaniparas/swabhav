package com.techlab.IEmotionable;

public class Boy implements IEmotionable {

	@Override
	public void cry() {
		System.out.println("Crying inside Boy ");
	}

	@Override
	public void laugh() {
		System.out.println("Laughing inside Boy ");
	}

}
