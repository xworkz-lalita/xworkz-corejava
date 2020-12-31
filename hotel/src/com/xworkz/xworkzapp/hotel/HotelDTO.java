package com.xworkz.xworkzapp.hotel;

public class HotelDTO {
	private String name;
	private Location location;
	private String ownerName;
	private String type;
	private String service;
	private String[] foodItems;
	
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
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String[] getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(String[] foodItems) {
		this.foodItems = foodItems;
	}

}
