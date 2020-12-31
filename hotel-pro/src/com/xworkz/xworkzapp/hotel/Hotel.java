package com.xworkz.xworkzapp.hotel;

import com.xworkz.xworkzapp.hotel.constants.Location;

public class Hotel {
	HotelDTO[] hotel = new HotelDTO[2];
	public int index;

	public void addHotelDetails(HotelDTO hotel) {
		if (hotel.getName() != null && hotel.getLocation() != null) {
			System.out.println("hotel name : " + hotel.getName());
			this.hotel[index++] = hotel;
			System.out.println("hotel is added");

		} else {
			System.out.println("the food items should be greater than 10");
		}

	}

	public void showAllHotelDetails() {
		for (int i = 0; i < hotel.length; i++)
			if (hotel[i] != null) {
				System.out.println("hotel name is : " + hotel[i].getName() + "" + "Owner name is : "
						+ hotel[i].getOwnerName() + " " + "hotel Service is : " + hotel[i].getSerivce() + " "
						+ "hotel type is : " + hotel[i].getType() + " " + "location is : " + hotel[i].getLocation());
				String foodItems[] = hotel[i].getFooditems();

				for (String string : foodItems) {
					System.out.println(string);
				}

			} else
				System.out.println("please add all deatils");
	}

	public void searchHotelbyLocationAndName(Location location, String name) {
		boolean point = false;
		for (int i = 0; i < hotel.length; i++)
			if (hotel[i] != null)
				if (hotel[i].getLocation().equals(location) && hotel[i].getName().equals(name)) {
					System.out.println("hotel name is : " + hotel[i].getName() 
							+ " " + "Owner name is : " + hotel[i].getOwnerName() + " "
							+ "hotel Service is : " + hotel[i].getSerivce() + " " + "hotel type is : "
							+ hotel[i].getType() + " " + "location is : " + hotel[i].getLocation());
					String foodItems[] = hotel[i].getFooditems();

					for (String string : foodItems) {
						System.out.println(string);
					}
				} else {
					point = false;
				}
		{
			if (point == false) {
				System.out.println("hotel is not present");

			}
		}
	}

	public HotelDTO returnOwnerNameByHotelName(String name) {
		HotelDTO dto = null;
		for (int i = 0; i < hotel.length; i++) {
			if (hotel[i] != null)
				if (hotel[i].getName().equals(name)) {
					System.out.println("hotel name is : " + hotel[i].getName()  + " " + "Owner name is : " + hotel[i].getOwnerName() + " "
							+ "hotel Service is : " + hotel[i].getSerivce() + " " + "hotel type is : "
							+ hotel[i].getType() + " " + "location is : " + hotel[i].getLocation());
					String foodItems[] = hotel[i].getFooditems();

					for (String string : foodItems) {
						System.out.println(string);
					}
				}
		}
		return dto;
	}
}