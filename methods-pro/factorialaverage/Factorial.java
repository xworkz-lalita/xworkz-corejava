package com.xworkz.factorialaverage;

public class Factorial
    {
	public static void main(String a[])
	{
	
		int f=myFact(3);
		int g=myFact(2);
		int r=myFact(1);
		double tt=Average.avg(23.98d,65.89d,98.00d);
		int total=f/g*r;
		System.out.println(tt);
		System.out.println(total);
	}
 static int myFact(int nm)
	{
		int fact=1;
		for(int i=1;i<=nm;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		return fact;
			
	}
	}


