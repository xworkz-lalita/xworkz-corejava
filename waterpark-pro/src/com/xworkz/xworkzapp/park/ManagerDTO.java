package com.xworkz.xworkzapp.park;

public class ManagerDTO {
	 private String name;
	 private long contactNo;
	 
	 
	public ManagerDTO(String name, long contactNo) {
		super();
		this.name = name;
		this.contactNo = contactNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNumber() {
		return contactNo;
	}
	public void setContactNumber(long contactNo) {
		this.contactNo = contactNo;
	}
	 

}
