package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.hotel.Hotel;
import com.xworkz.xworkzapp.hotel.HotelDTO;
import com.xworkz.xworkzapp.hotel.Location;

public class HotelUtil {
	public static void main(String[] args) {
		String[] foodItems= {"chicken kabab","Biriyani","Roti","palak Paneer"
				,"Jamun","kesaribath","Rasmali","Paani puri","Chitanna","mosaranna","ice cream"};

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		Hotel hotel=new Hotel(size);
		
		for (int i = 0; i < size; i++) 
		{
			HotelDTO dto=new HotelDTO();
			System.out.println("enter the hotel name");
			String name=sc.next();
			System.out.println("enter the owner name");
			String ownerName=sc.next();
			System.out.println("enter set type");
			String type=sc.next();
			System.out.println("service type");
			String serviceType=sc.next();
			
			dto.setName(name);
			dto.setOwnerName(ownerName);
			dto.setLocation(Location.Jayanagar);
			dto.setService(serviceType);
			dto.setType(serviceType);
			dto.setFoodItems(foodItems);
			hotel.addHotelDetails(dto);
			hotel.searchByHotelNameByLocationAndName(Location.Jayanagar, "Jayanna");
			hotel.returnOwnerNameByHotelName(name);
			hotel.displayAllDetails();
			
			
		}
		
	}

}
