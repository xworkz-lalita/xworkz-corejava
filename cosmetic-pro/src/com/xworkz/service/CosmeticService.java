package com.xworkz.service;

import com.xworkz.dto.CosmeticDTO;

public interface CosmeticService {
boolean validateAndSave(CosmeticDTO cosmeticDTO);
boolean deleteByBrand(String brand);
int cosmeticSize();
}
