package com.xworkz.web.service;

import java.util.List;

import com.xworkz.web.entity.RegistrationEntity;

public interface RegistrationService {
	public boolean validateAndSave(RegistrationEntity entity);
	public RegistrationEntity validateAndFindByName(String name);
	public RegistrationEntity validateAndFindByEmail(String email);
	public List<RegistrationEntity> getAll();
}
