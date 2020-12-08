package com.xworkz.students.students;

public class Student {
	public String name;
	public int id;
	public  String college;

	public Student(String name, int id , String college) {

		this.name = name;
		this.id = id;
		this.college=college;

	}
	
	  public void details() { 
		  
		  System.out.println(name+" "+id+" "+college); }
	 

}
