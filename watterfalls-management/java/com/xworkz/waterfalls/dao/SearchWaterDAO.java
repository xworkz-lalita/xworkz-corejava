package com.xworkz.waterfalls.dao;

import com.xworkz.waterfalls.entity.WaterFallsEntity;

public interface SearchWaterDAO {
public WaterFallsEntity findByLocationAndName(String name,String location);
public String findByLocationByName(String name);
public int findNoOfDeathsByLocationAndName(String location,String name);
public Object[] findNoOfDeathsAndDestinationByLocationAndName(String name, String location);
}
