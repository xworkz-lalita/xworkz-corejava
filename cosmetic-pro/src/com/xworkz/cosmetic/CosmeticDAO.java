package com.xworkz.cosmetic;

import java.util.List;

import com.xworkz.constants.CosmeticType;
import com.xworkz.dto.CosmeticDTO;


public interface CosmeticDAO {
 
	public boolean save(CosmeticDTO dto);
	public boolean updatePriceByBrandAndType(String brand,CosmeticType type);
	public boolean updateTypeByBrand(String brand);
	public boolean deleteByBrand(String brand);
	public void deleteAll();
	public List<CosmeticDTO> getAll();
	public int totalSize();
}

