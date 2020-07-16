package com.techlab.Bike;

public class ChainAlignment extends BikeServices {

	public ChainAlignment(IBikeService svc) {
		super(svc);
	}

	@Override
	public String getDescripton() {
		return svc.getDescripton() + "ChainAlignment";
	}

	@Override
	public int getCost() {
		return svc.getCost() + 100;
	}

}
