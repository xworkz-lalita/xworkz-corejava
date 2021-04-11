package com.xworkz.waterfalls.dao;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfalls.entity.StateEntity;
import com.xworkz.waterfalls.sfsinglton.SFUtil;

public class StateDAOImpl implements StateDAO {
	private List<StateEntity> entity;
	private SessionFactory factory = SFUtil.getFactory();

	public StateDAOImpl() {
		System.out.println("satateDao created" + this.getClass().getSimpleName());

	}

	@Override
	public void create(List<StateEntity> entities) {
		System.out.println("created list  state entities");
		Transaction transaction = null;
		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			for (StateEntity stateEntity : entities) {
				session.flush();
			}
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

	@Override
	public List<StateEntity> findAll() {
		try (Session session = factory.openSession()) {
			Query<StateEntity> query = session.createNamedQuery("findAll");
			return query.list();

		}
	}

	@Override
	public List<Integer> findAllIds() {
		try (Session session = factory.openSession()) {
			Query<Integer> query = session.createNamedQuery("findAllIds");
			List<Integer> list = query.list();
			return list;
		}

	}

	@Override
	public List<Object[]> findAllIdAndName() {
		try (Session session = factory.openSession()) {
			Query<Object[]> query = session.createNamedQuery("findAllIdAndName");
			return query.list();
		}
	}

	@Override
	public void updatePopulationByName(String name, int population) {
		Transaction transaction = null;
		try (Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			Query<Integer> query = session.createNamedQuery("updatePopulationByName");
			query.setParameter("pop", population);
			query.setParameter("nm", name);
			query.executeUpdate();
			session.getTransaction().commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}

	@Override
	public StateEntity findById(int id) {
		try (Session session = factory.openSession()) {
			// load will take the less time to execute compare to the get method
			StateEntity entity = session.load(StateEntity.class, id);
			System.out.println(entity);
			return entity;
		}
	}

	@Override
	public void deleteById(int id) {
		Transaction transaction = null;
		try (Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			Query<Integer> query = session.createNamedQuery("deleteById");
			query.setParameter("id", id);
			//execute and update will helps us to update in db
			query.executeUpdate();
			session.getTransaction().commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}

}
