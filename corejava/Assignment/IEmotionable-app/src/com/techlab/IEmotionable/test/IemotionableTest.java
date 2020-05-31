package com.techlab.IEmotionable.test;

import com.techlab.IEmotionable.Boy;
import com.techlab.IEmotionable.IEmotionable;
import com.techlab.IEmotionable.ISocializable;
import com.techlab.IEmotionable.Man;

public class IemotionableTest {

	public static void main(String[] args) {
		Man m = new Man();
		atTheParty(m, m);
		atTheMovie(m);

		Boy b = new Boy();
		atTheParty(m, b);
		atTheMovie(b);

	}
	
	static void atTheParty(ISocializable sobj,IEmotionable eobj) {
		//obj.(wat all things will be visible here)
		System.out.println();
		sobj.wish();
		sobj.depart();
		eobj.cry();
		eobj.laugh();
	}

	static void atTheMovie(IEmotionable eobj) {
		//obj.(wat all things will be visible here)
		System.out.println();
		eobj.cry();
		eobj.laugh();
	}

}
