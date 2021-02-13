package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DoorNumber {
	public static void main(String[] args) {
		Collection<Long> doorNo = new ArrayList<Long>();// by making it as hashset we can remove duplicates
		doorNo.add(121l);
		doorNo.add(98l);
		doorNo.add(121l);
		doorNo.add(87l);
		doorNo.add(234l);
		doorNo.add(657l);
		doorNo.add(420l);
		doorNo.add(98l);
		doorNo.add(121l);
		doorNo.add(786l);
		doorNo.add(1l);
		System.out.println(doorNo);
		System.out.println(doorNo.size());

		Collection<Long> dn = new ArrayList<Long>();
		Iterator<Long> iterator = doorNo.iterator();
		 System.out.println(doorNo.size());

		while (iterator.hasNext()) {
			//System.out.println("duplication");
			Long doorNos = iterator.next();
			System.out.println(doorNos);

			if (dn.contains(doorNos)) {
				System.out.println("duplicates door nos are" + doorNos);
			} else {
				System.out.println(dn.add(doorNos));
			}
		}
		System.out.println("duplicates numbers" + dn.size());
		
	doorNo.clear();
		
		Iterator<Long> it=doorNo.iterator();
		while(it.hasNext()) {
			
			dn.add(it.next());
			}
			System.out.println("the current elements are"+dn.size());
			
		
	}
}

