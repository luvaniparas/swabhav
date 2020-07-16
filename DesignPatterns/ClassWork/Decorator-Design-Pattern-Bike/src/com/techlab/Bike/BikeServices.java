package com.techlab.Bike;

public abstract class BikeServices implements IBikeService {

	protected IBikeService svc;

	public BikeServices(IBikeService svc) {
		this.svc = svc;
	}

	@Override
	public String getDescripton() {
		return svc.getDescripton();
	}

	@Override
	public int getCost() {
		return svc.getCost();
	}

}
