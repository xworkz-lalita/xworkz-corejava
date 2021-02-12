package com.xworkz.xworkzapp.products;

import com.xworkz.xworkzapp.buyers.Customers;
import com.xworkz.xworkzapp.onlineshop.Flipkart;

public class Tester {
	public static void main(String[] args) {
		
Flipkart flipkart=new FlipkartImpl();
System.out.println(flipkart);
Customers customer=new Customers(flipkart);
System.out.println(customer.id);
customer.acceptBooking();
	}

}
