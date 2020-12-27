package com.xworkz.xworkzapp;


import com.xworkz.xworkzapp.flightbooking.Flight;
import com.xworkz.xworkzapp.flightbooking.FlightBookingDTO;

public class FlightBookingUtil {
	public static void main(String[] args) {
		Flight f=new Flight();
		FlightBookingDTO flight=new FlightBookingDTO();
		flight.setCode(1222222222l);
		flight.setCompany("Valencia");
		flight.setStartingPoint("bengaluru");
		flight.setDestination("Mangaluru");
		flight.setTotalSeats(50);
		flight.setDomestic(true);
		flight.setBusinessClassPrice(1000.00);
		flight.setEconomyClassPrice(500);
		
		FlightBookingDTO flightOne=new FlightBookingDTO();
		flightOne.setCode(122224554554545l);
		flightOne.setCompany("wwmfg");
		flightOne.setStartingPoint("bengaluru");
		flightOne.setDestination("bellary");
		flightOne.setTotalSeats(30);
		flightOne.setDomestic(true);
		flightOne.setBusinessClassPrice(999.00);
		flightOne.setEconomyClassPrice(400.00);
		
		 f.addFlightsBookingdetails(flight);
		 f.addFlightsBookingdetails(flightOne);
		/*FlightBookingDTO[] flightDTOs = f.displayAllDetails();
		for (int j = 0; j < flightDTOs.length; j++) 
		 {
			System.out.println(flightDTOs[j].getCode() + " "+flightDTOs[j].getCompany()+" "+flightDTOs[j].getStartingPoint()+" "+flightDTOs[j].getDestination()+" "+flightDTOs[j].getTotalSeats()+" "+flightDTOs[j].isDomestic()+" "+flightDTOs[j].getEconomyClassPrice()+" "+flightDTOs[j].getBusinessClassPrice());
		}*/
		f.displayAllDetails();
		System.out.println(flight.getCode() + " "+flight.getCompany()+" "+flight.getStartingPoint()+" "+flight.getDestination()+" "+flight.getTotalSeats()+" "+flight.isDomestic()+" "+flight.getEconomyClassPrice()+" "+flight.getBusinessClassPrice());
		System.out.println(flightOne.getCode() + " "+flightOne.getCompany()+" "+flightOne.getStartingPoint()+" "+flightOne.getDestination()+" "+flightOne.getTotalSeats()+" "+flightOne.isDomestic()+" "+flightOne.getEconomyClassPrice()+" "+flightOne.getBusinessClassPrice());
	}
	

}
