package com.xworkz.solution.dto;

public class AlcoholDTO {
	private String name;
	private String brandName;
	private int spiritPercentage;
	public AlcoholDTO() {
	
	}
	/**
	 * @param name
	 * @param brandName
	 * @param spiritPercentage
	 */
	public AlcoholDTO(String name, String brandName, int spiritPercentage) {
		super();
		this.name = name;
		this.brandName = brandName;
		this.spiritPercentage = spiritPercentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getSpiritPercentage() {
		return spiritPercentage;
	}
	public void setSpiritPercentage(int spiritPercentage) {
		this.spiritPercentage = spiritPercentage;
	}
	@Override
	public String toString() {
		return "AlcoholDTO [name=" + name + ", brandName=" + brandName + ", spiritPercentage=" + spiritPercentage + "]";
	}
	 @Override
	public boolean equals(Object obj) {
	if(obj==null)
		return false;
	AlcoholDTO casted=(AlcoholDTO)obj;
	if(this.brandName.equals(casted.getBrandName())) {
		System.out.println("after "+casted);
		return true;
	}
	return false;
	}
	 
}
