package com.xworkz.xworkzapp.flightbooking;

public class Flight {
	FlightBookingDTO[] flights = new FlightBookingDTO[2];
	public int index;

	public void addFlightsBookingdetails(FlightBookingDTO flights) {
		if (flights != null) {
			this.flights[index++] = flights;

		} else if (flights == null) {
			System.out.println("flight booking deatils are not added as it is null");
		}
	}

	public void displayAllDetails() {
		
		{
			for (int i = 0; i < flights.length; i++) {
				if (flights[i]!=null) {
				} else if (flights[i] == null) {
					System.out.println("please add all the details");
				}
			}
		}
	
	}
}
/*
 * public FlightBookingDTO[] searchByStartingPoint(String startingPoint) {
 * FlightBookingDTO[] fDTOs=null; for (int i = 0; i < flights.length; i++) {
 * if(fDTOs[i]!=null) { if(fDTOs[i].getStartingPoint().equals(startingPoint)) {
 * System.out.println(fDTOs[i].getStartingPoint()+" "+fDTOs[i].getCode()+" "
 * +fDTOs[i].getCompany()+" "+fDTOs[i].getDestination()+" "+fDTOs[i].
 * getTotalSeats()+" "+fDTOs[i].getEconomyClassPrice()+" "+fDTOs[i].
 * getBusinessClassPrice()+" "+fDTOs[i].isDomestic());
 * 
 * }else { System.out.println("please enter correct starting point"); } }}
 * return fDTOs;
 * 
 * }}
 */