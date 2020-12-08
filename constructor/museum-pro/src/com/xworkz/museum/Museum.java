package com.xworkz.museum;

public class Museum {
	//instance members
	public  int id;
	public  String name;
	public  String address;
	public 	int noOfFloors;
	
	public static String department;
	public Museum()
	{
		System.out.println("museum const with no arg created");
	}
	public Museum(int idOne,String nameOne,String addressOne,int noOfFloorsOne,String departmentOne)
	{
		System.out.println("museum const with  arg created");
		id=idOne;
	    name=nameOne;
		address=addressOne;
	    noOfFloors=noOfFloorsOne;
		department=departmentOne;
	}

}
