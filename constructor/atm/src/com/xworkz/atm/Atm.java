package com.xworkz.atm;

public class Atm {
	public int id;
	public String name;
	public String address;
	public Atm(int cId,String cName,String cAddress)
	{
		id=cId;
		name=cName;
		address=cAddress;
	}
public Atm()
{
	System.out.println("no parameterd");
	}
}
