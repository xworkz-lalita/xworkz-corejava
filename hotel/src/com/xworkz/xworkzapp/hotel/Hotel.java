package com.xworkz.xworkzapp.hotel;

public class Hotel {
	HotelDTO[] hotel;
	public Hotel(int size){
		hotel=new HotelDTO[size];	}
	public int index;
	 
	public void addHotelDetails(HotelDTO hotel) {
		if(hotel.getName()!=null&&hotel.getLocation()!=null) {
		System.out.println("hotel is : "+hotel.getName());
		this.hotel[index++]=hotel;
System.out.println("hote is added");
	} else {System.out.println("please provide hotel name and hote location");
		}
	}
	public void searchByHotelNameByLocationAndName(Location location,String name) {
		boolean point=false;
		for (int i = 0; i < hotel.length; i++) {
			if(hotel[i]!=null) {
				if(hotel[i].getLocation()!=null&&hotel[i].getName()!=null) {
					System.out.println(hotel[i].getName());
					point=true;
						
					}
				}else {
					point=false;
					
				}
				if(point==false) {System.out.println("hotel is not found");
					
				}
			}}
	public HotelDTO returnOwnerNameByHotelName(String name) {
		HotelDTO dto=null;
		for (int i = 0; i < hotel.length; i++) {
			if(hotel[i]!=null) {
				if(hotel[i].getName().equals(name)) {
					System.out.println("Owner name is : "+hotel[i].getOwnerName());
				}
			}else {
				System.out.println("owner not found");
			}
			
		}
		return dto;
		
	}
	public void displayAllDetails() {
		for (int i = 0; i < hotel.length; i++) {
			if(hotel[i]!=null) {
				System.out.println(hotel[i].getName()+" "+hotel[i].getOwnerName()+" "+hotel[i].getService()+" "+hotel[i].getLocation());
			String[] foodItems=hotel[i].getFoodItems();
			for (String string : foodItems) {
				System.out.println(string);
			}
			}else {
				System.out.println("please add all details");
				
			}
				
			}
			
		}
	}

