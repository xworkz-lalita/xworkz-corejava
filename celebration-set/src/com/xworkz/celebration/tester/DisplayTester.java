package com.xworkz.celebration.tester;

import service.DisplayService;
import service.DisplayServiceImpl;

public class DisplayTester {
	public static void main(String[] args) {

		DisplayService service=new DisplayServiceImpl();
		
		service.printString(l->{
			System.out.println("validating"+l);
			
			if(l.contains("a") || l.contains("A"))
			{
				System.out.println(l+ " "+l.hashCode());
			}
		});
	}

}
