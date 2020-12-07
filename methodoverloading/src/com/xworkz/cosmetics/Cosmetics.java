package com.xworkz.cosmetics;

public class Cosmetics {
	 static double price;
	String name;
	String color;
	String brand;
	String id;
	 void makeOver()
	{
	System.out.println("party");
	}
	public static void main(String a[])
	{
		Cosmetics.price=89888.87;
		System.out.println(price);
	Cosmetics cos= new Cosmetics();
	cos.price=999.99;
	cos.name="kajal";
	cos.color="black";
	cos.brand="lakme";
	cos.id="lac 123";
	System.out.println(cos.price);
	System.out.println(cos.name);
	System.out.println(cos.color);
	System.out.println(cos.brand);
	System.out.println(cos.id);
	cos.makeOver();
	}}
		



