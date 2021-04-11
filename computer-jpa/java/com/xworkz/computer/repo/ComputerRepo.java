package com.xworkz.computer.repo;

import java.util.List;

import com.xworkz.computer.entity.ComputerEntity;

public interface ComputerRepo {
	public void persist(ComputerEntity entity);
	public ComputerEntity findByName(String name);
	public void DeleteById(int id);
	public List<ComputerEntity> getAll();
}
