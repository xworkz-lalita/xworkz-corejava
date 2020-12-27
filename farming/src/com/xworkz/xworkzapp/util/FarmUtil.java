package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.farm.FarmDTO;
import com.xworkz.xworkzapp.farm.Operation;

public class FarmUtil {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int size =sc.nextInt();
	Operation operation =new Operation(size);
	
	for(int i=0; i<size; i++) {
		FarmDTO dto=new FarmDTO();//to set the values we need to create the object,dto is passing by value
		System.out.println("enter the "+(i+1)+"Farm details");
		System.out.println("Enter the soil type");
		String typeOfSoil=sc.next();// used to give data at run time,the string type is returned
		System.out.println("Enter the  area");
		String area =sc.next();
		System.out.println("Enter the type of crop");
		String typeOfCrop=sc.next();
	
		dto.setTypeOfSoil(typeOfSoil);	
		dto.setArea(area);
		dto.setTypeOfCrop(typeOfCrop);
		operation.addFarmDetails(dto);//
		
		operation.showAllFarmDetails();
		System.out.println("search by crop name");
		String crop=sc.next();
		operation.showFarmDetailsByArea(crop);
		System.out.println("search by area");
		String ar=sc.next();
		operation.showFarmDetailsBySoil(ar);
		System.out.println("search by soil name");
		String soil=sc.next();
		operation.showFarmDetailsByCrop(soil);
		
	
	}
	sc.close();
	
	//FarmDTO farmOne=new FarmDTO("black","2 acre","peanuts");
	//FarmDTO farmTwo=new FarmDTO("Red","1 acre","onion");
	//Operation operation =new Operation(40);
	//operation.addFarmDetails(farmOne);
	//operation.addFarmDetails(farmTwo);
	
}
}
