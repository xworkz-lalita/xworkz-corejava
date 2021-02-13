package com.xworkz.magzines.service;

import com.xworkz.magzines.dto.MagzineDTO;

public interface MagzinesService {
	boolean validateAndSave(MagzineDTO magzineDTO);

}
