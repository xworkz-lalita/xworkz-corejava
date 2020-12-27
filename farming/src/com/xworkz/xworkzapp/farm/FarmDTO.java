package com.xworkz.xworkzapp.farm;//14 packages

public class FarmDTO {

	private String typeOfSoil;
	private String area;
	private String typeOfCrop;
	/*public FarmDTO(String typeOfSoil, String area, String typeOfCrop) //these are parameters or local variables
	                                                   //local,static,parameter,instance
	{
		super();
		this.typeOfSoil = typeOfSoil;
		this.area = area;
		this.typeOfCrop = typeOfCrop;
	}*/
	public String getTypeOfSoil() {
		return typeOfSoil;
	}
	public void setTypeOfSoil(String typeOfSoil) {
		this.typeOfSoil = typeOfSoil;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTypeOfCrop() {
		return typeOfCrop;
	}
	public void setTypeOfCrop(String typeOfCrop) {
		this.typeOfCrop = typeOfCrop;
	}
	
	//public void growCrop(String seeds)//it is also a variable
	
	

}
