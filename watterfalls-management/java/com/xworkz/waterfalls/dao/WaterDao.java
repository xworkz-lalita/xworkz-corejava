package com.xworkz.waterfalls.dao;

import com.xworkz.waterfalls.entity.WaterFallsEntity;

public interface WaterDao {
	public void create(WaterFallsEntity entity);

	public void deleteById(int id);

	public void updateHeightAndDepthById(int id, double height, double depth);

	public WaterFallsEntity getById(int id);
	
	
}
