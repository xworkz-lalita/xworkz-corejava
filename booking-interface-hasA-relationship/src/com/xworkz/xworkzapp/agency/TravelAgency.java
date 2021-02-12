package com.xworkz.xworkzapp.agency;

import com.xworkz.xworkzapp.contract.MakeMyTripContract;

public class TravelAgency {
	public MakeMyTripContract contract;
	
	public  String name="sugama travel pvt Ltd";
	
	


	public TravelAgency(MakeMyTripContract contract) {
	this.contract =contract;
	}
	
	public void acceptBooking() {
		System.out.println("inside the accepting booking");
		if(contract.warrenty()) {
			
			if(contract.minBooking()>0 && contract.minBooking()<=43) {
				System.out.println("booking is accepted");
			}
			else {
				System.out.println("booking is not accepted");
			}}
			else {
				System.out.println("no warrenty");
			}
		}
	
	

	@Override
	public String toString() {
		return "TravelAgency [name=" + name + "]";
	}

}
