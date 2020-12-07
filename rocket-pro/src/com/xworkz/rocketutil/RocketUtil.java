package com.xworkz.rocketutil;
import java.util.Date;

import com.xworkz.rocket.Rocket;
public class RocketUtil {

	
	public static void main(String[] args)
	{
		Rocket rocket=new Rocket();
		rocket.setName("PSLV");
		rocket.setId(123);
		rocket.setDate(new Date());
		System.out.println(rocket.getName()+" "+rocket.getId()+" "+rocket.getDate());
		
		
	}

}
