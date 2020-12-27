package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.icecream.ButterScotch;
import com.xworkz.xworkzapp.icecream.Chacolate;

public class IceCreamUtil {
	public static void main(String[] args) {// icecreamutil,string,system,butterscotch,chocolate-5 classes
		ButterScotch bs = new ButterScotch();
		bs.setCost(45.00);
		bs.setFlavour("butter");
		bs.setType("Cone");
		Chacolate c = new Chacolate();
		c.setCost(50.00);
		c.setFlavour("chacolate");
		c.setType("Family pack");
		System.out.println(c.getCost() + " " + c.getType() + " " + c.getFlavour());
		System.out.println(bs.getCost() + " " + bs.getType() + " " + bs.getFlavour());
		// for(String string:args)
		// System.out.println(string);
	}

}
