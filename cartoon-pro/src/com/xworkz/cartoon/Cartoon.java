package com.xworkz.cartoon;//default package java.lang ;package in some packages they are stored in rt.java files

public class Cartoon {
	public long id;
	public String name;
	public String language;
	//private String language;
	
	/*public Cartoon()// no parameter
	{
		this(123l, "english");
		
	}*/

	/*public Cartoon(long id, String name) // two parameterized

	{
		this.id = id;
		this.name = name;// this is used to naming conflict between local variable and instance variable
		// this.language=language;// this is used to call current class members
		System.out.println(this.id + " " + this.name);
	}*/

	public Cartoon(String language)// one parameterized
	{
		//this(123l, "english"); this() is called constructor chaining, used to communicate with one constructor to other constructor
		this.language = language;
	}

	
	/* public void entertainment()
	 *  { this();// it should be used inside the constructor only //System.out.println(); }
	 */
	public void entertainment(String langauge) 
	{ 
		this.language = langauge;
	
		
	}
	
}
