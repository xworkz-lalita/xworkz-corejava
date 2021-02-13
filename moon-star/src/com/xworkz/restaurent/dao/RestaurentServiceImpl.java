package com.xworkz.restaurent.dao;

import java.util.LinkedList;
import java.util.List;
import com.xworkz.restaurent.dto.MenuDTO;
import com.xworkz.restaurent.dto.MenuDTO.Type;

public class RestaurentServiceImpl implements RestaurentService {

	private List<MenuDTO> menu;

	public RestaurentServiceImpl() {
		this.menu = new LinkedList<MenuDTO>();
		MenuDTO menu1 = new MenuDTO("Biriyani", 200.00, Type.NONVEG);
		MenuDTO menu2 = new MenuDTO("Sushi", 400.00, Type.NONVEG);
		MenuDTO menu3 = new MenuDTO("Chitanna", 100.00, Type.VEG);
		MenuDTO menu4 = new MenuDTO("Kadabu", 20.00, Type.VEG);
		MenuDTO menu5 = new MenuDTO("Kabab", 140.00, Type.NONVEG);
		menu.add(menu1);
		menu.add(menu2);
		menu.add(menu3);
		menu.add(menu4);
		menu.add(menu5);
	}

	@Override
	public void displayItemGreaterThan(double price) {
		System.out.println("invoked by item price");
		for (MenuDTO menuDTO : menu) {
			if (menuDTO.getPrice() >= price)
				System.out.println(menuDTO);

		}

	}

	@Override
	public void displayName(String name) {
		System.out.println("invoked by item name");
		for (MenuDTO menuDTO : menu) {
			if (menuDTO.getItemName().equals(name))
				System.out.println(menuDTO);

		}

	}

	@Override
	public void displayType(Type type) {
		System.out.println("invoked by type");
		for (MenuDTO menuDTO : menu) {
			if (menuDTO.getType().equals(type))
				System.out.println(menuDTO);
		}

	}

	@Override
	public void findAndDisplay(Finder finder) {
		System.out.println("invoked by find and display");
		for (MenuDTO menuDTO : menu) {
			if (finder.test(menuDTO,))// internally calls the test will be called  to test implementation
				System.out.println(menuDTO);
		}

	}

}
