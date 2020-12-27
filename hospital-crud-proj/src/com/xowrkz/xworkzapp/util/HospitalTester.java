package com.xowrkz.xworkzapp.util;

import com.xowrkz.xworkzapp.hospital.Hospital;
import com.xowrkz.xworkzapp.hospital.PatientDTO;
import com.xowrkz.xworkzapp.hospital.ReceptionistDTO;

public class HospitalTester {

	public static void main(String[] args) {

		Hospital hospital = new Hospital();

		ReceptionistDTO receptionistDTO = new ReceptionistDTO();
		receptionistDTO.setName("ManaSakshiya");
		hospital.addReceptionist(receptionistDTO);
		
		PatientDTO patients = new PatientDTO();
		patients.setAddress("Girinagar");
		patients.setName("giri");
		patients.setPhoneNo(9998887771L);
		
		PatientDTO patientsOne = new PatientDTO();
		patientsOne.setAddress("Anchepalya");
		patientsOne.setName("anche");
		patientsOne.setPhoneNo(9998987771L);
		
		PatientDTO patientsTwo = new PatientDTO();
		patientsTwo.setAddress("Jigni");
		patientsTwo.setName("jini");
		patientsTwo.setPhoneNo(9998487771L);
		
		hospital.addPatients(patients);
		hospital.addPatients(patientsOne);
		hospital.addPatients(patientsTwo);
		
		PatientDTO[] patientDTOs = hospital.getAllPatients();
		for (PatientDTO patientDTO : patientDTOs) {
			System.out.println(patientDTO.getName() + " "+ patientDTO.getAddress() + " "+ patientDTO.getPhoneNo());
		}

		
		
	hospital.UpdatePatientByAddress("Girinagar", "Giri Manga");
	
	PatientDTO[] patDtos = hospital.getAllPatients();
	for (PatientDTO patientDTO : patDtos) {
		System.out.println(patientDTO.getName() + " "+ patientDTO.getAddress() + " "+ patientDTO.getPhoneNo());
	}
	
	
	hospital.deletePatientByName("jini");
	
	PatientDTO[] Dtos = hospital.getAllPatients();
	for (PatientDTO patientDTO : Dtos) {
		System.out.println(patientDTO.getName() + " "+ patientDTO.getAddress() + " "+ patientDTO.getPhoneNo());
	}
	
	}
	
	

}
