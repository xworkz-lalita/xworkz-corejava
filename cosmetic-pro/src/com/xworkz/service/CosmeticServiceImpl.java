package com.xworkz.service;

import com.xworkz.constants.CosmeticShades;
import com.xworkz.constants.CosmeticType;
import com.xworkz.cosmetic.CosmeticDAO;
import com.xworkz.cosmetic.CosmeticDAOImpl;
import com.xworkz.dto.CosmeticDTO;

public class CosmeticServiceImpl implements CosmeticService {
  
	private CosmeticDAO cosmeticDAO;
	
public CosmeticServiceImpl(CosmeticDAO cosmeticDAO) {
	System.out.println("created cosmeticsserviceImpl");
	this.cosmeticDAO=cosmeticDAO;
	}

	@Override
	public boolean validateAndSave(CosmeticDTO cosmeticDTO) {
		boolean validData=false;
		if(cosmeticDTO!=null) {
			System.out.println("dto is not null,can validate data");
			String brand=cosmeticDTO.getBrand();
			if(brand!=null&&brand.length()>=3&&!brand.isEmpty()&&!brand.contains(" ")) {
				System.out.println("brand is valid");
				validData=true;
			}else {
				System.out.println("brand is invalid");
				validData=false;
			}
			if(validData) {
				CosmeticType type=cosmeticDTO.getType();
				if(type!=null) {
					System.out.println("type is valid");
					validData=true;
				}else {
					System.out.println("type is invalid");
					validData=false;
				}}
				if(validData) {
					CosmeticShades shades=cosmeticDTO.getShades();
					if(shades!=null) {
						System.out.println("shades is valid");
						validData=true;
					}else {
						System.out.println("shades is invalid");
						validData=false;
					}}
					
					if(validData) {
						double price=cosmeticDTO.getPrice();
						if(price>0) {
							System.out.println("price is valid");
							validData=true;
						}else {
							System.out.println("price is invalid");
							validData=false;
						}}
							if(validData) {
							int quantity=cosmeticDTO.getQuantity();
								if(quantity>0&&quantity<=100) {
									System.out.println("quantity is valid");
									validData=true;
								}else {
									System.out.println("quantity is invalid");
									validData=false;
								}}
						
				
				if(validData) {
					System.out.println("data is valid can invoke dao");
					//CosmeticDAO dao=new CosmeticDAOImpl();
		            cosmeticDAO.save(cosmeticDTO);
				}
			
		}else {
			System.out.println("dto is null ,cannot validata data");
		}
	
	
		return false;

}

	@Override
	public boolean deleteByBrand(String brand) {
	System.out.println("Invoked delete by brand");
	if(brand!=null&&!brand.isEmpty()&&!brand.equals(" ")&&brand.length()>=3) {
		System.out.println("brand is valid ,can delete");
		this.cosmeticDAO.deleteByBrand(brand);
		return true;
	}else {
		System.out.println("can't delete the brand");
		}
	return false;
	}
	@Override
	public int cosmeticSize() {
		
		return this.cosmeticDAO.totalSize();
	}
}