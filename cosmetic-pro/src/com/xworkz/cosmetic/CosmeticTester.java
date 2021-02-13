package com.xworkz.cosmetic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.constants.CosmeticShades;
import com.xworkz.constants.CosmeticType;
import com.xworkz.dto.CosmeticDTO;
import com.xworkz.service.CosmeticService;
import com.xworkz.service.CosmeticServiceImpl;

public class CosmeticTester {
	public static void main(String[] args) {
		CosmeticDTO dto1 = new CosmeticDTO();
		dto1.setBrand("MAC");
		dto1.setType(CosmeticType.Eyeliner);
		dto1.setPrice(200.00);
		dto1.setShades(CosmeticShades.Light);
		dto1.setQuantity(100);

		dto1.setType(CosmeticType.Eyeliner);
		dto1.setPrice(200.00);
		dto1.setShades(CosmeticShades.Light);
		dto1.setQuantity(100);
		System.out.println(dto1);
		
		List<CosmeticDTO> list=new LinkedList<CosmeticDTO>();// any list can be given like array list or linked list

		CosmeticDAO dao = new CosmeticDAOImpl(list) ;// implementation object creation by that we are adding the dtos  and saving
		dao.save(dto1);
		CosmeticDTO dto2 = new CosmeticDTO("lakme", CosmeticShades.Dark, CosmeticType.Eyeliner, 233.00, 22);
		dao.save(dto2);
		CosmeticDTO dto3 = new CosmeticDTO("lakme", CosmeticShades.Dark, CosmeticType.Eyeliner, 233.00, 22);
		dao.save(dto3);
		CosmeticDTO dto4 = new CosmeticDTO("Mac", CosmeticShades.Dark, CosmeticType.Foundation, 233.00, 22);
		dao.save(dto4);

		
		List<CosmeticDTO> cosmeticDTOs=new ArrayList<CosmeticDTO>();//adding it in list
		cosmeticDTOs.add(dto1);
		cosmeticDTOs.add(dto2);
		cosmeticDTOs.add(dto3);
		
		
		
		
		
		boolean price = dao.updatePriceByBrandAndType("lakme", CosmeticType.Eyeliner);
		System.out.println(price);
		boolean type = dao.updateTypeByBrand("lakme");
		System.out.println(type);
		boolean delete = dao.deleteByBrand("lakme");
		System.out.println(delete);
		dao.deleteAll();
		System.out.println(dao.getAll());
		int ss = dao.totalSize();
		System.out.println(ss);
	}

}
