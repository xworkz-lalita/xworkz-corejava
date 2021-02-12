package com.xworkz.xworkzapp.products;

import com.xworkz.xworkzapp.onlineshop.Flipkart;
import com.xworkz.xworkzapp.onlineshop.Payment;
import com.xworkz.xworkzapp.onlineshop.Service;

public class FlipkartImpl implements Flipkart{

	@Override
	public Payment payment() {
		
		return Payment.CashOnDelivery;
	}

	@Override
	public int range() {
		
		return 5000;
	}

	@Override
	public Service service() {
	
		return Service.Australia;
	}

	@Override
	public boolean cancellation() {
	
		return false;
	}

	@Override
	public boolean easyReturn() {
		
		return true;
	}
	

}
