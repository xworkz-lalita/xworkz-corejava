package com.xworkz.restaurent.dao;


import com.xworkz.restaurent.dto.MenuDTO.Type;

public interface RestaurentService {
	
	public void displayItemGreaterThan(double price);
	public void displayName(String name);
	public void displayType(Type type);
  public void findAndDisplay(Finder finder);
	

	
}
