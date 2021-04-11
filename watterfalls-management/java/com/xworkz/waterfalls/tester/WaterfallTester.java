package com.xworkz.waterfalls.tester;

import com.xworkz.waterfalls.dao.SearchWaterDAO;
import com.xworkz.waterfalls.dao.SearchWaterFallDAOImpl;
import com.xworkz.waterfalls.entity.WaterFallsEntity;

public class WaterfallTester {
public static void main(String[] args) {
	SearchWaterDAO dao=new SearchWaterFallDAOImpl();
	//String loc=dao.findByLocationByName("Gokarna");
	//System.out.println(loc);
	//WaterFallsEntity entity=dao.findByLocationAndName("Gokarna","Gokak");
	//System.out.println(entity);
// int no=dao.findNoOfDeathsByLocationAndName("Gokak","Gokarna");
// System.out.println(no);
	Object[] objs=dao.findNoOfDeathsAndDestinationByLocationAndName("Gokarna","Gokak");
	System.out.println(objs[0]);
	System.out.println(objs[1]);
}
}
