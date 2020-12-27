package com.xworkz.xworkzapp;

import java.util.Scanner;

import com.xworkz.xworkzapp.product.ProductDTO;
import com.xworkz.xworkzapp.product.ProductOperation;

public class ProUtil {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
	    ProductOperation opp=new ProductOperation(size);
         for(int i=0;i<size;i++)
         {
        	 ProductDTO pd=new ProductDTO();
        	 System.out.println("enter the "+(i+1)+"details");
        	 System.out.println("enter product id");
        	long id= sc.nextLong();
        	 System.out.println("enter product name");
        	 String name=sc.next();
        	 System.out.println("enter the category");
        	 String category=sc.next();
        	 System.out.println("enter price");
        	double price= sc.nextDouble();
        	 pd.setId(id);
        	 pd.setName(name);
        	 pd.setCategory(category);
        	 pd.setPrice(price);
        	 opp.addProductDetails(pd);
        	 opp.displayProductDetails();
         }
         sc.close();
	}

}
