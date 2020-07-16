package com.techlab.Bike.Test;

import com.techlab.Bike.BasicBikeService;
import com.techlab.Bike.ChainAlignment;
import com.techlab.Bike.IBikeService;
import com.techlab.Bike.OilChange;

public class BikeServiceTest {

	public static void main(String[] args) {

		IBikeService service = new ChainAlignment(new OilChange(new BasicBikeService()));

		System.out.println(service.getCost());
		System.out.println(service.getDescripton());
	}

}
