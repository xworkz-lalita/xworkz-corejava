package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.river.Ganga;
import com.xworkz.xworkzapp.river.Kaveri;
import com.xworkz.xworkzapp.river.Tungabhadra;

public class RiverUtil {
public static void main(String[] args) {
	Ganga g=new Ganga();
	g.setBirthPlace("Gangotri");
	g.setType("long");
	g.setEndPlace("Bay Of Bengal");
	System.out.println(g.getBirthPlace()+ " "+g.getType()+" "+g.getEndPlace());
	
	Kaveri k=new Kaveri();
	k.setBirthPlace("Talakaveri");
	k.setType("medium");
	k.setEndPlace("Bay Of Bengal");
	System.out.println(k.getBirthPlace()+ " "+k.getType()+" "+k.getEndPlace());
	
 Tungabhadra t=new Tungabhadra();
	t.setBirthPlace("Hamsaladevi");
	t.setType("long");
	t.setEndPlace("Bay Of Bengal");
	System.out.println(t.getBirthPlace()+ " "+t.getType()+" "+t.getEndPlace());
}
}
