package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.ward.CityWardDTO;
import com.xworkz.xworkzapp.ward.Ward;
import com.xworkz.xworkzapp.ward.constant.WardName;

public class WardUtil {
	public static void main(String[] args) {
		
		
		CityWardDTO city=new CityWardDTO();
		city.setWardName(WardName.RAJAJINAGAR);
		city.setWardNumber(28);
		city.setPopulation(50000);
		city.setCorporatorName("gousiya");
		city.setArea("25sq meters");
		
		CityWardDTO c=new CityWardDTO();
		c.setWardName(WardName.VIJAYANAGAR);
		c.setWardNumber(30);
		c.setPopulation(5434);
		c.setCorporatorName("siddaramyya");
		c.setArea("24sq meters");
		
	Ward cityWard=new Ward();
		
		cityWard.addCityWardtDetails(city);
		cityWard.addCityWardtDetails(c);
		
		
		cityWard.showAllWardDetails();
		cityWard.searchCityByWardNumber(2);
		cityWard.returnCorporatorByWardNumber(30);

	}
}
