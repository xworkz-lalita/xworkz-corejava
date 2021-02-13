package com.xworkz.magzines.dto;

public class MagzineDTO {
	private String name;
	private Double price;
	private int noOfPages;

	public MagzineDTO() {
	}

	
	public MagzineDTO(String name, Double price, int noOfPages) {
		super();
		this.name = name;
		this.price = price;
		this.noOfPages = noOfPages;
	}


	public String getName() {
		return name;
	}


	public Double getPrice() {
		return price;
	}


	public int getNoOfPages() {
		return noOfPages;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}


	@Override
	public String toString() {
		return "MagzineDTO [name=" + name + ", price=" + price + ", noOfPages=" + noOfPages + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
	if(obj==null) {
		return false;}
	if(obj instanceof MagzineDTO) {
		MagzineDTO casted=(MagzineDTO)obj;
		if(casted.getName()!=null) {
			if(casted.getName().equals(name)) {
				System.out.println("obj is equal");
				return true;
			}
		}
	}
	return false;
	}
	
	
}

