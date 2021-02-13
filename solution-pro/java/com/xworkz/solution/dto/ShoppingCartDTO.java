package com.xworkz.solution.dto;

public class ShoppingCartDTO {
private String itemName;
private int quantity;
private double price;
public ShoppingCartDTO() {
}

public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "ShoppingCartDTO [itemName=" + itemName + ", quantity=" + quantity + ", price=" + price + "]";

}
@Override
public boolean equals(Object obj) {
if(obj==null)
	return false;
if(obj instanceof ShoppingCartDTO) {
	ShoppingCartDTO caste=(ShoppingCartDTO)obj;
	//if(caste.getItemName().equals(getItemName())&&caste.getPrice()==caste.getPrice()) {
	if(this.itemName.equals(getItemName())&&this.price==caste.getPrice()) {
		System.out.println("the items are" +caste.itemName);
		return true;
	}
}

return false;
}


}
