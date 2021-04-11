package com.xworkz.waterfalls.tester;

import com.xworkz.waterfalls.dao.WaterDao;
import com.xworkz.waterfalls.dao.WaterDaoImpl;
import com.xworkz.waterfalls.entity.WaterFallsEntity;
import com.xworkz.waterfalls.sfsinglton.SFUtil;

public class WaterTester {
	public static void main(String[] args) {
		
		  WaterFallsEntity entity=new WaterFallsEntity(); 
		  entity.setName("Gokarna");
		  entity.setLocation("Gokak"); 
		  entity.setDepth(900);
		  entity.setHeight(1142); 
		  entity.setDestination("Ocean");
		  entity.setEletricityGenerated(false);
		  entity.setEntryFees(20);
		  entity.setNoOfDeath(2);
		  entity.setNoOfVisitors(1000);
		  entity.setSourceRiver(1); 
		  entity.setRating(3);
		  
		  WaterDao dao=new WaterDaoImpl(); 
		  dao.create(entity);
		 

		//WaterDao dao = new WaterDaoImpl();
		/* dao.deleteById(2); */

		/* dao.updateHeightAndDepthById(1, 2000, 1212); */
		//WaterFallsEntity entity = dao.getById(1);
		//System.out.println(entity);
	}
}
