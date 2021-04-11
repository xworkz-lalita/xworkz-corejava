package com.xworkz.cartoon.tester;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.xworkz.cartoon.dao.CartoonDAO;
import com.xworkz.cartoon.dao.CartoonDAOImpl;
import com.xworkz.cartoon.entity.CartoonEntity;
import com.xworkz.cartoon.entity.CartoonEntity.ChannelName;
import com.xworkz.util.util.SFUtil;

public class CartoonTester {

	public static void main(String[] args) {
		/*
		 * CartoonEntity entity1 = new CartoonEntity("Jerry", "Tom And Jerry",
		 * ChannelName.CartoonNetwork, "Hindi"); CartoonEntity entity2 = new
		 * CartoonEntity("Shizuka", "Doremon", ChannelName.Disney, "Hindi");
		 * CartoonEntity entity3 = new CartoonEntity("Heidi", "Heidi",
		 * ChannelName.Chintu, "Kannda"); CartoonEntity entity4 = new
		 * CartoonEntity("Bheem", "Chota Bheem", ChannelName.CartoonNetwork, "English");
		 * CartoonEntity entity5 = new CartoonEntity("Doremon", "Doremon",
		 * ChannelName.Disney, "Hindi"); CartoonEntity entity6 = new
		 * CartoonEntity("Shinchan", "Sinchan", ChannelName.Nick, "English");
		 * CartoonEntity entity7 = new CartoonEntity("Tom", "Tom And Jerry",
		 * ChannelName.CartoonNetwork, "Hindi"); CartoonEntity entity8 = new
		 * CartoonEntity("Dora", "Dora", ChannelName.Chintu, "Kannada");
		 */
		CartoonEntity entity8 = new CartoonEntity("Panda", "Kung Fu The Panda", ChannelName.Chitti, "Tamil");
		List<CartoonEntity> entities = new ArrayList<CartoonEntity>();
		/*
		 * entities.add(entity1); entities.add(entity2); entities.add(entity3);
		 * entities.add(entity4); entities.add(entity5); entities.add(entity6);
		 * entities.add(entity7); entities.add(entity8);
		 */
		//entities.add(entity8);
		CartoonDAO dao = new CartoonDAOImpl();
		dao.saveAll(entities);

	}
}