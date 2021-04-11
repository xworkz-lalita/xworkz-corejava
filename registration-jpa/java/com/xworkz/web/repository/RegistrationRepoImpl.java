package com.xworkz.web.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.web.entity.RegistrationEntity;

public class RegistrationRepoImpl implements RegistrationRepo<RegistrationEntity> {

	@Override
	public void persist(RegistrationEntity entity) {
		System.out.println("Invoked save method");
		System.out.println("Entity" + entity);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

	@Override
	public RegistrationEntity findByName(String name) {
		System.out.println("invoked find by name method");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByName");
		query.setParameter("name", name);
		return (RegistrationEntity) query.getSingleResult();
	}

	@Override
	public RegistrationEntity findByEmail(String email) {
		System.out.println("invoked find by email method");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByEmail");
		query.setParameter("email", email);
		return (RegistrationEntity) query.getSingleResult();
	}

	@Override
	public List<RegistrationEntity> findAll() {
		System.out.println("invoked find by findAll method");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAll");
		List<RegistrationEntity> entity = query.getResultList();
		return entity;
	}

}
