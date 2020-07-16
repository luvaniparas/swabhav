package com.techlab.Bike;

public class BasicBikeService implements IBikeService {

	@Override
	public String getDescripton() {
		return "BikeService";
	}

	@Override
	public int getCost() {
		return 300;
	}

}
