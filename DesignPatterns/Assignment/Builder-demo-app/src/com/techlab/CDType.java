package com.techlab;

import java.util.ArrayList;
import java.util.List;

public class CDType {

	private List<IPacking> itemList = new ArrayList<IPacking>();

	public void addItem(IPacking packs) {
		itemList.add(packs);
	}

	public void getCost() {
		for (IPacking packs : itemList) {
			packs.price();
		}
	}

	public void showItems() {

		for (IPacking packing : itemList) {
			System.out.print("CD name : " + packing.pack());
			System.out.println(", Price : " + packing.price());
		}
	}
}
