package com.xworkz.newspaper.util;

import com.xworkz.newspaper.newspaper.IndianExpress;
import com.xworkz.newspaper.newspaper.TimesOfIndia;

public class NewsUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndianExpress ie = new IndianExpress();
		ie.setNoOfPages(12);
		ie.setLanguage("english");
		System.out.println(ie.getNoOfPages() + " " + ie.getLanguage());
		TimesOfIndia t = new TimesOfIndia();
		t.setNoOfPages(6);
		t.setLanguage("English");
		System.out.println(t.getNoOfPages() + " " + t.getLanguage());
//IndianExpress ie=new IndianExpress(12,"English");
//TimesOfIndia t=new TimesOfIndia(14,"English");
//System.out.println(ie.noOfPages+" "+ie.language);
//System.out.println(t.noOfPages+" "+t.language);
		t.knowledge();
		ie.knowledge();
	}

}
