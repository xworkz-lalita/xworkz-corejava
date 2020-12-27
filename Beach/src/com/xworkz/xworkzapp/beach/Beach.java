package com.xworkz.xworkzapp.beach;

public class Beach {
	public String place;
	public int noOfCafe;
	public int noOfBoats;
	/*public Beach(String place, int noOfCafe,int noOfBoats) {
	this.place=place;
	this.noOfCafe=noOfCafe;
	this.noOfBoats=noOfBoats;
	}*/
	public Beach(){
		super();//because of "java.lang.object" ,by default any class we create we use super class(object class), beach inheriting object that is multilevel inheritence
	}
	public void enjoyWithFriends()
	{
		/*super();//we cant use the super keyword outside the method and block*/
		System.out.println("enjoying with friends");
	}

}
