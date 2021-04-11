package com.xworkz.waterfalls.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.waterfalls.entity.WaterFallsEntity;
import com.xworkz.waterfalls.sfsinglton.SFUtil;

public class SearchWaterFallDAOImpl extends WaterDaoImpl implements SearchWaterDAO {
	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public String findByLocationByName(String name) {
		try (Session session = factory.openSession()) {
			String hql = "select waterfall.location from WaterFallsEntity waterfall where waterfall.name=:nm";
			Query<String> query = session.createQuery(hql);
			query.setParameter("nm", name);
			return query.uniqueResult();
		
		}
	}

	@Override
	public int findNoOfDeathsByLocationAndName(String location, String name) {
		try (Session session = factory.openSession()) {
			String hql = "select waterfall.noOfDeath from WaterFallsEntity waterfall where waterfall.name=:nm AND waterfall.location=:loc";
			Query<Integer> query = session.createQuery(hql);
			query.setParameter("nm", name);
			query.setParameter("loc", location);
			int entity = query.uniqueResult();
			return entity;
		}

	}

	@Override
	public Object[] findNoOfDeathsAndDestinationByLocationAndName(String name, String location) {
		try (Session session = factory.openSession()) {
			String hql = "select waterfall.noOfDeath,waterfall.destination from WaterFallsEntity waterfall where waterfall.name=:nm AND waterfall.location=:loc";
			Query<Object[]> query = session.createQuery(hql);
			query.setParameter("nm", name);
			query.setParameter("loc", location);
			return query.uniqueResult();

		}
	}

	@Override
	public WaterFallsEntity findByLocationAndName(String name, String location) {
		try (Session session = factory.openSession()) {
			String hql = "select waterfall  from WaterFallsEntity waterfall where waterfall.name=:nm AND waterfall.location=:loc";
			Query<WaterFallsEntity> query = session.createQuery(hql);
			query.setParameter("nm", name);
			query.setParameter("loc", location);
			WaterFallsEntity entity = query.uniqueResult();
			return entity;
		}

	}
}