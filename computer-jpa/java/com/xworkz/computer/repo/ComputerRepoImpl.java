package com.xworkz.computer.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.computer.entity.ComputerEntity;

public class ComputerRepoImpl implements ComputerRepo {
		public ComputerRepoImpl() {
			System.out.println("created " + this.getClass().getSimpleName());
		}

		@Override
		public void persist(ComputerEntity entity) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();
			manager.close();
			factory.close();
		}

		@Override
		public ComputerEntity findByName(String name) {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
			EntityManager manager=factory.createEntityManager();
			Query query=manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			 return (ComputerEntity) query.getSingleResult();
			
		}

		@Override
		public void DeleteById(int id) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			Query query=manager.createNamedQuery("deleteById");
			query.setParameter("id", id);
			query.executeUpdate();
			manager.getTransaction().commit();
			manager.close();
			factory.close();

		}

		@Override
		public List<ComputerEntity> getAll() {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
			EntityManager manager = factory.createEntityManager();
		Query query=manager.createNamedQuery("getAll");
		List<ComputerEntity> entity=query.getResultList();
		return entity;
		}

	}
