package com.xworkz.xwrkzapp.util;

import java.util.Scanner;

import com.xworkz.xwrkzapp.flight.Company;
import com.xworkz.xwrkzapp.flight.Flight;
import com.xworkz.xwrkzapp.flight.FlightDTO;

public class FlightUtil {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=sc.nextInt();
	Flight flight=new Flight(size);
	for (int i = 0; i < size; i++) {
		FlightDTO dto=new FlightDTO();
		System.out.println("enter the company code");
		int code=sc.nextInt();
		System.out.println("enter the company name");
		String company=sc.next();
		System.out.println("enter the starting point");
		String startingPoint=sc.next();
		System.out.println("enter the destination point");
		String destinationPoint=sc.next();
		System.out.println("enter the number of seats");
		int seats=sc.nextInt();
		System.out.println("enter the business class price");
		double businessPrice=sc.nextDouble();
		System.out.println("enter the economic price");
		double economicPrice=sc.nextDouble();

		dto.setCode(code);
		
		dto.setCompany(Company.DELTA);
		dto.setSeats(seats);
		dto.setStartingPoint(startingPoint);
		dto.setDestinationpoint(destinationPoint);
		dto.setStartingPoint(startingPoint);
		dto.setDestinationpoint(destinationPoint);
		dto.setBusinessPrice(businessPrice);
		dto.setEconomicPrice(economicPrice);
		
		
		
		flight.addFlightsDetails(dto);
		flight.searchByStartingPoint("bengalore");
		flight.displayAllFlightDetails();
		
		
	}
}
}
