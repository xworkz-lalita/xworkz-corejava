package com.xworkz.xworkzapp.buyers;

import com.xworkz.xworkzapp.onlineshop.Flipkart;
import com.xworkz.xworkzapp.onlineshop.Service;

public class Customers {
	
public Flipkart flipkart;
 public String id="xOry80";
 
 public Customers(Flipkart flipkart) {
	 this.flipkart=flipkart;

}
public void acceptBooking() {
	System.out.println("inside the online shopping");
	if( flipkart.easyReturn() && flipkart.cancellation()) {
		if(flipkart.range()>500) {
			System.out.println("continue searching the products");}
			else {
				System.out.println("stop searching the products");}
			
			if(flipkart.service() != null) {
				System.out.println("the service avilable to australia");
			}
			else {
				System.out.println("the service is not available to Australia");
			}
			if(flipkart.payment()!=null) {
				System.out.println("CashOnDelivery is avilable");
			}
			else {
				System.out.println("CashOnDelivery is not present");
				
			}	
			}
	else {
		System.out.println("free cancellation and easy return not avaliable");
	}
		}
		
	
}
 
 


