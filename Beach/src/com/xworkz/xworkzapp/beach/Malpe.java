package com.xworkz.xworkzapp.beach;

public class Malpe extends Beach {

	/*public Malpe(String place, int noOfCafe, int noOfBoats) {
		super(place, noOfCafe, noOfBoats);
        
	}*/ //when we initialise the values through block we dont need use of constructor
    public void enjoy(int noOfCafe)
    {
    	System.out.println("entering to enjoy");
    	super.noOfCafe=noOfCafe;
    	System.out.println(noOfCafe);
    	super.enjoyWithFriends();//super class method
    	System.out.println("end of enjoy");
    }
  /*  {//block it override it executes first
    int noOfCafe=98;
    String place="goa";
    super.place=place;
    super.noOfCafe=noOfCafe;
   System.out.println(noOfCafe);
   System.out.println(place);
}*/
}
