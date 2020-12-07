package com.xworkz.intwrap;

public class UserInfo 
{
	public static void main(String ar[])
	{
		String[] a=  {"127","34","32769"};
		
	for(int info=0; info<=a.length-1;info++)
	{
	short userInfo= Short.parseShort(a[info]);
	System.out.println(userInfo);
	}
	}

}
