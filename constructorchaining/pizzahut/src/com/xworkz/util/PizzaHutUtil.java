package com.xworkz.util;

import com.xworkz.pizzahut.PizzaHut;

public class PizzaHutUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaHut ph =new PizzaHut();
		ph.setId(9);
		ph.setName("sun");
		ph.setAddress("sunkadakatte");
		ph.setItems(15);
		ph.setBranch(2);
		System.out.println(ph.getId()+" "+ph.getName()+" "+ph.getAddress()+" "+ph.getItems()+" "+ph.getBranch());

	}

}
