package com.xworkz.cosmetic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.constants.CosmeticType;
import com.xworkz.dto.CosmeticDTO;


public class CosmeticDAOImpl implements CosmeticDAO {


	private List<CosmeticDTO> cosmetics;// =new ArrayList<CosmeticDTO>(); 

	public CosmeticDAOImpl(List<CosmeticDTO> cosmeticDTOs) {// the constructor given the parameters because if any other user wants to
		                                                   //add their implementations                                                    
		//this.cosmetics = new ArrayList<CosmeticDTO>();
		System.out.println("implemented cosmeticDAOImpl");
		this.cosmetics=cosmeticDTOs;
	}

	@Override
	public boolean save(CosmeticDTO dto) {
		boolean saved = false;
		boolean contains = this.cosmetics.contains(dto);
		if (!contains) {
			saved = this.cosmetics.add(dto);
		}
		if (saved)
			System.out.println("cosmetics is saved" + dto);
		else
			System.out.println("cosmetics is not saved");
		return false;

	}

	@Override
	public boolean updatePriceByBrandAndType(String brand, CosmeticType type) {
		System.out.println("invoked by brand and type" + brand + " " + type);
		for (CosmeticDTO cosmeticDTO : cosmetics) {
			if (cosmeticDTO.getBrand().equals(brand) && cosmeticDTO.getType().equals(type)) {
				System.out.println("cosmetics are found");
				cosmeticDTO.setPrice(1000.00);
				System.out.println(cosmeticDTO);
				return true;
			} else {
				System.out.println("cosmetics are not found");

			}
		}
		return false;

	}

	@Override
	public boolean updateTypeByBrand(String brand) {
		System.out.println("invoked by brand " + brand);
		for (CosmeticDTO cosmeticDTO : cosmetics) {
			if (cosmeticDTO.getBrand().equals(brand)) {
				System.out.println("can update,cosmetics are found");
				cosmeticDTO.setType(CosmeticType.LipStick);
				System.out.println("after updating" + cosmeticDTO);
				return true;
			} else {
				System.out.println("cosmetics are not found");
			}

		}
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		System.out.println("invoked by brand");
		Iterator<CosmeticDTO> iterator = cosmetics.iterator();
		while (iterator.hasNext()) {
			CosmeticDTO dto = iterator.next();
			if (dto.getBrand().equals(brand)) {
				iterator.remove();
				return true;
			}
		}
		return false;

	}

	@Override
	public void deleteAll() {
		System.out.println("deleting all");
         cosmetics.removeAll(cosmetics);
		System.out.println(cosmetics);
	
	}

	@Override
	public List<CosmeticDTO> getAll() {
	System.out.println("invoked get all");
		return this.cosmetics;
	}

	@Override
	public int totalSize() {
		System.out.println("print the size");
		return this.cosmetics.size();
	}


		
	}


