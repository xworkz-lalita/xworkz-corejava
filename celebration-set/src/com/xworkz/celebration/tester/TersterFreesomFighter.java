package com.xworkz.celebration.tester;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.celebration.dto.FreedomFighterDTO;
import com.xworkz.celebration.dto.FreedomFighterDTO.Gender;

public class TersterFreesomFighter {
public static void main(String[] args) {
		
		FreedomFighterDTO fighterDTO1=new FreedomFighterDTO("Bhagat Singh", "India", Gender.MALE);
		
		FreedomFighterDTO fighterDTO2=new FreedomFighterDTO("KRC", "India", Gender.FEMALE);

		FreedomFighterDTO fighterDTO3=new FreedomFighterDTO("OO", "India", Gender.FEMALE);
		
		FreedomFighterDTO fighterDTO4=new FreedomFighterDTO("SCB", "India", Gender.MALE);
		
		FreedomFighterDTO fighterDTO5=new FreedomFighterDTO("OO", "India", Gender.FEMALE);
		
		Set<FreedomFighterDTO> fighterDTOs=new HashSet<FreedomFighterDTO>();
		fighterDTOs.add(fighterDTO1);
		fighterDTOs.add(fighterDTO2);
		fighterDTOs.add(fighterDTO3);
		fighterDTOs.add(fighterDTO4);
		fighterDTOs.add(fighterDTO5);
		
		System.out.println(fighterDTOs.size());
		fighterDTOs.forEach(f->System.out.println(f.getName()));
		//test for commit
		
		
	}
}
