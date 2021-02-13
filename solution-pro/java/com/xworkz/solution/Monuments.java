package com.xworkz.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Monuments {
public static void main(String[] args) {
List<String> monuments=new ArrayList<String>();
monuments.add("TajMahal");
monuments.add("CharMinar");
monuments.add("Statue of Liberty");
monuments .add("Vidhan Souda");
monuments.add("Mysore palace");
monuments.add("hampi");
ListIterator<String> iterator=monuments.listIterator(2);
while(iterator.hasNext())
System.out.println(iterator.next());

System.out.println("==========================================================================");
ListIterator<String> iterator1=monuments.listIterator(5);
while (iterator1.hasPrevious()) {
	System.out.println(iterator1.previous());	
}
}
}
