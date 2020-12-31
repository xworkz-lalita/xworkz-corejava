package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.flight.FlightBooking;
import com.xworkz.xworkzapp.flight.FlightBookingDTO;
import com.xworkz.xworkzapp.flight.constant.Company;

public class FlightUtil {
	public static void main(String[] args) {
		
		FlightBookingDTO flight=new FlightBookingDTO();
		flight.setCode(1222222222l);
		flight.setCompany(Company.AirIndia);
		flight.setStartingPoint("Chennai");
		flight.setDestination("Mangaluru");
		flight.setTotalSeats(50);
		flight.setDomestic(true);
		flight.setBusinessClassPrice(1000.00);
		flight.setEconomyClassPrice(50);
	
		 
		FlightBookingDTO flightOne=new FlightBookingDTO();
		flightOne.setCode(122224554554545l);
		flightOne.setCompany(Company.Delta);
		flightOne.setStartingPoint("bengaluru");
		flightOne.setDestination("bellary");
		flightOne.setTotalSeats(30);
		flightOne.setDomestic(true);
		flightOne.setBusinessClassPrice(9900);
		flightOne.setEconomyClassPrice(40000);
		
		FlightBooking f=new FlightBooking();
		f.addFlightsBookingdetails(flight);
		
		 f.addFlightsBookingdetails(flightOne);
		
		//f.displayAllDetails();
		f.searchByStartingPoint("bengaluru");
		 }}
		
