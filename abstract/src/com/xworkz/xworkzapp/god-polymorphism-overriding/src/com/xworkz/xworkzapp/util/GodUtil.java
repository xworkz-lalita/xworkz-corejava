package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.god.God;
import com.xworkz.xworkzapp.god.Shiva;

public class GodUtil {
	public static void main(String[] args) {
		
		/*
		 * God god=new Shiva(); //up casting Shiva shiva=(Shiva)god; // down casting- to
		 * call child class specific members god.bless(); System.out.println(god.place);
		 * shiva.bless(); System.out.println(shiva.place);
		 */
		
		/*
		 * Shiva shiva = new Shiva(); shiva.bless(); 
		 * shiva.place = "Murudeshwar" ;
		 * System.out.println(shiva.place);
		 */
		
		God god = new Shiva(); //up casting
		god.bless();
		System.out.println(god.place);
		
		Shiva gods=(Shiva)god;
		gods.blessing();
		gods.notBlessing();
	}

}
