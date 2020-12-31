package com.xworkz.xworkzapp.flight;

public class FlightBooking {
	FlightBookingDTO[] flights = new FlightBookingDTO[3];// constant size
	public int index;

	public void addFlightsBookingdetails(FlightBookingDTO flights) {

		if (flights.getCode() != 0 && flights.getCompany() != null && flights.getStartingPoint() != null
				&& flights.getBusinessClassPrice() != 0) {
			if (flights.getBusinessClassPrice() >= 1000) {
				this.flights[index++] = flights;
				System.out.println("added flight comapany" + flights.getCompany());
			} else {
				System.out.println("price should be greter trhan 1000");
			}
		} else {
			System.out.println("flight booking deatils are not added as it is null");
		}
	}

	public void displayAllDetails() {
		for (int i = 0; i < flights.length; i++) {
			if (flights[i] != null) {
				System.out.println(flights[i].getStartingPoint() + " " + flights[i].getCode() + " "
						+ flights[i].getCompany() + " " + flights[i].getDestination() + " " + flights[i].getTotalSeats()
						+ " " + flights[i].getEconomyClassPrice() + " " + flights[i].getBusinessClassPrice() + " "
						+ flights[i].isDomestic());
			} else if (flights[i] == null) {
				System.out.println("please add all the details");
			}
		}
	}

	public void searchByStartingPoint(String startingPoint) {
		boolean point = false;
		for (int i = 0; i < flights.length; i++) {
			if (flights[i] != null) {
				if (flights[i].getStartingPoint().equals(startingPoint)) {
					System.out.println("Flight starting point is : " + flights[i].getStartingPoint() + " "
							+ "Flight code is : " + flights[i].getCode() + " " + "Flight company name is : "
							+ flights[i].getCompany() + " " + "Flight destination is : " + flights[i].getDestination()
							+ " " + "Flight seats are : " + flights[i].getTotalSeats() + " "
							+ "Flight economy price is : " + flights[i].getEconomyClassPrice() + " "
							+ "Flight business price is : " + flights[i].getBusinessClassPrice() + " "
							+ "is flight is domestic : " + flights[i].isDomestic());
					point = true;
				} else {
					point = false;
				}
			}
			if (point == false)
				System.out.println("flight is not avilable");
		}
	}
}
/*
 * if(point==false) {System.out.println("Starting point not found");
 * 
 * }
 */
