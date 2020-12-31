package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.hotel.Hotel;
import com.xworkz.xworkzapp.hotel.HotelDTO;
import com.xworkz.xworkzapp.hotel.constants.Location;

public class HotelUtil {
public static void main(String[] args) {
		
		Hotel hotel=new Hotel();
		
		HotelDTO hdto=new HotelDTO();
		String[] food= {"chicken kabab","Biriyani","Roti","palak Paneer","Jamun","kesaribath","Rasmali","Paani puri","Chitanna","mosaranna","ice cream"};

		hdto.setName("Baa guru uta maadu");
		hdto.setLocation(Location.VIJAYANAGAR);
		hdto.setOwnerName("gayathri");
		hdto.setSerivce("self service");
		hdto.setType("veg");
		hdto.setFooditems(food);
		
		
		HotelDTO h=new HotelDTO();
		String[] fo= {"chicken kabab","Biriyani","Roti","palak Paneer","Jamun","kesaribath","Rasmali","Paani puri","Chitanna","mosaranna","ice cream"};

		h.setName("Mane Uta");
		h.setLocation(Location.JAYANAGAR);
		h.setOwnerName("Gousiya");
		h.setSerivce("Plate service");
		h.setType("Non-veg");
		h.setFooditems(fo);
		
		hotel.addHotelDetails(hdto);
		hotel.addHotelDetails(h);
		hotel.showAllHotelDetails();
		
		hotel.searchHotelbyLocationAndName(Location.VIJAYANAGAR, "Baa guru uta maadu");
		
		hotel.returnOwnerNameByHotelName("Mane Uta");
		
		
	}


}
