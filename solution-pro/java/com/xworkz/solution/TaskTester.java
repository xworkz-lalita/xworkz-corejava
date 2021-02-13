package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TaskTester {
	public static void main(String[] args) {
	Collection<Long> doorNos = new ArrayList<Long>();

	doorNos.add(115L);
	doorNos.add(420l);
	doorNos.add(840l);
	doorNos.add(420l);
	doorNos.add(100l);
	doorNos.add(31l);
	doorNos.add(420l);
	doorNos.add(31l);
	doorNos.add(729l);
	doorNos.add(370l);
	doorNos.add(370l);
	// convert to []
	// iterator

	Collection<Long> tempDoorNos = new ArrayList<Long>();
	Iterator<Long> iterator = doorNos.iterator();
	System.out.println("size of " + doorNos.size());
	while (iterator.hasNext()) {
		Long doorNo = iterator.next();// 115,420,420,34
		System.out.println("Door No :" + doorNo);
		if (tempDoorNos.contains(doorNo)) {
			System.out.println("duplicate door no" + doorNo);
		} else {
			System.out.println("added temp " + doorNo);
			tempDoorNos.add(doorNo);
		}

	}

	System.out.println("tempDoorNos size " + tempDoorNos.size());

	doorNos.clear();
//for each
	Iterator<Long> tempIterator=tempDoorNos.iterator();
	while(tempIterator.hasNext())
	{
		doorNos.add(tempIterator.next());
	}
	System.out.println("size of door nos"+doorNos.size());
}

}
