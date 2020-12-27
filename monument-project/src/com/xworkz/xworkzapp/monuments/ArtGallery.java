package com.xworkz.xworkzapp.monuments;

public class ArtGallery {
	public MonumentsDTO[] monumentsDTOs;
	public int index;
	public ArtGallery(int size) {
		monumentsDTOs=new MonumentsDTO[size];	
	}
	public void addDetails(MonumentsDTO monuments)
	{
		System.out.println("adding the monument details");
		monumentsDTOs[index++]=monuments;
	}
	public void showAllDetails()
	{
		for(MonumentsDTO monu:monumentsDTOs)
		if(monu!=null){
			System.out.println(monu.getName()+" "+monu.getId());
			System.out.println("monuments details are added");
		}
		else {
			System.out.println("please add monuments deatils");
		}
	}

}
