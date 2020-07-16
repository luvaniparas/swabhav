package com.techlab.Bike;

public class OilChange extends BikeServices {

	public OilChange(IBikeService svc) {
		super(svc);
	}

	@Override
	public String getDescripton() {
		return svc.getDescripton()+" OilChange ";
	}

	@Override
	public int getCost() {
		return svc.getCost()+150;
	}
}
