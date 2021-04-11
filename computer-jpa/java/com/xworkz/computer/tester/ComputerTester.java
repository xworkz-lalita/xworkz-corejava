package com.xworkz.computer.tester;

import java.util.List;

import com.xworkz.computer.entity.ComputerEntity;
import com.xworkz.computer.repo.ComputerRepo;
import com.xworkz.computer.repo.ComputerRepoImpl;

public class ComputerTester {
public static void main(String[] args) {
	ComputerEntity entity1=new ComputerEntity(1,"HP","Hp","30000","Os");
	ComputerEntity entity2=new ComputerEntity(2,"Dell","dell","40000","Os");
	ComputerEntity entity3=new ComputerEntity(3,"Apple","MAC","90000","MAC");
	ComputerRepo repo=new ComputerRepoImpl();
	//repo.persist(entity1);
	//repo.persist(entity2);
	//repo.persist(entity3);
	ComputerEntity entity4=repo.findByName("HP");
	//System.out.println(entity4);
	//repo.DeleteById(3);
	List<ComputerEntity> entity=repo.getAll();
	System.out.println(entity);
}
}
