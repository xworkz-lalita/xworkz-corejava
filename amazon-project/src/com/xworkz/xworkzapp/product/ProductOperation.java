package com.xworkz.xworkzapp.product;

public class ProductOperation {
	public ProductDTO[] productDTOs;
	
	public int index;
	
	public ProductOperation(int size)
	{
		productDTOs=new ProductDTO[size];
		
	}
	 public void addProductDetails(ProductDTO dto)
	 {
		 System.out.println("the product details are");
		 productDTOs[index++]=dto;//by instance variable we can access the index value
		 
		 
	 }
	 public void displayProductDetails() {
	   for(ProductDTO product:productDTOs)
		   if(product!=null){
			   System.out.println(product.getId()+" "+product.getName()+" "+product.getCategory()+" "+product.getPrice());
			   System.out.println("the product details are added");
		   }
		   else {
			   System.out.println("please add the product details");
		   }

}}
