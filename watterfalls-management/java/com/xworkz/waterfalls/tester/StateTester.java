package com.xworkz.waterfalls.tester;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;

import com.xworkz.waterfalls.dao.StateDAO;
import com.xworkz.waterfalls.dao.StateDAOImpl;
import com.xworkz.waterfalls.entity.StateEntity;

public class StateTester {
	public static void main(String[] args) {
		/*
		 * StateEntity entity = new StateEntity("Karnataka", "Kannada", 7, 31);
		 * StateEntity entity2 = new StateEntity("AndraPradesh", "Telugu", 6, 21);
		 * 
		 * List<StateEntity> en = new ArrayList<StateEntity>(); // en.add(entity); //
		 * en.add(entity2);
		 * 
		 * StateDAO dao = new StateDAOImpl(); // dao.create(en); List<StateEntity>
		 * entity3 = dao.findAll(); // entity3.forEach(System.out::println);
		 * List<Integer> entity4 = dao.findAllIds(); //
		 * entity4.forEach(e->System.out.println(e)); // List<Object[]>
		 * entity5=dao.findAllIdAndName(); // System.out.println(List<entity[0]>); //
		 * dao.updatePopulationByName("AndraPradesh",5);
		 */
		StateDAO dao = new StateDAOImpl();
		//StateEntity entity6 = dao.findById(1);
		//System.out.println(entity6);
		//List<Object[]> entity5=dao.findAllIdAndName();
		//System.out.println(entity5);
		//dao.deleteById(2);
		List<Object[]> entity5=dao.findAllIdAndName();
		for (Object[] objects : entity5) {
			for (int i = 0; i < objects.length; i++) {
				System.out.println(objects[0]);
				System.out.println(objects[1]);
				
			}
			
		}
	}}
