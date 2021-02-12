package com.xworkz.xworkzapp;

import java.util.Scanner;

public class LightUtil {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in); 
		 System.out.println("enter type");
		 String type=sc.next(); 
		 ISwitch iswitch=LightFactory.getLight(type); 
		 if(iswitch!=null)
		 { iswitch.sOff(); iswitch.sOn();}
		 
		
		/*
		 * ISwitch iswitch=LightFactory.getLight("tube light");
		 * 
		 * if(iswitch!=null)
		 * 
		 * { iswitch.sOn(); iswitch.sOff(); }
		 */}
		
	
}
