package com.xworkz.restaurent.dao;

import com.xworkz.restaurent.dto.MenuDTO;
import com.xworkz.restaurent.dto.MenuDTO.Type;

public class FinderImpl implements Finder {

	@Override
	public boolean test(MenuDTO dto) {
		System.out.println("invoked test");
		return true;
	}

}
