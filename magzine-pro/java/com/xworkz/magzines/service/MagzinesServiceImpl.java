package com.xworkz.magzines.service;

import com.xworkz.magzines.dao.MagzineDAO;
import com.xworkz.magzines.dto.MagzineDTO;

public class MagzinesServiceImpl implements MagzinesService {
	private MagzineDAO magzine;
	public MagzinesServiceImpl(MagzineDAO magzine) {
	 this.magzine=magzine;
	}
	
	
	@Override
		public boolean validateAndSave(MagzineDTO magzineDTO) {
			boolean validData=false;
			if(magzineDTO!=null) {
				System.out.println("dto is not null,can validate data");
				String name=magzineDTO.getName();
				if(name!=null&&name.length()>=3&&!name.isEmpty()&&!name.contains(" ")) {
					System.out.println("name is valid");
					validData=true;
				}else {
					System.out.println("name is invalid");
					validData=false;
				}
	}
			if(validData) {
		double price=magzineDTO.getPrice();
		if(price!=0&&price>=30) {
			System.out.println("price is valid");
			validData= true;
		}else {
			System.out.println("price is inavlid");
			validData=false;
		}
		}
			if(validData) {
				int noOfPages=magzineDTO.getNoOfPages();
				if(noOfPages!=0&&noOfPages>10) {
					System.out.println("noOfpages are valid");
					validData=true;
				}else {
					System.out.println("noOfpages are invalid");
					validData=false;
				}
			}
	
	if(validData) {
		System.out.println("dto is valid can implement");
	}else {
		System.out.println("dto is not valid");
	}
	return false;
}}
