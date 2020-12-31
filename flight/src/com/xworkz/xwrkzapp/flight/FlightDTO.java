package com.xworkz.xwrkzapp.flight;

public class FlightDTO {
private int code;
private Company company;
private String startingPoint;
private String destinationpoint;
private int seats;
private double businessPrice;
private double economicPrice;
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}
public String getStartingPoint() {
	return startingPoint;
}
public void setStartingPoint(String startingPoint) {
	this.startingPoint = startingPoint;
}
public String getDestinationpoint() {
	return destinationpoint;
}
public void setDestinationpoint(String destinationpoint) {
	this.destinationpoint = destinationpoint;
}
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
public double getBusinessPrice() {
	return businessPrice;
}
public void setBusinessPrice(double businessPrice) {
	this.businessPrice = businessPrice;
}
public double getEconomicPrice() {
	return economicPrice;
}
public void setEconomicPrice(double economicPrice) {
	this.economicPrice = economicPrice;
}

}
