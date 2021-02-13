package com.xworkz.cl;

public class Driving {
	
	private String name;
	private Vehicle vehicle;
	
	public Driving(String name,Vehicle vehicle) {
		this.name=name;
	    this.vehicle=vehicle;
	}
	public void driving() {
		System.out.println("driving by"+name);
		this.vehicle.move();
	}
	

}
