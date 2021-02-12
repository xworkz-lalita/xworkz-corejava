package com.xworkz.xworkzapp;

public class TubeLightImpl implements ISwitch {

	@Override
	public void sOn() {
	
		System.out.println("tube light turned on");

	}

	@Override
	public void sOff() {
		
		System.out.println("tube light turned off");

	}

}
