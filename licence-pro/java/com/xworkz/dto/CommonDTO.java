package com.xworkz.dto;

import java.util.Date;

import com.xworkz.constants.BooldGroup;
import com.xworkz.constants.Gender;

public class CommonDTO {
	private String name;
	private int age;
	private AddressDTO address;
	private long mobileNumber;
	private BooldGroup bloodGroup;
	private Gender gender;
	private String dateOfBirth;

	public CommonDTO() {

	}

	/**
	 * @param name
	 * @param age
	 * @param address
	 * @param dateOfBirth
	 * @param mobileNumber
	 * @param bloodGroup
	 * @param gender
	 */
	public CommonDTO(String name, int age, AddressDTO address, long mobileNumber, BooldGroup bloodGroup, Gender gender,
			String dateOfBirth) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.mobileNumber = mobileNumber;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
	}

	/*
	 * @Override public String toString() { return "CommonDTO [name=" + name +
	 * ", age=" + age + ", address=" + address + ", mobileNumber=" + mobileNumber +
	 * ", bloodGroup=" + bloodGroup + ", gender=" + gender + ", dateOfBirth=" +
	 * dateOfBirth + "]"; }
	 */
}