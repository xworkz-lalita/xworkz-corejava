package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.solution.dto.ShoppingCartDTO;

public class ShoppingCartTester {
	public static void main(String[] args) {
 ShoppingCartDTO dto1=new ShoppingCartDTO();
 dto1.setItemName("kurta");
 dto1.setPrice(2000.00);
 dto1.setQuantity(1);
 ShoppingCartDTO dto2=new ShoppingCartDTO();
 dto2.setItemName("Shoe");
 dto2.setPrice(1000);
 dto2.setQuantity(1);
 ShoppingCartDTO dto3=new ShoppingCartDTO();
 dto3.setItemName("jeans");
 dto3.setPrice(1999);
 dto3.setQuantity(1);
 
 Collection<ShoppingCartDTO> cart=new ArrayList<ShoppingCartDTO>();
 cart.add(dto1);
 cart.add(dto2);
 cart.add(dto3);
 ShoppingCartDTO dto4=new ShoppingCartDTO();
 dto4.setItemName("jeans");
 dto4.setPrice(2670);
 dto4.setQuantity(1);
 boolean contain=cart.contains(dto4);
 System.out.println("the contained :"+contain);
 if(contain) {
	 System.out.println("the present cart");
 }else {
	 System.out.println("please add the cart");
	 cart.add(dto4);
 }
System.out.println(cart.size());



//  for (ShoppingCartDTO shoppingCartDTO : cart) {
//  if(shoppingCartDTO.getItemName().equals(shoppingCartDTO.getItemName())) {
//  System.out.println("kurta is in cart"); } else {
//  System.out.println("kurta is not in cart, can add");
//  } }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	/*
	 * Collection<String> countrys=new ArrayList<String>(); countrys.add("INDIA");
	 * countrys.add("AUSTRALIA");
	 * 
	 * System.out.println(countrys.contains("INDIA"));
	 * 
	 */
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 }

}
