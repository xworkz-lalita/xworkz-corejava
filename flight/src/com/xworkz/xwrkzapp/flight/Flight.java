package com.xworkz.xwrkzapp.flight;

public class Flight {
	
	
	FlightDTO[] flight;
	public int index;
	public Flight(int size) {// while using scanner
	
		flight=new FlightDTO[size];
	}
	
	public void addFlightsDetails(FlightDTO flight){
		if(flight.getCode()!=0 && flight.getStartingPoint()!=null&&flight.getCompany()!=null){
		if(flight.getBusinessPrice()>=1000) {
			this.flight[index++]=flight;
			System.out.println("flight is: "+flight.getCompany());
		}else {
			System.out.println("flight is added");
		}
		}else {
			System.out.println("add the code, company name, satarting point");
		}}

	public FlightDTO searchByStartingPoint(String startingPoint) {
		FlightDTO dto=null;
		boolean point=false;
		for (int i = 0; i < flight.length; i++) {
			if(flight[i]!=null) {
				if(flight[i].getStartingPoint().equals(startingPoint)) {
					System.out.println("starting point is : "+flight[i].getStartingPoint());
					point=true;
				}
		}else {
			point=false;
			System.out.println("starting point is not found");
		}
	}
		return dto;
		
	}
	public void displayAllFlightDetails() {
		for (int i = 0; i < flight.length; i++) {
			if(flight[i]!=null) {
				System.out.println(flight[i].getCode()+" "+flight[i].getCompany()+" "+flight[i].getStartingPoint()+" "+
			flight[i].getDestinationpoint()+" "+flight[i].getSeats()+" "
				+flight[i].getBusinessPrice()+" "+flight[i].getEconomicPrice());
			}else {
					System.out.println("please fill the details");
				}
				
			}
			
		}
	}


