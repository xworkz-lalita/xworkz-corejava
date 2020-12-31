package com.xworkz.xworkzapp.ward;

public class Ward {
	public CityWardDTO[] city= new CityWardDTO[5] ;
	public int index;
	
	public void addCityWardtDetails(CityWardDTO city) {
	
		if( city.getPopulation() != 0 && city.getWardNumber() !=0 && city.getWardName() != null)
		{
			if( city.getPopulation()>=5000) {
				System.out.println("city ward is : "+city.getWardName());
				this.city[index++] = city;
				System.out.println("city ward is added");
			
		}
			else {
			System.out.println(" population should be greater than 5000");
			}
		}
		else{
			System.out.println("please fill the details");
		}
		
	}
	
	public void showAllWardDetails() {
		for(int i=0;i<city.length;i++)   {
			if (city[i] != null) {
				System.out.println("ward number is : "+city[i].getWardNumber()+" "+"ward name is : "+
			city[i].getWardName()+" "+" corporator name is :"+" "+
				city[i].getCorporatorName()+" "+"population is"+city[i].getPopulation()+" "+"area is : "+city[i].getArea());
			System.out.println("showAll method ended");
				}
			} 
			}
		
	public void searchCityByWardNumber(int wardNumber) {
		boolean point=false;
		for(int i=0;i<city.length;i++) {
			if(city[i]!=null) {
				if(city[i].getWardNumber()==wardNumber)
				{
					System.out.println("ward number is : "+city[i].getWardNumber()+" "+"ward name is : "+
					city[i].getWardName()+" "+" corporator name is :"+" "+
	city[i].getCorporatorName()+" "+"population is"+city[i].getPopulation()+" "+"area is : "+city[i].getArea());

				}else {
					point=false;
				}
					
			}
					if(point==false)
				{System.out.println("city is not avilable");}
			}
		}

		public CityWardDTO returnCorporatorByWardNumber(int wardNumber) {
			CityWardDTO dto=null;
			for(int i=0;i<city.length;i++) {
				 if(city[i] != null) {
					 dto = city[i];
					 if(city[i].getWardNumber()==wardNumber) {
					 System.out.println(city[i].getCorporatorName());
				 }
		}
		
	}
			return dto;

}}
