package com.xworkz.xworkzapp.contract;

import java.util.Date;

public interface MakeMyTripContract {
	
	public int minBooking();
	public boolean warrenty();
	
	default public void printDate() {
		System.out.println(new Date());
	}

}
