package com.xworkz.church;

public class Church {
public String name;
public String address;
public int noOfFathersAndSister;

public Church() 
{
	System.out.println("object is created");
}
public Church(String name,String address,int noOfFathersAndSister )
{
	this.name=name;
	this.address=address;
	this.noOfFathersAndSister=noOfFathersAndSister;
	}
public String getName()
{
	return name;
	}
public void setName(String name) {
this.name=name;
}
public String getAddress()
{
	return address;
	}
public void setAddress(String address) {
this.address=address;
}
public int getNoOfFathersAndSisters()
{
	return noOfFathersAndSister;
	}
public void setNoOfFathersAndSisters(int noOfFathersAndSister) {
this.noOfFathersAndSister=noOfFathersAndSister;
}
}
