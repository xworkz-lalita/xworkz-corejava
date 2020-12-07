package com.xworkz.util;

import com.xworkz.museum.Museum;

public class MuseumUtil {
public static void main(String[] args) {
	Museum museum=new Museum(1,"Rising Star","near Mg road",5,"Science dept");//constructor overloading
	Museum museum1=new Museum();
	System.out.println(museum1);
	System.out.println(museum.id+" "+museum.name+" "+museum.address);
}
}
