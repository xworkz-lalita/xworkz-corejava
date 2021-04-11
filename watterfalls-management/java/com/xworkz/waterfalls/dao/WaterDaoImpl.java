package com.xworkz.waterfalls.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfalls.entity.WaterFallsEntity;
import com.xworkz.waterfalls.sfsinglton.SFUtil;

public class WaterDaoImpl implements WaterDao {
	private SessionFactory factory = SFUtil.getFactory();

	public WaterDaoImpl() {
		System.out.println("created" + this.getClass());
	}

	@Override
	public void create(WaterFallsEntity entity) {
		System.out.println("created waterfallentity");
		System.out.println("entity" + entity);
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			System.out.println("commited successfully");
		}
	}

	@Override
	public void deleteById(int id) {
		System.out.println("ivoked delete by id");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterFallsEntity entity = session.get(WaterFallsEntity.class, id);
			if (entity != null) {
				System.out.println("entity is not null can delete");
			}
			session.delete(entity);
			transaction.commit();
			System.out.println("delted successfully");
		}

	}

	@Override
	public void updateHeightAndDepthById(int id, double height, double depth) {
		System.out.println("ivoked by update");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterFallsEntity entity = session.get(WaterFallsEntity.class, id);
			if (entity != null) {
				System.out.println("entity is not null can update");
				entity.setHeight(1232);
				entity.setDepth(1000);
				session.update(entity);
				transaction.commit();
				System.out.println("entity is update successfully");
			}
		}
	}

	@Override
	public WaterFallsEntity getById(int id) {
		System.out.println("ivoked by update");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterFallsEntity entity = session.get(WaterFallsEntity.class, id);
			if (entity != null) {
				System.out.println("entity is not null can get");
			}
			transaction.commit();
			System.out.println("get success");
			return entity;
		}

	}
}
