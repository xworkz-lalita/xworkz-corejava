package com.xworkz.xworkzapp.ward;

import com.xworkz.xworkzapp.ward.constant.WardName;

public class CityWardDTO {
	private int wardNumber;
	private WardName wardName;
	private String corporatorName;
	private int population;
	private String area;
	

	public int getWardNumber() {
		return wardNumber;
	}
	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}
	public WardName getWardName() {
		return wardName;
	}
	public void setWardName(WardName wardName) {
		this.wardName = wardName;
	}
	public String getCorporatorName() {
		return corporatorName;
	}
	public void setCorporatorName(String corporatorName) {
		this.corporatorName = corporatorName;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	

}
