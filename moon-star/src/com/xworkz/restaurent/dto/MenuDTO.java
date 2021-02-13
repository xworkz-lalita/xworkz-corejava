package com.xworkz.restaurent.dto;

public class MenuDTO {

	private String itemName;
	private double price;
	private Type type;

	public enum Type {
		VEG, NONVEG
	}

	public MenuDTO() {

	}

	public MenuDTO(String itemName, double price, Type type) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.type = type;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "MenuDTO [itemName=" + itemName + ", price=" + price + ", type=" + type + "]";
	}

}
