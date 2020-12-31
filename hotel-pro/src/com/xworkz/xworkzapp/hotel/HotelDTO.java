package com.xworkz.xworkzapp.hotel;

import com.xworkz.xworkzapp.hotel.constants.Location;

public class HotelDTO {
	private String name;
	private Location location;
	private String ownerName;
	private String type;
	private String serivce;
	private String[] fooditems;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSerivce() {
		return serivce;
	}
	public void setSerivce(String serivce) {
		this.serivce = serivce;
	}
	public String[] getFooditems() {
		return fooditems;
	}
	public void setFooditems(String[] fooditems) {
		this.fooditems = fooditems;
	}
	
}
