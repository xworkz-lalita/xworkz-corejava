package com.xworkz.web.repository;

import java.util.List;

public interface RegistrationRepo<T> {
public void persist(T entity);
public T findByName(String name);
public T findByEmail(String email);
public List<T> findAll();
}
