package com.xworkz.xworkzapp.vrl;

import com.xworkz.xworkzapp.agency.TravelAgency;
import com.xworkz.xworkzapp.contract.MakeMyTripContract;

public interface AgencyTester {
	public static void main(String[] args) {
		MakeMyTripContract contract=new MakeMyTripImpl();
		TravelAgency agency=new TravelAgency(contract);
		agency.acceptBooking();
		System.out.println(agency);
		contract.printDate();
		
		
	}

}
