package com.xworkz;

public class Add {
	public static void main(String a[])
	{
	double k =toAdd(3,4);
	System.out.println(k);
	int r=toAdd(6,7,8);
	System.out.println(r);
	}
	static double toAdd(int a,int b)
	{
		double p=a+b;
		return p;
		
		
	}
	static int toAdd(int c,int d , int e)
	{
		int n=c+d+e;
      return n ;
	}
}
