package com.xworkz.util;

import com.xworkz.atm.Atm;

public class AtmUtil {
	public static void main(String[] args) {
		Atm at=new Atm(1232,"SBI","Rajajinagar");//parameterised constructor
		Atm am=new Atm();// no parameterised
		System.out.println(am);
		System.out.println(at.id+" "+at.name+" "+at.address);
	}

}
