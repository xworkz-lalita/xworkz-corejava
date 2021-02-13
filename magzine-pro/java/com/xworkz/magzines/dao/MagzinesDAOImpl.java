package com.xworkz.magzines.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.magzines.dto.MagzineDTO;

public class MagzinesDAOImpl implements MagzineDAO {
 private List<MagzineDTO> magzine;
	
	public MagzinesDAOImpl(List<MagzineDTO> magzine) {
 this.magzine=new ArrayList<MagzineDTO>();
	}
	
	@Override
	public boolean save(MagzineDTO dto) {
    boolean saved=false;
    boolean contains=this.magzine.contains(dto);
    if(!contains) {
    	saved=this.magzine.add(dto);
    }if(saved) {
    	System.out.println("magzineDTO is added"+dto);
    }else {
    	System.out.println("magzineDTo is not present ");
    }
		return false;
	}

	
	  @Override
	  public boolean updatePriceByName(String name, Double price) {
		System.out.println("invoked update by price");
	   for (MagzineDTO magzineDTO : magzine) {
		if(magzineDTO.getName().equals(name)) {
			System.out.println("can update price");
			magzineDTO.setPrice(price);
			System.out.println(magzineDTO);
			return true;
		}else {System.out.println("cannot update");
		
		}
	}
	return false;}
	  
 @Override 
 public boolean findByName(String name) {
	 System.out.println("invoked by find by name");
	 for (MagzineDTO magzineDTO : magzine) {
		if(magzineDTO.getName().equals(name)) {
			System.out.println("can find");
			System.out.println(magzineDTO);
		return true;
		}
	 else {System.out.println("cannot find");
	 }}
	return false;
	  }
	 
	 @Override 
	 public List<MagzineDTO> getAll() { 
			 System.out.println("can get all dtos"+magzine);
		return this.magzine;
		}

	@Override
	public void deleteAll() {
	System.out.println("invoked   delete all");
	magzine.removeAll(magzine);
	System.out.println("magzines are");
		
	}}
	 

