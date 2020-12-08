package com.xworkz.util;

import com.xworkz.library.Library;

public class LibraryUtil {
	public static void main(String[] args) {
		
		String[] sectionByAuthors= {"Abdul kalam","Sudha murthy"};
		
		Library lib=new Library("Gnanagangotri",sectionByAuthors,"private");
		
		for(String sectionByAuthor:sectionByAuthors)
		{
	 System.out.println(sectionByAuthor);
	}
		System.out.println(lib.name+" "+lib.type);
	}

}
