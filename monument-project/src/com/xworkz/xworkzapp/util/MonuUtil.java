package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.monuments.ArtGallery;
import com.xworkz.xworkzapp.monuments.MonumentsDTO;

public class MonuUtil {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		ArtGallery ag=new ArtGallery(size);
		for(int i=0;i<size;i++) {
			MonumentsDTO m=new MonumentsDTO();
		System.out.println("enter the"+(i+1)+"details");
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the id");
		long id=sc.nextLong();
		m.setName(name);
		m.setId(id);
		ag.addDetails(m);
		ag.showAllDetails();
		
	}
		sc.close();

}}
