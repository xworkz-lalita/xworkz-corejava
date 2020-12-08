package com.xworkz.util;

import com.xworkz.supermarket.SuperMarket;

public class SuperMarketUtil {
	
	public static void main(String[] args) 
	{
		
	SuperMarket sp=new SuperMarket();
	sp.setName("Amma Super market");
	sp.setAddress("M G road");
	sp.setId(45);
	sp.setItems(5980);
	System.out.println(sp.getName()+" "+sp.getAddress()+" "+sp.getId()+" "+sp.getItems());
	}
}
