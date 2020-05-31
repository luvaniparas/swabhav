package com.techlab.IEmotionable;

public class Man implements IEmotionable, ISocializable {

	@Override
	public void wish() {
		System.out.println("Wishing insdie Man ");
	}

	@Override
	public void depart() {
		System.out.println("Depart insdie Man ");
	}

	@Override
	public void cry() {
		System.out.println("Crying insdie Man ");
	}

	@Override
	public void laugh() {
		System.out.println("Laughing insdie Man ");
	}

}
