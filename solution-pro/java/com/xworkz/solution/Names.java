package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Names {
	public static void main(String[] args) {
		Collection<String> names = new ArrayList<String>();
		names.add("Omkar");
		names.add("Devendra");
		names.add("Nikunj");
		names.add("Vinay");
		names.add("Akshara");
		System.out.println(names);
		System.out.println(names.size());
		// for each

		/*
		 * for(String name:names) { System.out.println(name); if(name.equals("Omkar"))
		 * //names.remove(name);//parallely cant iterate and remove so its not good
		 * practice to use System.out.println("removed"); }
		 */

		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			// names.add(iterator.next());
			String name = iterator.next();//Omkar
			if (name.equals("Omkar") && names.contains("Vinay")) {
				iterator.remove();
				System.out.println("the name is removed" + name);
			}
		}
		/*
		 * if (names.contains("Nikunj")) { iterator.remove(); }
		 * System.out.println("the current elemnts  after removing Nikunj are" + names);
		 * 
		 * if (name.contains("Akshara")) { iterator.remove();
		 * System.out.println("the current elemnts are" + names); }
		 */

		// names.clear();
		// System.out.println(names); Iterate its names}
		System.out.println(names.size());
		System.out.println(names);// it doesnt iterates its names
		
		String valid="Raj Kumar";
		System.out.println(valid.contains("Raj"));
		

	}
}
