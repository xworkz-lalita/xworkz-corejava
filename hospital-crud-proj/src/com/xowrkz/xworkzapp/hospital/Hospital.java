package com.xowrkz.xworkzapp.hospital;

public class Hospital {

	private String name;

	private ReceptionistDTO res;

	public PatientDTO[] patients = new PatientDTO[3];

	public int ind;

	public void addReceptionist(ReceptionistDTO res) {

		if (res != null) {
			this.res = res;
		}
	}
//  operation of the patients details
	public void addPatients(PatientDTO patients) {// to add the patients
		if (patients != null && patients.getPhoneNo() > 0) {// we have to do null check
			this.patients[ind++] = patients;// index value should be increased one by one

		} else if (patients == null) {
			System.out.println("Patient not added as it is null");
		}
	}
	
	
	public PatientDTO[] getAllPatients() {
		PatientDTO[] patientDTOs =null;//dummy variable creation for return type
		for (int i = 0; i < patients.length; i++) {//for loop to check all the patients details one by one
			if(patients[i] != null)//individual patient array
			{
				/*
				 * System.out.println(patients[i] .getName().concat(patients[i].getAddress())+
				 * ""+patients[i].getPhoneNo());
				 */
				patientDTOs	=this.patients;
			}
			else
			{
				System.out.println("Array is empty gube fill the data first ");
			}
		}
		return patientDTOs;
	}
	
	
	
	
	
	
	
	public void deletePatientByName(String name)
	{
		for (int i = 0; i < patients.length; i++) {
			if(patients[i] != null)
			{
				if(patients[i].getName().equals(name))
				{
					patients[i]= null;
				}
			}
		}
	}
	
	public void UpdatePatientByAddress(String address, String name)
	{
		for (int i = 0; i < patients.length; i++) {
			if(patients[i] != null)
			{
				if(patients[i].getAddress().equals(address))
				{
				   patients[i].setName(name);
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
