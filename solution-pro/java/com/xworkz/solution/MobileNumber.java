package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;

public class MobileNumber {
public static void main(String[] args) {
	Collection<Long> numbers=new ArrayList<Long>();
	numbers.add(9876543210l);
	numbers.add(7899359294l);
	numbers.add(8884634174l);
	numbers.add(8722498711l);
	numbers.add(9844595882l);
	for (Long no : numbers) {
		String mobileNumber=no.toString();
		Character last=mobileNumber.charAt(mobileNumber.length()-1);
		if (Integer.parseInt(last.toString()) > 3) {
			System.out.println("mobile number is greater" + mobileNumber);
		
		
	}}
}
}
