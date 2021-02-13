package com.xworkz.dto;

import java.util.Date;

import com.xworkz.constants.BooldGroup;
import com.xworkz.constants.Gender;
import com.xworkz.constants.IdProof;
import com.xworkz.constants.VehicleType;

public class LicenceDTO extends CommonDTO {
	private IdProof idProof;
	private String idProofNumber;
	private VehicleType type;
	private boolean commercial;
	private boolean disability;
	private String startDate;

	public LicenceDTO() {
		super();
	}

	/**
	 * @param name
	 * @param age
	 * @param address
	 * @param mobileNumber
	 * @param bloodGroup
	 * @param gender
	 * @param dateOfBirth
	 */
	public LicenceDTO(String name, int age, AddressDTO address, long mobileNumber, BooldGroup bloodGroup, Gender gender,
			String dateOfBirth) {
		super(name, age, address, mobileNumber, bloodGroup, gender, dateOfBirth);

	}

	public void setIdProof(IdProof idProof) {
		this.idProof = idProof;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public IdProof getIdProof() {
		return idProof;
	}

	public String getIdProofNumber() {
		return idProofNumber;
	}

	public VehicleType getType() {
		return type;
	}

	public boolean isCommercial() {
		return commercial;
	}

	public boolean isDisability() {
		return disability;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}

	public void setIdProofNumber(String idProofNo) {
		this.idProofNumber = idProofNo;
	}

	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj instanceof LicenceDTO ) {
			LicenceDTO converted=(LicenceDTO)obj;
			if(this.idProofNumber!=null&&this.idProofNumber.contentEquals(converted.getIdProofNumber()))
				return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "LicenceDTO [idProof=" + idProof + ", idProofNumber=" + idProofNumber + ", type=" + type
				+ ", commercial=" + commercial + ", disability=" + disability + ", startDate=" + startDate + "]";
	}

	
}
