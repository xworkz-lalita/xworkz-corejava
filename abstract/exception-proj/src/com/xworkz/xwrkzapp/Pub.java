package com.xworkz.xwrkzapp;

public class Pub {
	
	
	public void enjoying(int age) throws PubException {
		if(age>18) {
		System.out.println("enter to pub");
	}
	else {
		throw new PubException();
	}
}}
