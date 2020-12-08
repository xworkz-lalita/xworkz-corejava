
package com.xworkz.rocket;

import java.util.Date;

public class Rocket 
{
	private String name;
	private	int id;
	private Date date;
	//private	Date date=new Date();
	public Rocket()
	{
	
	}
	/*public Rocket(String name,int id)
 {
this.name=name;
this.id=id;

}*/ //Encapsulation- class shold be public ,data members be private,the data created are encapsulatedand we have getter and setter
public String getName()//no parameter with return type

{
	return name;}

public void setName(String name)//parameter but no return type
{
	this.name=name;
	}
public int getId()

{
	return id;}

public void setId(int id)
{
	this.id=id;
	}
public Date getDate()

{
	return date;}

public void setDate(Date date)
{
	this.date=date;
	}
}
