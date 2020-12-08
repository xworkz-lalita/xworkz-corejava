package com.xworkz.stringhome;

import java.awt.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringArray {
	public void main(String[] args) 
	{String[] strArray3 = { "R", "S", "T", "T" };
	List stringList = (List) Arrays.asList(strArray3);
	Set<String> stringSet = new HashSet<String>( );
	System.out.println( "The size of the list is: " + stringList.size() );
	System.out.println( "The size of the set is: " + stringSet.size() );
	}

}
