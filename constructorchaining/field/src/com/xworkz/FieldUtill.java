package com.xworkz;

import com.xworkz.field.Field;

public class FieldUtill {

	public static void main(String[] args) {
		Field fl=new Field();
		fl.setArea(9.23f);
		fl.setLocation("bellary");
		fl.setId(324647879l);
		System.out.println(fl.getArea()+" "+fl.getLocation()+" "+fl.getId());

	}

}
