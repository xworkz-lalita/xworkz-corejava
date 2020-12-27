package com.xworkz.xworkzapp.farm;

public class Operation {

	//instance (referncee) variables can be used anyehere inside non static method
	public FarmDTO[] farmDTOs;//to store the datas we create array to perform "crud" operation.and we need the reference variable. operation will be inside the methods

	public int index;

	public Operation(int size) {//constructor and size is given.
		farmDTOs = new FarmDTO[size];//the size shouldn't be fixed,
	}

	public void addFarmDetails(FarmDTO farmDTO) {// object stored in the array,to add array we create addfarmdetails method,data is in dto type where it has the datas in object form.and farm is passing value
		System.out.println("adding farm details");
		farmDTOs[index++] = farmDTO;//the data will come in dto and aaded to index and gain ad again it will increase
		System.out.println("added all farm details");

	}

	public void showAllFarmDetails()
	{
		for (FarmDTO farmDTO:farmDTOs) {
			if(farmDTO !=null)
			{
				System.out.println(farmDTO.getTypeOfSoil() +" "+ farmDTO.getArea() +" "+ farmDTO.getTypeOfCrop());
				}else {
					System.out.println("please add farm details");
				}
			
		}
	}
	public void showFarmDetailsByCrop(String typeOfCrop)
	{
		for (int i = 0; i < farmDTOs.length; i++) {
			if(farmDTOs[i]!=null) {
				if(farmDTOs[i].getTypeOfCrop().equals(typeOfCrop)) {
					System.out.println(farmDTOs[i].getTypeOfSoil()+" "+farmDTOs[i].getArea()+" "+farmDTOs[i].getTypeOfCrop());
					}else {
						System.out.println("please enter correct type of crop");
					}
			}}
			}
		public void showFarmDetailsByArea(String area)
		{
			for (int i = 0; i < farmDTOs.length; i++) {
				if(farmDTOs[i]!=null) {
					if(farmDTOs[i].getTypeOfCrop().equals(area)) {
						System.out.println(farmDTOs[i].getTypeOfSoil()+" "+farmDTOs[i].getArea()+" "+farmDTOs[i].getTypeOfCrop());
						}else {
							System.out.println("please enter correct area");
						}	}
				}}
			public void showFarmDetailsBySoil(String typeOfSoil)
			{
				for (int i = 0; i < farmDTOs.length; i++) {
					if(farmDTOs[i]!=null) {
						if(farmDTOs[i].getTypeOfCrop().equals(typeOfSoil)) {
							System.out.println(farmDTOs[i].getTypeOfSoil()+" "+farmDTOs[i].getArea()+" "+farmDTOs[i].getTypeOfCrop());
							}else {
								System.out.println("please add type of soil");
							}

					}	}}
		}
