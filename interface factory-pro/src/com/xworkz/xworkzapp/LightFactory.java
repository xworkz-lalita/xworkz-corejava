package com.xworkz.xworkzapp;

public class LightFactory {
	
public static ISwitch getLight(String type)
{
	if(type.equalsIgnoreCase("tubelight")) {
		return new TubeLightImpl();
	}
else if(type.equalsIgnoreCase("discolight"))
		{
	return new DiscoLightImpl();
	}
else {
	System.out.println("no light found");
	return null;
}}
}
