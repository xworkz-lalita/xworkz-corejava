package com.xworkz.waterfalls.dao;

import java.util.List;

import com.xworkz.waterfalls.entity.StateEntity;

public interface StateDAO {
public void create(List<StateEntity> entities);
public List<StateEntity> findAll();
public List<Integer> findAllIds();
public List<Object[]> findAllIdAndName();
public void updatePopulationByName(String name,int population);
public StateEntity findById(int id);
public void deleteById(int id);
	
}
