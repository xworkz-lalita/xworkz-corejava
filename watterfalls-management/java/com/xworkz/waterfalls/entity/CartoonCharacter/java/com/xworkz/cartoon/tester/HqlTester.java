package com.xworkz.cartoon.tester;

import com.xworkz.cartoon.dao.CartoonDAO;
import com.xworkz.cartoon.dao.CartoonDAOImpl;
import com.xworkz.cartoon.entity.CartoonEntity;
import com.xworkz.cartoon.entity.CartoonEntity.ChannelName;

public class HqlTester {
public static void main(String[] args) {
	CartoonDAO dao=new CartoonDAOImpl();
	//CartoonEntity entity=dao.findByName("Oggy");
	//System.out.println(entity);
	CartoonEntity entity2=dao.findByChannelAndLanguage(ChannelName.Chitti,"Tamil");
	System.out.println(entity2);
}
}
