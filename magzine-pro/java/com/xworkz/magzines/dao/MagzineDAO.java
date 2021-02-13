package com.xworkz.magzines.dao;

import java.util.List;

import com.xworkz.magzines.dto.MagzineDTO;

public interface MagzineDAO {
	boolean save(MagzineDTO dto);

	
	 boolean updatePriceByName(String name, Double Price);
	 
	 boolean findByName(String name);
	 
	  public List<MagzineDTO> getAll();
	  
	  void deleteAll();
	  
	 
}