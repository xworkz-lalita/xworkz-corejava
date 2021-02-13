package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CollectionChacolates {
	/*
	 * private static ArrayList removeDuplicates(String parle) { ArrayList c=new
	 * ArrayList(); for (Object obj : parle) { if(!c.contains(obj)) { c.add(obj); }
	 * } return c;
	 */
	
	public static void main(String[] args) {

		String parle = "Kiss me";
		String compco = "Milky Bar";
		String cadbury = "Dailry milk";
		String nestle = "KitKat";
		String amul = "Dark Chacolate";
		String lotus = "chuckles";
		String mars = "Snikers";
		
		Collection chocolates=new ArrayList();
		boolean added = false;
		added = chocolates.add(mars);
		System.out.println(added);
		added = chocolates.add(parle);
		System.out.println(added);
		added = chocolates.add(compco);
		System.out.println(added);
		added = chocolates.add(nestle);
		System.out.println(added);
		added = chocolates.add(amul);
		System.out.println(added);
		added = chocolates.add(lotus);
		System.out.println(added);
		System.out.println(chocolates);
		
		int fin = chocolates.size();
		System.out.println("size" +fin);
		
		String harshyes="Harsheys kiss";
		
		boolean removed=chocolates.remove(null);
		System.out.println("removed : "+removed);
		
		String ref=null;
		if(ref!=null) {
		System.out.println(ref.toString());
		//return true;
		}
			added=chocolates.add(null);
			System.out.println(added);
		 added=chocolates.add(null);
		 System.out.println(added);
		 //return false;
		 int fi = chocolates.size();
			System.out.println(fi);
			chocolates.remove(parle);
			System.out.println(chocolates.size());
		 chocolates.add(parle);
		 chocolates.add(parle);
		 System.out.println(chocolates.size());
		 int f = chocolates.size();
			System.out.println(f);
//			 
		 
			/*
			 * ArrayList cArrayList=CollectionChacolates.removeDuplicates(parle);
			 * System.out.println(cArrayList);
			 */
			/*
			 * System.out.println("looping chocolates");
			 * 
			 * Object[] convertedChocolates = chocolates.toArray(); for (int i = 0; i <
			 * convertedChocolates.length; i++) {
			 * System.out.println(convertedChocolates[i]); }
			 */

			System.out.println("looping using iterator********************");

			Iterator iterator = chocolates.iterator();
			//hasNext(),next();remove();
			while (iterator.hasNext()) {
				System.out.println("element present");
				Object str = iterator.next();
				System.out.println(str);

		
	}
	}
}
