package com.xworkz.service;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.constants.CosmeticShades;
import com.xworkz.constants.CosmeticType;
import com.xworkz.cosmetic.CosmeticDAO;
import com.xworkz.cosmetic.CosmeticDAOImpl;
import com.xworkz.dto.CosmeticDTO;

public class CosmeticServiceTester {
	public static void main(String[] args) {
		CosmeticDTO dto=new CosmeticDTO();
		dto.setBrand("Maybellin");
		dto.setType(CosmeticType.Primer);
		dto.setShades(CosmeticShades.Light);
		dto.setPrice(1000.00);
		dto.setQuantity(100);
		
		// list can be anything
		List<CosmeticDTO> list=new LinkedList<CosmeticDTO>();
		
		// the dao implementation taking list as a parameter 
		CosmeticDAO dao=new CosmeticDAOImpl(list);
		
		// the serviceimplementation  taking parameter dao, because the implementation may differ user by user it is also called as 
		// loose coupling
		// String ="xworkz" but we should give reference as a parameter
		CosmeticService service=new CosmeticServiceImpl(dao);
		long start=System.nanoTime();
		service.validateAndSave(dto);
		long end=System.nanoTime();
		long execution=(end-start);
		System.out.println("execution time " +execution+ " nanoSeconds");
		
		//creating another cosmeticDTO
		CosmeticDTO dto1=new CosmeticDTO("Nykaa",CosmeticShades.Dark,CosmeticType.Foundation,999.00,2);
	  service.validateAndSave(dto1);
	  
	  
	 System.out.println(service .cosmeticSize()); 
	 System.out.println(service.deleteByBrand("Nykaa")); 
	  System.out.println(service .cosmeticSize());
	  
	  
	  }

}
