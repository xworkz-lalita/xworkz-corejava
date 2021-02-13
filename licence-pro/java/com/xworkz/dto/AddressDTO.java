package com.xworkz.dto;

public class AddressDTO {
	private int doorNumber;
	private int pincode;
	private String street;
	private String area;
	private String state;
	private String buildingName;
	private String country;

	public AddressDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param doorNumber
	 * @param pincode
	 * @param street
	 * @param area
	 * @param state
	 * @param buildingName
	 * @param country
	 */
	public AddressDTO(int doorNumber, int pincode, String street, String area, String state, String buildingName,
			String country) {
		super();
		this.doorNumber = doorNumber;
		this.pincode = pincode;
		this.street = street;
		this.area = area;
		this.state = state;
		this.buildingName = buildingName;
		this.country = country;
	}

	@Override
	public String toString() {
		return "AddressDTO [doorNumber=" + doorNumber + ", pincode=" + pincode + ", street=" + street + ", area=" + area
				+ ", state=" + state + ", buildingName=" + buildingName + ", country=" + country + "]";
	}
}
