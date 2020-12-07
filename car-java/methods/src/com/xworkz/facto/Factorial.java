package com.xworkz.facto;

public class Factorial {
	public static void main(String a[])
	{
	 myFact(99);
	}
	static void myFact(double nm)
	{
	double fact=1;
	for(int i=1; i<=nm;i++)
	{
	fact=fact*i;
	}
	System.out.println(fact);
	}

}
