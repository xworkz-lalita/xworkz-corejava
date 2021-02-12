package com.xworkz.xwrkzapp;

public class Tester {
	public static void main(String[] args) //throws ClassNotFoundException 
	{
		//Class.forName("com.xworkz.xwrkzapp.Peacock");
		Pub pub =new Pub();
		try {
			pub.enjoying(1);	
		}
		catch(PubException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			}
		}
		
	}


