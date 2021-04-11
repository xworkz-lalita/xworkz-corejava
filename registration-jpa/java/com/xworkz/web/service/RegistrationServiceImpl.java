package com.xworkz.web.service;

import java.util.List;

import javax.persistence.NoResultException;

import com.xworkz.web.entity.RegistrationEntity;
import com.xworkz.web.repository.RegistrationRepo;
import com.xworkz.web.repository.RegistrationRepoImpl;

public class RegistrationServiceImpl implements RegistrationService {
	private RegistrationRepo<RegistrationEntity> repo = new RegistrationRepoImpl();

	public RegistrationServiceImpl() {
		System.out.println("Created service");
	}

	@Override
	public boolean validateAndSave(RegistrationEntity entity) {
		RegistrationEntity registrationEntity = entity;
		boolean valid = false;
		if (registrationEntity != null) {
			String name = registrationEntity.getName();
			if (name != null && !name.isEmpty() && name.length() > 1 && name.length() <= 20) {
				System.out.println("name is valid");
				valid = true;
			} else {
				System.out.println("name is invalid");
				valid = false;
			}

			if (valid) {
				String phoneNo = registrationEntity.getPhoneNo();
				if (phoneNo != null && !phoneNo.isEmpty() && phoneNo.length() >= 10) {
					System.out.println("phone number is valid");
					valid = true;
				} else {
					System.out.println("phone number is invalid");
					valid = false;
				}
			}
			if (valid) {
				String email = registrationEntity.getEmail();
				if (email != null && !email.isEmpty() && email.contains("@") && email.contains("gmail.com")) {
					System.out.println("email is valid");
					valid = true;
				} else {
					System.out.println("email is not valid");
					valid = false;
				}
			}
			if (valid) {
				String company = registrationEntity.getCompany();
				if (company != null && !company.isEmpty() && company.length() <= 20) {
					System.out.println("company is valid");
					valid = true;
				} else {
					System.out.println("company is invalid");
					valid = false;
				}
			}
			if (valid) {
				System.out.println("can invoke repository");
				repo.persist(registrationEntity);
			} else {
				System.out.println("data is invalid,cannot save");
			}
		}
		return valid;
	}

	
	  @Override
	  public RegistrationEntity validateAndFindByName(String name) {
	  System.out.println("invoked validate and search by name");
	  try{if (name != null&& !name.isEmpty() && name.length() > 1 && name.length() < 20) {
	  System.out.println("name is valid");
	  RegistrationEntity entity =this.repo.findByName(name);
	  System.out.println("registartion entity " + entity);
	  return entity; 
	  }else {
		  System.out.println("name is invalid,cannot found ");
		  return null;
	  }}catch (NoResultException e) {

		  return null;
	  
	  
	  }}

	@Override
	public RegistrationEntity validateAndFindByEmail(String email) {
		  System.out.println("invoked validate and search by email");
		 try { 
		if (email!=null&&!email.isEmpty()&&email.contains("@")&&email.contains("gmail.com")) {
		  System.out.println("email is valid");
		  RegistrationEntity entity =this.repo.findByEmail(email);
		  System.out.println("registartion entity " + entity);
		  return entity; 
		  }else {
			  System.out.println("email is invalid,cannot found ");
			  return null;
		  }}catch (NoResultException e) {

		  return null;
	}

	 
	}

	@Override
	public List<RegistrationEntity> getAll() {
	System.out.println("invoked getAll from service");
	return this.repo.findAll();
	}
}
