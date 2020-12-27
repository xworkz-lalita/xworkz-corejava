package com.xworkz.util;

import com.xworkz.country.India;
import com.xworkz.country.SriLanka;

public class CountryUtil {
	public static void main(String a[])
	{India i=new India();
	i.setNoOfStates(36);
	i.setNoOfLanguages(780);
	i.setCapital("delhi");
	System.out.println(i.getNoOfStates()+" "+i.getNoOfLanguages()+" "+i.getCapital());
	SriLanka sl =new SriLanka();
	sl.setNoOfStates(9);
	sl.setNoOfLanguages(2);
	sl.setCapital("coloumbo");
	System.out.println(sl.getNoOfStates()+" "+sl.getNoOfLanguages()+" "+sl.getCapital());
//	India i=new India(36,780,"Delhi");
//SriLanka sl=new SriLanka(9,2,"colombo");
i.develop();
sl.develop();
//System.out.println(i.noOfStates+" "+i.noOfLanguages+" "+i.capital);
//System.out.println(sl.noOfStates+" "+sl.noOfLanguages+" "+sl.capital);
}}
