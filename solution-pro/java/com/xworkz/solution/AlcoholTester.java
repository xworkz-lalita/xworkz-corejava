package com.xworkz.solution;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.solution.dto.AlcoholDTO;

public class AlcoholTester {
	public static void main(String[] args) {
		AlcoholDTO alcoholDTO1 = new AlcoholDTO("IB", "Imperial", 48);

		AlcoholDTO alcoholDTO2 = new AlcoholDTO("Amstel", "King Fisher", 4);

		AlcoholDTO alcoholDTO3 = new AlcoholDTO("Magic Moments", "NA", 38);

		AlcoholDTO alcoholDTO4 = new AlcoholDTO("Old Monk", "NA", 42);

		List<AlcoholDTO> dto = new ArrayList<AlcoholDTO>();
		dto.add(alcoholDTO1);
		dto.add(alcoholDTO3);
		dto.add( alcoholDTO4);
		dto.add(alcoholDTO2);
		// dto.remove(alcoholDTO1);//override tostring()
		// dto.remove(2);// cannot ovveride toString()

		/*
		 * AlcoholDTO alcoholDTO5 = new AlcoholDTO("Bud Wiser", "King Fisher", 8);
		 * dto.add(alcoholDTO5);
		 */
		System.out.println(dto);
		System.out.println(dto.size());

		System.out.println(dto.indexOf(alcoholDTO1));// override string method
		System.out.println(dto.lastIndexOf(alcoholDTO2));// override string method

		for (AlcoholDTO alcoholDTO : dto) {
			System.out.println(alcoholDTO);
		}

	}
}
